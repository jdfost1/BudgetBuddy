package com.budgetBuddy.tools;

public class QuickBudget {
	
	
	
	private double rent;
	private double savings;
	private double donations;
	private double education;
	private double fun;
	private double retirement;
	private double otherBills;
	

	public double getRent() {
		return rent;
	}

	public void setRent(double rent) {
		this.rent = rent;
	}

	public double getSavings() {
		return savings;
	}

	public void setSavings(double savings) {
		this.savings = savings;
	}

	public double getDonations() {
		return donations;
	}

	public void setDonations(double donations) {
		this.donations = donations;
	}

	public double getEducation() {
		return education;
	}

	public void setEducation(double education) {
		this.education = education;
	}

	public double getFun() {
		return fun;
	}

	public void setFun(double fun) {
		this.fun = fun;
	}

	public double getRetirement() {
		return retirement;
	}

	public void setRetirement(double retirement) {
		this.retirement = retirement;
	}

	public double getOtherBills() {
		return otherBills;
	}

	public void setOtherBills(double otherBills) {
		this.otherBills = otherBills;
	}



	public void calculateQuickBudget(double income) {
		savings = income*.1;
		retirement = income*.10;
		fun = income * .1;
		rent = income *.3;
		otherBills = income *.25;
		donations = income * .05;
		education = income * .1;
	}
}

