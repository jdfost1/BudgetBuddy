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

	@Column(name = "savings_target")
	private double savingsTarget;

	@Column(name = "duration")
	private double startingDuration;

	@Column(name = "remainingBalance")
	private double startingBalance;

	@Column(name = "start_date")
	private double startDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public double getMonthlySavingsTarget() {
		return monthlySavingsTarget;
	}

	public void setMonthlySavingsTarget(double monthlySavingsTarget) {
		this.monthlySavingsTarget = monthlySavingsTarget;
	}

	public double getSavingsTarget() {
		return savingsTarget;
	}

	public void setSavingsTarget(double savingsTarget) {
		this.savingsTarget = savingsTarget;
	}

	public double getStartingDuration() {
		return startingDuration;
	}

	public void setStartingDuration(double startingDuration) {
		this.startingDuration = startingDuration;
	}

	public double getStartingBalance() {
		return startingBalance;
	}

	public void setStartingBalance(double startingBalance) {
		this.startingBalance = startingBalance;
	}

	public double getStartDate() {
		return startDate;
	}

	public void setStartDate(double startDate) {
		this.startDate = startDate;
	}

}
