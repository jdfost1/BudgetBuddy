package com.budgetBuddy.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "email")
	private String email;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "enabled")
	private int enabled;
	
	@Column(name = "name")
	private String name;

	@Column(name = "age")
	private int age;
	
	@ManyToMany
	@JoinTable(name="user_role", 
			   joinColumns=@JoinColumn(name="user_id"),
			   inverseJoinColumns=@JoinColumn(name="role_id"))
	private List<Role> roles;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "budget_id")
	private Budget budget;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "suggested_budget_id")
	private SuggestedBudget suggestedBudget;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "savings_target_id")
	private SavingsTarget savingsTarget;

	
	public SavingsTarget getSavingsTarget() {
		return savingsTarget;
	}

	public void setSavingsTarget(SavingsTarget savingsTarget) {
		this.savingsTarget = savingsTarget;
	}

	public Long getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public boolean isEnabled() {
		return enabled == 1;
	}
	
	public void setEnabled(boolean enabled) {
		this.enabled = enabled ? 1 : 0;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public List<Role> getRoles() {
		return roles;
	}
	
	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	
	public Budget getBudget() {
		return budget;
	}
	
	public void setBudget(Budget budget) {
		this.budget = budget;
	}
	public SuggestedBudget getSuggestedBudget() {
		return suggestedBudget;
	}
	
	public void setSuggestedBudget(SuggestedBudget budget) {
		this.suggestedBudget = budget;
	}
}
