package com.budgetBuddy.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.budgetBuddy.entities.Account;

import com.budgetBuddy.entities.Users;

public class AccountDA {
	public static void addAccount(Account newAccount) {

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
			session.save(newAccount);
			
			
			//commit transaction
			session.getTransaction().commit();
			System.out.println("done");
		}
		finally{
			factory.close();
			}
	}//end of add account
	public static void addLogin(Users newCredentials) {
		
		//create session factory
				SessionFactory factory = new Configuration()
						.configure("hibernate.cfg.xml")
						.addAnnotatedClass(Users.class)
						.buildSessionFactory();
				
				//create session
				Session session = factory.getCurrentSession();
				try {
					
					
					//start transaction
					session.beginTransaction();
					
					
					//save the account object
					System.out.println("save the User object..");
					session.save(newCredentials);
					
					
					//commit transaction
					session.getTransaction().commit();
					System.out.println("done");
				}
				finally{
					factory.close();
					}
	}

}
