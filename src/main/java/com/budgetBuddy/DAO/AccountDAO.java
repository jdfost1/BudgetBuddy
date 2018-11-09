package com.budgetBuddy.DAO;

import com.budgetBuddy.entities.Account;
import com.budgetBuddy.entities.User;

public interface AccountDAO {

	User findByEmail(String email);
	
	void save(Account account);
}