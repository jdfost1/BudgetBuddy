package com.budgetBuddy.service;

public interface EmailService {

	String generateTemporaryPassword();
	
	void sendSimpleMessage(String to, String subject, String text);
}
