package com.budgetBuddy.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
@Entity
@Table(name="budgets")
public class CurrentBudget {
	@Id
	@Column(name="email",unique=true,length=100,nullable=false)
	private String email; //primary key
	
	@Column(name="salary")
	private String salary;
	
	@Column(name="savingsGoal")
	private String savingsGoal;
	
	@Column(name="fixedRent")
	private String fixedRent;
	
	@Column(name="fixedBills")
	private String fixedBills;
	
	public void calculateSavings() {
		//calculate money leftover after monthly fixed expenses
	}
	public void calculateSavingsGoalMonths() {
		//calculate number of months to hit goal
	}
	public void calculateBudget(double income, double savingsGoal, double fixedRent, double fixedBills) {
		//calculate monthly budget based on user's savings goal and fixed expenses
	}

}
