package com.budgetBuddy.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.budgetBuddy.model.UserRegistration;

public class CreateAccountTest {

	private static Validator validator;
	private UserRegistration registration;
	
	@BeforeClass
	public static void setUpClass() {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		validator = factory.getValidator();
	}
	
	@Before
	public void setUp() {
		registration = new UserRegistration();
		registration.setEmail("john234@example.com");
		registration.setPassword("pass");
		registration.setMatchingPassword("pass");
		registration.setName("johnny");
		registration.setAge(40);
	}
	
	@After
	public void tearDown() {
		registration = null;
	}
	
	@Test
	public void testUserRegistrationValid() {
		Set<ConstraintViolation<UserRegistration>> violations = validator.validate(registration);
		assertTrue(violations.isEmpty());
	}
	
	@Test
	public void testUserRegistrationEmpty() {
		UserRegistration reg = new UserRegistration();
		Set<ConstraintViolation<UserRegistration>> violations = validator.validate(reg);
		assertFalse(violations.isEmpty());
	}
	
	@Test
	public void testUserRegistrationBadEmail() {
		registration.setEmail("john234");
		Set<ConstraintViolation<UserRegistration>> violations = validator.validate(registration);
		assertFalse(violations.isEmpty());
	}
	
	@Test
	public void testUserRegistrationNegativeAge() {
		registration.setAge(-40);
		Set<ConstraintViolation<UserRegistration>> violations = validator.validate(registration);
		assertFalse(violations.isEmpty());
	}
	
	@Test
	public void testUserRegistrationPasswordsNotMatch() {
		registration.setMatchingPassword("pass1");
		Set<ConstraintViolation<UserRegistration>> violations = validator.validate(registration);
		assertFalse(violations.isEmpty());
	}
}
