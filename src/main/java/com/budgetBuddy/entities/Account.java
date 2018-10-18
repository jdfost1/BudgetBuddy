package com.budgetBuddy.entities;


	import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

	@Entity
	@Table(name="accounts")
	public class Account {
		
		@Id
		@Column(name="email",unique=true,length=100,nullable=false)
		private String email; //primary key
		@Column(name="firstname",length=100,nullable=false)
		private String firstName;
		@Column(name="lastname",length=100,nullable=false)
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

	}
