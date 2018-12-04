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

import com.budgetBuddy.model.UserDelete;

public class DeleteAccountTest {

	private static Validator validator;
	private UserDelete delete;
	
	@BeforeClass
	public static void setUpClass() {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		validator = factory.getValidator();
	}
	
	@Before
	public void setUp() {
		delete = new UserDelete();
		delete.setEmail("billy@example.com");
	}
	
	@After
	public void tearDown() {
		delete = null;
	}
	
	@Test
	public void testUserDeleteValid() {
		assertTrue(isValid(delete));
	}
	
	@Test
	public void testUserDeleteEmpty() {
		UserDelete userDelete = new UserDelete();
		assertFalse(isValid(userDelete));
	}
	
	@Test
	public void testUserDeleteBadEmail() {
		delete.setEmail("billy$#aol.com");
		assertFalse(isValid(delete));
	}
	
	private boolean isValid(UserDelete userDelete) {
		Set<ConstraintViolation<UserDelete>> violations = validator.validate(userDelete);
		return violations.isEmpty();
	}
}
