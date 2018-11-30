package com.budgetBuddy.model;

import javax.validation.constraints.NotNull;

public class UserPasswordUpdate {

	@NotNull
	private String currentPassword;
	
	@NotNull
	private String newPassword;
	
	@NotNull
	private String matchingNewPassword;

	
	public String getCurrentPassword() {
		return currentPassword;
	}

	public void setCurrentPassword(String currentPassword) {
		this.currentPassword = currentPassword;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	public String getMatchingNewPassword() {
		return matchingNewPassword;
	}

	public void setMatchingNewPassword(String matchingNewPassword) {
		this.matchingNewPassword = matchingNewPassword;
	}
}
