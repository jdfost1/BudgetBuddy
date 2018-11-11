package com.budgetBuddy.service;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.budgetBuddy.DAO.UserDAO;
import com.budgetBuddy.entities.Role;
import com.budgetBuddy.entities.User;
import com.budgetBuddy.model.UserRegistration;

@Service
public class UserServiceImpl implements UserService {

	private static final boolean ENABLED_BY_DEFAULT = true;
	
	@Autowired
	private UserDAO userDAO;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	
	@Override
	@Transactional
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		User user = userDAO.findByEmail(email);
		if (user == null) {
			throw new UsernameNotFoundException("Invalid username or password.");
		}
		return new org.springframework.security.core.userdetails.User(user.getEmail(),
				user.getPassword(), mapRolesToAuthorities(user.getRoles()));
	}

	@Override
	@Transactional
	public User findByEmail(String email) {
		return userDAO.findByEmail(email);
	}

	@Override
	@Transactional
	public void save(UserRegistration registration) {
		User user = new User();
		Role[] roles = { new Role(1, "USER") };
		
		user.setEmail(registration.getEmail());
		user.setPassword(passwordEncoder.encode(registration.getPassword()));
		user.setEnabled(ENABLED_BY_DEFAULT);
		user.setRoles(Arrays.asList(roles));
		user.setName(registration.getName());
		user.setAge(registration.getAge());
		
		userDAO.save(user);
	}
	
	private Collection<? extends GrantedAuthority> mapRolesToAuthorities(Collection<Role> roles) {
		return roles.stream().map(role -> new SimpleGrantedAuthority(role.getName())).collect(Collectors.toList());
	}
}
