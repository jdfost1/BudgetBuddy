package com.budgetBuddy.tools;

import javax.validation.constraints.NotNull;

public class CompoundInterest {
		
	@NotNull(message="is required")
	private Double principal;
	
	@NotNull(message="is required")
	private Double interestRate;
	
	@NotNull(message="is required")
	private Integer compoundsPerYear;
	
	@NotNull(message="is required")
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
