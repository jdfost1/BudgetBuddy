package com.budgetBuddy.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserRegistration {
	
	@NotNull
	@Size(max = 50)
	@Email
	private String email;
	
	@NotNull
	@Size(min = 1)
	private String password;
	
	@NotNull
	@Size(min = 1)
	private String matchingPassword;
	
	@NotNull
	@Size(min = 1, max = 50)
	private String name;
	
	@NotNull
	@Min(1)
	private Integer age;

	
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

	public String getMatchingPassword() {
		return matchingPassword;
	}

	public void setMatchingPassword(String matchingPassword) {
		this.matchingPassword = matchingPassword;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
}
