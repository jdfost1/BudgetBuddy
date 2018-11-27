package com.budgetBuddy.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.budgetBuddy.entities.Budget;

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

}
