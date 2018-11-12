package com.budgetBuddy.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.budgetBuddy.entities.User;
import com.budgetBuddy.model.UserRegistration;
import com.budgetBuddy.model.UserUpdate;

public interface UserService extends UserDetailsService {
	
	User findByEmail(String email);
	
	void save(UserRegistration userRegistration);
	
	void save(User user, UserUpdate userUpdate);
	
	void delete(User user);
}
