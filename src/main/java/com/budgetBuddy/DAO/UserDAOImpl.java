package com.budgetBuddy.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.budgetBuddy.entities.User;

@Repository
public class UserDAOImpl implements UserDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public User findByEmail(String email) {
		// Get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// Read from the database using the given email
		Query<User> query = currentSession.createQuery("from User where email=:email", User.class);
		query.setParameter("email", email);
		User user = null;
		try {
			user = query.getSingleResult();
		} catch (Exception e) {
			user = null;
		}
		return user;
	}
	
	@Override
	public void save(User user) {
		// Get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// Save the user account
		currentSession.saveOrUpdate(user);
	}
}