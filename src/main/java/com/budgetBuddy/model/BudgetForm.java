package com.budgetBuddy.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.springframework.context.annotation.Scope;

@Scope("session")
public class BudgetForm {
	
	@NotNull
	@Min(0)
	private Double income;
	
	@NotNull
	@Min(0)
	private Double savingsTarget;
	
	@NotNull
	@Min(0)
	private Double rent;
	
	@NotNull
	@Min(0)
	private Double carPayment;
	
	@NotNull
	@Min(0)
	private Double carInsurance;
	
	@NotNull
	@Min(0)
	private Double utilities;
	
	@NotNull
	@Min(0)
	private Double remainingExpenses;
	

	public Double getIncome() {
		return income;
	}

	public void setIncome(Double income) {
		this.income = income;
	}

	public Double getSavingsTarget() {
		return savingsTarget;
	}

	public void setSavingsTarget(Double savingsTarget) {
		this.savingsTarget = savingsTarget;
	}

	public Double getRent() {
		return rent;
	}

	public void setRent(Double rent) {
		this.rent = rent;
	}

	public Double getCarPayment() {
		return carPayment;
	}

	public void setCarPayment(Double carPayment) {
		this.carPayment = carPayment;
	}

	public Double getCarInsurance() {
		return carInsurance;
	}

	public void setCarInsurance(Double carInsurance) {
		this.carInsurance = carInsurance;
	}

	public Double getUtilities() {
		return utilities;
	}

	public void setUtilities(Double utilities) {
		this.utilities = utilities;
	}

	public Double getRemainingExpenses() {
		return remainingExpenses;
	}

	public void setRemainingExpenses(Double remainingExpenses) {
		this.remainingExpenses = remainingExpenses;
	}



}
