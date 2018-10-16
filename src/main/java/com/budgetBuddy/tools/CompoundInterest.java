package com.budgetBuddy.tools;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import static com.budgetBuddy.validation.CompoundInterestValidation.REQUIRED;
import static com.budgetBuddy.validation.CompoundInterestValidation.MIN_0;
import static com.budgetBuddy.validation.CompoundInterestValidation.MIN_1;

/**
 * CompoundInterest has fields for everything necessary to calculate compound interest,
 * including: the principal amount, the annual interest rate, the number of times per
 * year that interest is compounded and the number of years it is compounded for. To 
 * calculate the resulting amount, pass an instance of this class to the constructor
 * of CompoundInterestResult.
 */
public class CompoundInterest {
	
	/**
	 * Amount of money at the beginning.
	 */
	@NotNull(message = REQUIRED)
	@Min(value = 0, message = MIN_0)
	private Double principal;
	
	/**
	 * Annual interest rate as a percentage.
	 */
	@NotNull(message = REQUIRED)
	@Min(value = 0, message = MIN_0)
	private Double interestRate;
	
	/**
	 * Number of times that interest is compound per year.
	 */
	@NotNull(message = REQUIRED)
	@Min(value = 1, message = MIN_1)
	private Integer compoundsPerYear;
	
	/**
	 * Number of years that interest is compounded for.
	 */
	@NotNull(message = REQUIRED)
	@Min(value = 0, message = MIN_0)
	private Integer years;

	/**
	 * Get the principal amount.
	 * @return principal
	 */
	public Double getPrincipal() {
		return principal;
	}

	/**
	 * Set the principal amount.
	 * @param principal Starting amount
	 */
	public void setPrincipal(Double principal) {
		this.principal = principal;
	}

	/**
	 * Get the annual interest rate as a percentage.
	 * @return interest rate
	 */
	public Double getInterestRate() {
		return interestRate;
	}

	/**
	 * Set the interest rate as a percentage.
	 * @param interestRate Annual percent interest
	 */
	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	/**
	 * Get the number of times per year that interest is compounded.
	 * @return compounds per year
	 */
	public Integer getCompoundsPerYear() {
		return compoundsPerYear;
	}
	
	/**
	 * Set the number of times per year that interest is compounded.
	 * @param compoundsPerYear Number of times interest is compounded per year
	 */
	public void setCompoundsPerYear(Integer compoundsPerYear) {
		this.compoundsPerYear = compoundsPerYear;
	}

	/**
	 * Get the number of years interest is compounded for.
	 * @return years
	 */
	public Integer getYears() {
		return years;
	}

	/**
	 * Set the number of years that interest is compounded for.
	 * @param years Number of years to compound interest
	 */
	public void setYears(Integer years) {
		this.years = years;
	}
}
