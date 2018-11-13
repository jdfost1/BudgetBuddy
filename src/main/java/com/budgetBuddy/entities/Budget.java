package com.budgetBuddy.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table(name = "budgets")
public class Budget {
	@Id
	@Column(name = "email", unique = true, length = 100, nullable = false)
	private String email; // primary key

	@Column(name = "savingsTarget")
	private double savingsTarget;
	
	@Column(name = "rent")
	private double rent;

	@Column(name = "carPayment")
	private double carPayment;
	

	@Column(name = "carInsurance")
	private double carInsurance;
	

	@Column(name = "utilities")
	private double utilities;

	@Column(name = "generalSavings")
	private double generalSavings;
	

	@Column(name = "Spending")
	private double spending;

	@Column(name = "retirement")
	private double retirement;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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
