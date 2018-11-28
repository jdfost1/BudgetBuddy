package com.budgetBuddy.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.budgetBuddy.entities.Budget;
import com.budgetBuddy.entities.User;

@Repository
@Transactional
public class BudgetDAOImpl {

	public static void saveBudget(Budget budget) {

		// create session factory
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Budget.class)
				.buildSessionFactory();

		// create session
		Session session = factory.getCurrentSession();
		try {

			// start transaction
			session.beginTransaction();

			// save budget object to database
			System.out.println("save the budget object..");
			session.saveOrUpdate(budget);

			// commit transaction
			session.getTransaction().commit();
			System.out.println("done");
		} finally {
			factory.close();
		}

	}
	public static Budget findByEmail(String email) {

		// create session factory
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Budget.class)
				.buildSessionFactory();
	
		// create session
		Session currentSession = factory.getCurrentSession();
		
			// start transaction
			currentSession.beginTransaction();
			
		
		
//		// Read from the database using the given email
		Query<Budget> query = currentSession.createQuery("from Budget where email=:email", Budget.class);
		query.setParameter("email", email);
		System.out.println("EMAIL:"+ email );
		Budget budget = null;
		try {
			budget = query.getSingleResult();
		} catch (Exception e) {
			budget = null;
			System.out.println("BUDGET NOT FOUND");
		}
		return budget;
		
		
	}

}
