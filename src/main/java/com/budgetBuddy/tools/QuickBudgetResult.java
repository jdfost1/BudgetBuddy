package com.budgetBuddy.tools;




public class QuickBudgetResult {
	private double rentValue;
	private double funValue;
	private double educationValue;
	private double otherBillsValue;
	private double retirementValue;
	private double savingsValue;
	
	
	public QuickBudgetResult(QuickBudget budget) {
		double budgetIncome = budget.getIncome()/12;
		rentValue = budgetIncome * .3;
		funValue = budgetIncome * .1;
		educationValue = budgetIncome * .1;
		otherBillsValue = budgetIncome * .25;
		retirementValue = budgetIncome * .1;
		savingsValue = budgetIncome * .1;
		
	}
	public double getRentValue() {
		return rentValue;
	}
	public double getFunValue() {
		return funValue;
	}
	public double getEducationValue() {
		return educationValue;
	}
	public double getOtherBillsValue() {
		return otherBillsValue;
	}
	public double getRetirementValue() {
		return retirementValue;
	}
	public double getSavingsValue() {
		return savingsValue;
	}
	

}
