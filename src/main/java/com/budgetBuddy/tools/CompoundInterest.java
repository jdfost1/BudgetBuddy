package com.budgetBuddy.tools;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import static com.budgetBuddy.validation.CompoundInterestValidation.REQUIRED;
import static com.budgetBuddy.validation.CompoundInterestValidation.MIN_0;
import static com.budgetBuddy.validation.CompoundInterestValidation.MIN_1;

public class CompoundInterest {
		
	@NotNull(message = REQUIRED)
	@Min(value = 0, message = MIN_0)
	private Double principal;
	
	@NotNull(message = REQUIRED)
	@Min(value = 0, message = MIN_0)
	private Double interestRate;
	
	@NotNull(message = REQUIRED)
	@Min(value = 1, message = MIN_1)
	private Integer compoundsPerYear;
	
	@NotNull(message = REQUIRED)
	@Min(value = 0, message = MIN_0)
	private Integer years;

	public Double getPrincipal() {
		return principal;
	}

	public void setPrincipal(Double principal) {
		this.principal = principal;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public Integer getCompoundsPerYear() {
		return compoundsPerYear;
	}
	
	public void setCompoundsPerYear(Integer compoundsPerYear) {
		this.compoundsPerYear = compoundsPerYear;
	}

	public Integer getYears() {
		return years;
	}

	public void setYears(Integer years) {
		this.years = years;
	}
}
