package com.budgetBuddy.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table(name = "budgets")
public class CurrentBudget {
	@Id
	@Column(name = "email", unique = true, length = 100, nullable = false)
	private String email; // primary key

	@Column(name = "salary")
	private double salary;

	@Column(name = "savingsTarget")
	private double savingsTarget;

	@Column(name = "fixedRent")
	private double fixedRent;

	@Column(name = "fixedBills")
	private double fixedBills;

	@Column(name = "monthlyExpenses")
	private double monthlyExpenses;

	@Column(name = "monthlyIncome")
	private double monthlyIncome;

	@Column(name = "monthlyLeftOverIncome")
	private double monthlyLeftOverIncome;

	@Column(name = "totalMonthsSavingsTarget")
	private double totalMonthsSavingsTarget;

	@Column(name = "tenPercentMonths")
	private double tenPercentMonths;

	@Column(name = "twentyPercentMonths")
	private double twentyPercentMonths;

	@Column(name = "thirtyPercentMonths")
	private double thirtyPercentMonths;

	@Column(name = "fortyPercentMonths")
	private double fortyPercentMonths;

	@Column(name = "fiftyPercentMonths")
	private double fiftyPercentMonths;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getSavingsTarget() {
		return savingsTarget;
	}

	public void setSavingsTarget(double savingsTarget) {
		this.savingsTarget = savingsTarget;
	}

	public double getFixedRent() {
		return fixedRent;
	}

	public void setFixedRent(double fixedRent) {
		this.fixedRent = fixedRent;
	}

	public double getFixedBills() {
		return fixedBills;
	}

	public void setFixedBills(double fixedBills) {
		this.fixedBills = fixedBills;
	}

	public double getMonthlyExpenses() {
		return monthlyExpenses;
	}

	public void setMonthlyExpenses(double monthlyExpenses) {
		this.monthlyExpenses = monthlyExpenses;
	}

	public double getMonthlyIncome() {
		return monthlyIncome;
	}

	public void setMonthlyIncome(double monthlyIncome) {
		this.monthlyIncome = monthlyIncome;
	}

	public double getMonthlyLeftOverIncome() {
		return monthlyLeftOverIncome;
	}

	public void setMonthlyLeftOverIncome(double monthlyLeftOverIncome) {
		this.monthlyLeftOverIncome = monthlyLeftOverIncome;
	}

	public double getTotalMonthsSavingsTarget() {
		return totalMonthsSavingsTarget;
	}

	public void setTotalMonthsSavingsTarget(double totalMonthsSavingsTarget) {
		this.totalMonthsSavingsTarget = totalMonthsSavingsTarget;
	}

	// calculate money leftover after monthly fixed expenses
	public void calculateLeftOverIncome() {
		monthlyIncome = salary / 12;
		monthlyExpenses = fixedRent + fixedBills;

		monthlyLeftOverIncome = monthlyIncome - monthlyExpenses;

	}

	public void calculateSavings() {

	}

	// calculate number of months to hit goal by using all of left over income
	public void calculateSavingsGoalMonths() {
		totalMonthsSavingsTarget = savingsTarget / monthlyLeftOverIncome;

	}
	
	//calculate number of months to hit savings target based off %10,%20,%30,%40,or %50 of user's leftover monthly income

	public void calculateTenPercentMonths() {
		tenPercentMonths = savingsTarget / (monthlyLeftOverIncome * .1);
	}

	public void calculateTwentyPercentMonths() {
		twentyPercentMonths = savingsTarget / (monthlyLeftOverIncome * .2);
	}

	public void calculateThirtyPercentMonths() {
		thirtyPercentMonths = savingsTarget / (monthlyLeftOverIncome * .3);
	}

	public void calculateFortyPercentMonths() {
		fortyPercentMonths = savingsTarget / (monthlyLeftOverIncome * .4);
	}

	public void calculateFiftyPercentMonths() {
		fiftyPercentMonths = savingsTarget / (monthlyLeftOverIncome * .5);
	}

	public void calculateBudget(double income, double savingsGoal, double fixedRent, double fixedBills) {
		// calculate monthly budget based on user's savings goal and fixed expenses
	}

}
