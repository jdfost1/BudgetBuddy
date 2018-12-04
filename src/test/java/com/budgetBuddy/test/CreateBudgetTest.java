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
import com.budgetBuddy.model.BudgetForm;


public class CreateBudgetTest {

	private static Validator validator;
	private BudgetForm testBudget;
	
	@BeforeClass
	public static void setUpClass() {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		validator = factory.getValidator();
	}
	
	@Before
	public void setUp() {
		testBudget = new BudgetForm();
		testBudget.setIncome(1800.0);
		testBudget.setCarPayment(200.0);
		testBudget.setCarInsurance(100.0);
		testBudget.setRemainingExpenses(250.0);
		testBudget.setRent(750.0);
		testBudget.setSavingsTarget(250.0);
		testBudget.setUtilities(100.0);
		
	}
	
	@After
	public void tearDown() {
		testBudget = null;
	}
	
	@Test
	public void testBudgetFormValid() {
		Set<ConstraintViolation<BudgetForm>> violations = validator.validate(testBudget);
		assertTrue(violations.isEmpty());
	}
	
	@Test
	public void testBudgetFormEmpty() {
		BudgetForm reg = new BudgetForm();
		Set<ConstraintViolation<BudgetForm>> violations = validator.validate(reg);
		assertFalse(violations.isEmpty());
	}
	
	//test all fields with negative values---------------
	
	@Test
	public void testCarInsuranceNegative() {
		testBudget.setCarInsurance(-100.0);
		Set<ConstraintViolation<BudgetForm>> violations = validator.validate(testBudget);
		assertFalse(violations.isEmpty());
	}
	@Test
	public void testCarPaymentNegative() {
		testBudget.setCarPayment(-100.0);
		Set<ConstraintViolation<BudgetForm>> violations = validator.validate(testBudget);
		assertFalse(violations.isEmpty());
	}
	@Test
	public void testIncomeNegative() {
		testBudget.setIncome(-100.0);
		Set<ConstraintViolation<BudgetForm>> violations = validator.validate(testBudget);
		assertFalse(violations.isEmpty());
	}
	@Test
	public void testRemainingExpensesNegative() {
		testBudget.setRemainingExpenses(-100.0);
		Set<ConstraintViolation<BudgetForm>> violations = validator.validate(testBudget);
		assertFalse(violations.isEmpty());
	}
	@Test
	public void testRentNegative() {
		testBudget.setRent(-100.0);
		Set<ConstraintViolation<BudgetForm>> violations = validator.validate(testBudget);
		assertFalse(violations.isEmpty());
	}
	@Test
	public void testSavingsTargetNegative() {
		testBudget.setSavingsTarget(-100.0);
		Set<ConstraintViolation<BudgetForm>> violations = validator.validate(testBudget);
		assertFalse(violations.isEmpty());
	}
	@Test
	public void testUtilitiesNegative() {
		testBudget.setUtilities(-100.0);
		Set<ConstraintViolation<BudgetForm>> violations = validator.validate(testBudget);
		assertFalse(violations.isEmpty());
	}
}

