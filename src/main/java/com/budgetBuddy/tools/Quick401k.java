package com.budgetBuddy.tools;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class Quick401k {

	@NotNull
	@Min(0)
	private Double salary;
	
	@NotNull
	@Min(0)
	private Integer age;
	
	@NotNull
	@Min(0)
	private Integer retireAge;
	
	@NotNull
	@Min(0)
	private Double currentBalance;
	
	@NotNull
	@Min(0)
	private Double contribution;
	
	@NotNull
	@Min(0)
	private Double rate;
	
	@NotNull
	@Min(0)
	private Double employerMatch;
	
	@NotNull
	@Min(0)
	private Double employerMatchEnd;
	
	
	public Double getSalary() {
		return salary;
	}
	
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	public Integer getAge() {
		return age;
	}
	
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public Integer getRetireAge() {
		return retireAge;
	}
	
	public void setRetireAge(Integer retireAge) {
		this.retireAge = retireAge;
	}
	
	public Double getCurrentBalance() {
		return currentBalance;
	}
	
	public void setCurrentBalance(Double currentBalance) {
		this.currentBalance = currentBalance;
	}
	
	public Double getContribution() {
		return contribution;
	}
	
	public void setContribution(Double contribution) {
		this.contribution = contribution;
	}
	
	public Double getRate() {
		return rate;
	}
	
	public void setRate(Double rate) {
		this.rate = rate;
	}
	
	public Double getEmployerMatch() {
		return employerMatch;
	}
	
	public void setEmployerMatch(Double employerMatch) {
		this.employerMatch = employerMatch;
	}
	
	public Double getEmployerMatchEnd() {
		return employerMatchEnd;
	}
	
	public void setEmployerMatchEnd(Double employerMatchEnd) {
		this.employerMatchEnd = employerMatchEnd;
	}
}