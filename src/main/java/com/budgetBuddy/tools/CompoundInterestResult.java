package com.budgetBuddy.tools;

/**
 * CompoundInterestResult is constructed by using a CompoundInterest object. It calculates
 * the resulting amount of compound interest given the fields of the CompoundInterest 
 * object.
 */
public class CompoundInterestResult {

	/**
	 * Resulting amount from compounding interest.
	 */
	private Double amount;
	
	/**
	 * Create a CompoundInterestResult object by calculating the compound interest using the fields 
	 * of the CompoundInterest object.
	 * @param interest Compound interest object
	 */
	public CompoundInterestResult(CompoundInterest interest) {
		int n = interest.getCompoundsPerYear();
		amount = interest.getPrincipal() * Math.pow(1 + interest.getInterestRate()/(100*n), n*interest.getYears());
	}
	
	/**
	 * Get the compound interest amount.
	 * @return amount
	 */
	public double getAmount() {
		return amount;
	}
}
