package com.budgetBuddy.client;

import com.budgetBuddy.entities.Account;
import com.budgetBuddy.util.HibernateUtil;
import org.hibernate.Session;

public class ClientTest {

	public static void main(String[] args) {
	    try(Session session = HibernateUtil.getSessionFactory().openSession()) {
			Account account = getAccount();
			//begin with making changes to database
			session.beginTransaction();
			//save object to database
			session.persist(account);
			
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	    
	   
	  
	  }//end of main
	 private static Account getAccount() {
		 Account account = new Account();
		 account.setEmail("jf_foster05@yahoo.com");
		 account.setFirstName("Josh");
		 account.setLastName("Foster");
		 account.setAge(27);
		 account.setSalary("40000");
		 
		 return account;
	 }
}
