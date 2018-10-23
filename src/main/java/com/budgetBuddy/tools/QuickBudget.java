package com.budgetBuddy.tools;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class QuickBudget {
	
	@NotNull
	@Min(0)
	private Double income;
	
	public Double getIncome() {
		return income;
	}

	public void setIncome(Double income) {
		this.income = income;
	}
}

