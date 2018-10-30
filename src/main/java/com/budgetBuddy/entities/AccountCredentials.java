package com.budgetBuddy.entities;


	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.Id;
	import javax.persistence.Table;


		@Entity
		@Table(name="accountCredentials")
		public class AccountCredentials {
			@Id
			@Column(name="email",unique=true,length=100,nullable=false)
			private String email; //primary key
			
			@Column(name="password",length=100,nullable=false)
			private String password;
			
			public String getEmail() {
				return email;
			}

			public void setEmail(String email) {
				this.email = email;
			}

			public String getPassword() {
				return password;
			}

			public void setPassword(String password) {
				this.password = password;
			}

			

}
