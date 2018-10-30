package com.budgetBuddy.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

	@Entity
	@Table(name="accounts")
	public class Account {
	
		
		@Id
		@Column(name="email",unique=true,length=100,nullable=false)
		private String email; //primary key
		
		@Column(name="firstName",length=100,nullable=false)
		private String firstName;
		
		@Column(name="lastName",length=100,nullable=false)
		private String lastName;
		
		@Column(name="salary",length=100,nullable=false)
		private String salary;
		
		@Column(name="age",length=100,nullable=false)
		private int age;
		
		
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getSalary() {
			return salary;
		}
		public void setSalary(String salary) {
			this.salary = salary;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public static void addAccount(Account newAccount) {

			//create session factory
			SessionFactory factory = new Configuration()
					.configure("hibernate.cfg.xml")
					.addAnnotatedClass(Account.class)
					.buildSessionFactory();
			
			//create session
			Session session = factory.getCurrentSession();
			try {
				//use the session object to save Java object
				
	
				
				
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

	}
