package com.budgetBuddy.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.budgetBuddy.entities.Budget;


public class BudgetDAOImpl implements BudgetDAO{
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void addCurrentBudget(Budget budget) {
		// Get the current hibernate session
				Session currentSession = sessionFactory.getCurrentSession();
				
				// Save the budget to the database
				currentSession.saveOrUpdate(budget);
		
	}
	

}
