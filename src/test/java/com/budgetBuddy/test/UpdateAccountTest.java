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

import com.budgetBuddy.model.UserUpdate;

public class UpdateAccountTest {

	private static Validator validator;
	private UserUpdate update;
	
	@BeforeClass
	public static void setUpClass() {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		validator = factory.getValidator();
	}
	
	@Before
	public void setUp() {
		update = new UserUpdate();
		update.setEmail("jason@example.com");
		update.setName("Jason");
		update.setAge(24);
	}
	
	@After
	public void tearDown() {
		update = null;
	}
	
	@Test
	public void testUserUpdateValid() {
		assertTrue(isValid(update));
	}
	
	@Test
	public void testUserUpdateEmpty() {
		UserUpdate userUpdate = new UserUpdate();
		assertFalse(isValid(userUpdate));
	}
	
	@Test
	public void testUserUpdateBadEmail() {
		update.setEmail("jason@");
		assertFalse(isValid(update));
	}
	
	@Test
	public void testUserUpdateNoName() {
		update.setName(null);
		assertFalse(isValid(update));
	}
	
	@Test
	public void testUserUpdateNegativeAge() {
		update.setAge(-24);
		assertFalse(isValid(update));
	}
	
	private boolean isValid(UserUpdate userUpdate) {
		Set<ConstraintViolation<UserUpdate>> violations = validator.validate(userUpdate);
		return violations.isEmpty();
	}
}
