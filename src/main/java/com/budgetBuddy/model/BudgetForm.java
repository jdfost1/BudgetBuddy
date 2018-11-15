package com.budgetBuddy.model;

import org.springframework.context.annotation.Scope;

@Scope("session")
public class BudgetForm {
	//values collected from user to use for budget
	private double income;
	private double savingsTarget;
	private double rent;
	private double carPayment;
	private double carInsurance;
	private double utilities;
	private double remainingExpenses;
	

	//getters and setters
	public double getIncome() {
		return income;
	}

	public void setIncome(double income) {
		this.income = income;
	}

	public double getSavingsTarget() {
		return savingsTarget;
	}

	public void setSavingsTarget(double savingsTarget) {
		this.savingsTarget = savingsTarget;
	}

	public double getRent() {
		return rent;
	}

	public void setRent(double rent) {
		this.rent = rent;
	}

	public double getCarPayment() {
		return carPayment;
	}

	public void setCarPayment(double carPayment) {
		this.carPayment = carPayment;
	}

	public double getCarInsurance() {
		return carInsurance;
	}

	public void setCarInsurance(double carInsurance) {
		this.carInsurance = carInsurance;
	}

	public double getUtilities() {
		return utilities;
	}

	public void setUtilities(double utilities) {
		this.utilities = utilities;
	}

	public double getRemainingExpenses() {
		return remainingExpenses;
	}

	public void setRemainingExpenses(double remainingExpenses) {
		this.remainingExpenses = remainingExpenses;
	}



}
