package com.budgetBuddy.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.budgetBuddy.entities.Account;
import com.budgetBuddy.entities.Budget;


public class BudgetDA {
	public static void addBudget(Budget budget) {

		//create session factory
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Account.class)
				.buildSessionFactory();
		
		//create session
		Session session = factory.getCurrentSession();
		try {
			
			
			//start transaction
			session.beginTransaction();
			
			
			//save the account object
			System.out.println("save the account object..");
			session.save(budget);
			
			
			//commit transaction
			session.getTransaction().commit();
			System.out.println("done");
		}
		finally{
			factory.close();
			}
	}//end of add account

}
