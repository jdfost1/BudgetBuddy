package com.budgetBuddy.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.budgetBuddy.entities.Budget;

@Repository
@Transactional
public class BudgetDAOImpl{
	@Autowired
	private SessionFactory sessionFactory;
	
	public static void saveBudget(Budget budget) {
		
		// Get the current hibernate session
			//	Session currentSession = sessionFactory.getCurrentSession();
				
				// Save the budget to the database
				//currentSession.saveOrUpdate(budget);
		
	}
	public Session setSession() {
		Session currentSession = sessionFactory.getCurrentSession();
		return currentSession;
	}
	
}
