package com.budgetBuddy.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "retirementAccounts")
public class Estimated401k {

	@Id
	@Column(name = "email", unique = true, length = 100, nullable = false)
	private String email; // primary key

	@Column(name = "salary", unique = true, length = 100, nullable = false)
	double salary;

	@Column(name = "contribution", unique = true, length = 100, nullable = false)
	double contribution;

	@Column(name = "age", unique = true, length = 100, nullable = false)
	int age;

	@Column(name = "retireAge", unique = true, length = 100, nullable = false)
	int retireAge;

	@Column(name = "currentBalance", unique = true, length = 100, nullable = false)
	double currentBalance;

	@Column(name = "rate", unique = true, length = 100, nullable = false)
	double rate;

	@Column(name = "employerMatchEnd", unique = true, length = 100, nullable = false)
	double employerMatchEnd;

	@Column(name = "employerMatch", unique = true, length = 100, nullable = false)
	double employerMatch;

	@Column(name = "nestEgg", unique = true, length = 100, nullable = false)
	private double nestEgg;

	@Column(name = "years", unique = true, length = 100, nullable = false)
	private int years;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getContribution() {
		return contribution;
	}

	public void setContribution(double contributio) {
		this.contribution = contributio;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getRetireAge() {
		return retireAge;
	}

	public void setRetireAge(int retireAge) {
		this.retireAge = retireAge;
	}

	public double getCurrentBalance() {
		return currentBalance;
	}

	public void setCurrentBalance(double currentBalance) {
		this.currentBalance = currentBalance;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public double getEmployerMatchEnd() {
		return employerMatchEnd;
	}

	public void setEmployerMatchEnd(double employerMatchEnd) {
		this.employerMatchEnd = employerMatchEnd;
	}

	public double getEmployerMatch() {
		return employerMatch;
	}

	public void setEmployerMatch(double employerMatch) {
		this.employerMatch = employerMatch;
	}

	public double getNestEgg() {
		return nestEgg;
	}

	public void setNestEgg(double nestEgg) {
		this.nestEgg = nestEgg;
	}

	public int getYears() {
		return years;
	}

	public void setYears(int years) {
		this.years = years;
	}

	public void calcualateNestEgg() {
		years = retireAge - age;
		rate = rate / 100;
		employerMatchEnd = employerMatchEnd / 100;
		employerMatch = employerMatch / 100;
		contribution = contribution / 100;
		double totalEmployerMatch;

		for (int i = 0; i < years; i++) {
			if (contribution >= employerMatchEnd) {
				totalEmployerMatch = employerMatchEnd * salary * employerMatch;
			} else
				totalEmployerMatch = contribution * salary * employerMatch;

			currentBalance = currentBalance + (currentBalance * rate) + salary * contribution;

			currentBalance = currentBalance + totalEmployerMatch;

		} // end of loop
		nestEgg = currentBalance;
	}// end of calculate nestEgg
}
