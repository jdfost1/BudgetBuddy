package com.budgetBuddy.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.budgetBuddy.entities.User;
import com.budgetBuddy.model.UserRegistration;

public interface UserService extends UserDetailsService {
	
	User findByEmail(String email);
	
	void save(UserRegistration userRegistration);
}
