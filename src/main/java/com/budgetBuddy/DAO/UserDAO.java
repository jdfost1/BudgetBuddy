package com.budgetBuddy.DAO;

import com.budgetBuddy.entities.User;

public interface UserDAO {

	User findByEmail(String email);
	
	void save(User user);
	
	void delete(User user);
}