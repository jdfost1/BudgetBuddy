package com.budgetBuddy.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "savings_target")
public class SavingsTarget {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "monthly_savings_target")
	private double monthlySavingsTarget;
	
	@Column(name= "savings_target")
	private double savingsTarget;
	
	@Column(name= "duration")
	private double startingDuration;
	
	@Column(name= "remainingBalance")
	private double startingBalance;
	
	@Column(name= "start_date")
	private double startDate;
	
	
	
	
	
	
	
}
