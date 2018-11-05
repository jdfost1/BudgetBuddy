package com.budgetBuddy.entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="suggestedBudgets")
public class SuggestedBudget {
	@Id
	@Column(name="email",unique=true,length=100,nullable=false)
	private String email; //primary key
	
	@Column(name="salary")
	private double salary;
	
	@Column(name="rent")
	private double rent;
	
	@Column(name="otherBills")
	private double otherBills;
	
	@Column(name="savings")
	private double savings;
	
	@Column(name="education")
	private double education;
	
	@Column(name="funSpending")
	private double funSpending;
	
	@Column(name="retirement")
	private double retirement;
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getRent() {
		return rent;
	}

	public void setRent(double rent) {
		this.rent = rent;
	}

	public double getOtherBills() {
		return otherBills;
	}

	public void setOtherBills(double otherBills) {
		this.otherBills = otherBills;
	}

	public double getSavings() {
		return savings;
	}

	public void setSavings(double savings) {
		this.savings = savings;
	}

	public double getEducation() {
		return education;
	}

	public void setEducation(double education) {
		this.education = education;
	}

	public double getFunSpending() {
		return funSpending;
	}

	public void setFunSpending(double funSpending) {
		this.funSpending = funSpending;
	}

	public double getRetirement() {
		return retirement;
	}

	public void setRetirement(double retirement) {
		this.retirement = retirement;
	}




	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	public void calculateSuggestedBudget(double income) {
		//calculate suggested monthly budget
		rent = income * .3;
		funSpending =income * .1;
		education = income * .1;
		otherBills = income * .25;
		retirement = income * .1;
		savings = income * .1;
	

	}
	
	

}
