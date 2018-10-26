package com.budgetBuddy.test;

import com.budgetBuddy.entities.Account;
import com.budgetBuddy.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class AccountTest {

	public static void main(String[] args) {
		
		//create session factory
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Account.class)
				.buildSessionFactory();
		
		//create session
		Session session = factory.getCurrentSession();
		try {
			//use the session object to save Java object
			
			//create account object
			System.out.println("Creating new account object");
			Account account1 = getAccount();
			Account account2 = getAccount2();
			
			//start transaction
			session.beginTransaction();
			
			
			//save the account object
			System.out.println("save the account object..");
			session.save(account1);
			session.save(account2);
			
			//commit transaction
			session.getTransaction().commit();
			System.out.println("done");
		}
		finally{
			factory.close();
			}

	  
	  }//end of main
	
	//method to create dummy account to test in database save above
	 private static Account getAccount() {
		 Account account = new Account();
		 account.setEmail("johndoe6@gmail.com");
		 account.setFirstName("Jimmy");
		 account.setLastName("Foster");
		 account.setAge(27);
		 account.setSalary("40000");
		 
		 return account;
	 }//end of get account
	 private static Account getAccount2() {
		 Account account = new Account();
		 account.setEmail("jf_foster05@gmail.com");
		 account.setFirstName("Josh");
		 account.setLastName("Foster");
		 account.setAge(27);
		 account.setSalary("40000");
		 
		 return account;
	 }//end of get account
}
