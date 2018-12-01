package com.budgetBuddy.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "budget_advice")
public class BudgetAdvice {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "housing_message")
	private String housingMessage;

	@Column(name = "transportation_message")
	private String transportationMessage;

	@Column(name = "utilities_message")
	private String utilitiesMessage;

	public void generateBudgetAdvice(Budget currentBudget, SuggestedBudget suggestedBudget) {

	
		double overPay;

// housing
		if (currentBudget.getRent() > suggestedBudget.getHousing()) {
			overPay = currentBudget.getRent() - suggestedBudget.getHousing();
			this.housingMessage = "You are paying " + "$" + overPay
					+ " more than the monthly reccomended housing budget. Budget Buddy suggests that"
					+ "you try to lower this amount and then update your budget";
		} // end of if statement
		else
			this.housingMessage = "You are currently paying the recommended amount or lower for your housing! Great Job!";

// utilities
		if (currentBudget.getUtilities() > suggestedBudget.getUtilities()) {
			overPay = currentBudget.getUtilities() - suggestedBudget.getUtilities();

			this.utilitiesMessage = "You are paying " + "$" + overPay
					+ " more than the monthly reccomended utility budget. Budget Buddy suggests that"
					+ "you try to lower this amount and then update your budget";
		} // end of if statement
		else
			this.utilitiesMessage = "You are currently paying the recommended amount or lower for your utilites! Great Job!";
// transportation
		double currentTransportation = currentBudget.getCarInsurance() + currentBudget.getCarPayment();

		if (currentTransportation > suggestedBudget.getTransportation()) {
			overPay = currentTransportation - suggestedBudget.getTransportation();
			this.transportationMessage = "You are paying " + "$" + overPay
					+ " more than the monthly reccomended transportation budget. Budget Buddy suggests that"
					+ "you try to lower this amount and then update your budget";
		} // end of if statement
		else
			this.transportationMessage = "You are currently paying the recommended amount or lower for your transportation! Great Job!";
		
		
	}// end of method

	// getters and setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getHousingMessage() {
		return housingMessage;
	}

	public void setHousingMessage(String housingMessage) {
		this.housingMessage = housingMessage;
	}

	public String getTransportationMessage() {
		return transportationMessage;
	}

	public void setTransportationMessage(String transportationMessage) {
		this.transportationMessage = transportationMessage;
	}

	public String getUtilitiesMessage() {
		return utilitiesMessage;
	}

	public void setUtilitiesMessage(String utilitiesMessage) {
		this.utilitiesMessage = utilitiesMessage;
	}

}// end of class
