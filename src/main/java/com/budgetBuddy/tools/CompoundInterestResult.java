package com.budgetBuddy.tools;

public class CompoundInterestResult {

	private Double amount;
	
	public CompoundInterestResult(CompoundInterest interest) {
		int n = interest.getCompoundsPerYear();
		amount = interest.getPrincipal() * Math.pow(1 + interest.getInterestRate()/n, n*interest.getYears());
	}
	
	public double getAmount() {
		return amount;
	}
}
