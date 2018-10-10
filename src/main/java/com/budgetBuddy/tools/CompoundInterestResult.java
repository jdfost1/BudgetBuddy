package com.budgetBuddy.tools;

public class CompoundInterestResult {

	private double value;
	
	public CompoundInterestResult(CompoundInterest compoundInterest) {
		value = compoundInterest.getStartingBalance() 
				* Math.pow(1 + compoundInterest.getAnnualRateOfReturn()/100,
						compoundInterest.getTimeYears());
	}
	
	public double getValue() {
		return value;
	}
}
