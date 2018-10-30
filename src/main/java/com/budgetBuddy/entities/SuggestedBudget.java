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
	private String salary;
	
	@Column(name="rent")
	private String rent;
	
	@Column(name="otherBills")
	private String otherBills;
	
	@Column(name="savings")
	private String savings;
	
	@Column(name="education")
	private String education;
	
	@Column(name="funSpending")
	private String funSpending;
	
	@Column(name="retirement")
	private String retirement;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getRent() {
		return rent;
	}

	public void setRent(String rent) {
		this.rent = rent;
	}

	public String getOtherBills() {
		return otherBills;
	}

	public void setOtherBills(String otherBills) {
		this.otherBills = otherBills;
	}

	public String getSavings() {
		return savings;
	}

	public void setSavings(String savings) {
		this.savings = savings;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getFunSpending() {
		return funSpending;
	}

	public void setFunSpending(String funSpending) {
		this.funSpending = funSpending;
	}

	public String getRetirement() {
		return retirement;
	}

	public void setRetirement(String retirement) {
		this.retirement = retirement;
	}
	
	public void calculateSuggestedBudget() {
		//calculate suggested monthly budget
	}
	
	
	

}
