package com.budgetBuddy.entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="budgets")
public class Budget {
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

}
