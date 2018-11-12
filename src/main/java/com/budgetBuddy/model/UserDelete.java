package com.budgetBuddy.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserDelete {
	
	@NotNull
	@Size(min = 1, max = 50)
	@Email	
	private String email;
	
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
}
