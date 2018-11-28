package com.budgetBuddy.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.security.core.context.SecurityContextHolder;

import com.budgetBuddy.model.BudgetForm;
import com.budgetBuddy.model.SavingsTarget;

import javax.persistence.Column;

@Entity
@Table(name = "budget")
public class Budget {
	@Id
	@Column(name = "email")//primary key
	private String email;

	@Column(name = "savings_target")
	private double savingsTarget;

	@Column(name = "rent")
	private double rent;

	@Column(name = "car_payment")
	private double carPayment;

	@Column(name = "car_insurance")
	private double carInsurance;

	@Column(name = "utilities")
	private double utilities;

	@Column(name = "general_savings")
	private double generalSavings;

	@Column(name = "spending")
	private double spending;

	@Column(name = "retirement")
	private double retirement;

	@Column(name = "remaining_expenses")
	private double remainingExpenses;

	public void createBudget(SavingsTarget savingsTarget, BudgetForm budgetForm) {
		// set budget model with values from budget form
		this.rent = budgetForm.getRent();
		this.carPayment = budgetForm.getCarPayment();
		this.carInsurance = budgetForm.getCarInsurance();
		this.utilities = budgetForm.getUtilities();
		this.remainingExpenses = budgetForm.getRemainingExpenses();
		this.savingsTarget = savingsTarget.getMonthlySavingsTarget();
		this.email = SecurityContextHolder.getContext().getAuthentication().getName();

		//calculate monthly leftover income after subtracting user's monthly savings target
		double monthlyIncome = budgetForm.getIncome()/12;
		double monthlyExpenses = this.rent + this.carPayment + this.carInsurance + this.utilities + this.remainingExpenses;
		double leftOver = monthlyIncome - monthlyExpenses;
		leftOver = leftOver - this.savingsTarget;
		
		

		// calculate remaining budget categories with the remaining leftover
		this.retirement = leftOver * .2;
		this.spending = leftOver * .5;
		this.generalSavings = leftOver * .3;

	}//end of calculate budget

	// getters and setters--------------------------------------------------------------------------------
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email= email;
	}

	public double getRemainingExpenses() {
		return remainingExpenses;
	}

	public void setRemainingExpenses(double remainingExpenses) {
		this.remainingExpenses = remainingExpenses;
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

	public double getGeneralSavings() {
		return generalSavings;
	}

	public void setGeneralSavings(double generalSavings) {
		this.generalSavings = generalSavings;
	}

	public double getSpending() {
		return spending;
	}

	public void setSpending(double spending) {
		this.spending = spending;
	}

	public double getRetirement() {
		return retirement;
	}

	public void setRetirement(double retirement) {
		this.retirement = retirement;
	}

}
