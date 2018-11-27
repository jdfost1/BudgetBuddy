package com.budgetBuddy.service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailService {

	private static final int TEMP_PWD_LENGTH = 12;
	
	private Random random;
	
	@Autowired
	private JavaMailSender mailSender;

	public EmailServiceImpl() {
		random = new Random();
	}
	
	@Override
	public String generateTemporaryPassword() {
		String s = "";
		for (int i = 0; i < TEMP_PWD_LENGTH; i++) {
			int n = random.nextInt(93) + 33;
			s += (char) n;
		}
		return s;
	}
	
	@Override
	public void sendSimpleMessage(String to, String subject, String text) {
		SimpleMailMessage message =  new SimpleMailMessage();
		message.setTo(to);
		message.setSubject(subject);
		message.setText(text);
		
		mailSender.send(message);
	}
}
