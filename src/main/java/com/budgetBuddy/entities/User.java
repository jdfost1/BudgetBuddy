package com.budgetBuddy.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User {
	private String username;
	private String password;

}
