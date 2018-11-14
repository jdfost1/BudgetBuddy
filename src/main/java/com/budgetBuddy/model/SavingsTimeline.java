package com.budgetBuddy.model;

public class SavingsTimeline {
	private double monthlySavingsTarget;
	private double savingsTargetMonths;

	private double monthlyIncome;
	private double leftOverIncome;

	public double monthlySavingsTargetFive;
	private double monthlySavingsTargetTen;
	private double monthlySavingsTargetFifteen;
	private double monthlySavingsTargetTwenty;
	private double monthlySavingsTargetTwentyFive;

	private double monthsFivePercent;
	private double monthsTenPercent;
	private double monthsFifteenPercent;
	private double monthsTwentyPercent;
	private double monthsTwentyFivePercent;

	public void calculateSavingsTargetOptions(BudgetForm form) {
		monthlyIncome = form.getIncome() / 12;
		leftOverIncome = monthlyIncome - (form.getRent() + form.getCarPayment() + form.getCarInsurance()
				+ form.getUtilities() + form.getRemainingExpenses());

		double savingsTarget = form.getSavingsTarget();

		// calculate 5%,10%,15%,20%,and 25% of users monthly leftover income
		this.monthlySavingsTargetFive = leftOverIncome * .05;
		this.monthlySavingsTargetTen = leftOverIncome * .1;
		this.monthlySavingsTargetFifteen = leftOverIncome * .15;
		this.monthlySavingsTargetTwenty = leftOverIncome * .2;
		this.monthlySavingsTargetTwentyFive = leftOverIncome * .25;

		// calculate the number of months to hit savings target using 5%,10%,15%,20%,and
		// 25% of users monthly leftover income
		this.monthsFivePercent = savingsTarget / monthlySavingsTargetFive;
		this.monthsTenPercent = savingsTarget / monthlySavingsTargetTen;
		this.monthsFifteenPercent = savingsTarget / monthlySavingsTargetFifteen;
		this.monthsTwentyPercent = savingsTarget / monthlySavingsTargetTwenty;
		this.monthsTwentyFivePercent = savingsTarget / monthlySavingsTargetTwentyFive;

	}

	public double getMonthlySavingsTarget() {
		return monthlySavingsTarget;
	}

	public void setMonthlySavingsTarget(double monthlySavingsTarget) {
		this.monthlySavingsTarget = monthlySavingsTarget;
	}

	public double getMonthlyIncome() {
		return monthlyIncome;
	}

	public void setMonthlyIncome(double monthlyIncome) {
		this.monthlyIncome = monthlyIncome;
	}

	public double getLeftOverIncome() {
		return leftOverIncome;
	}

	public void setLeftOverIncome(double leftOverIncome) {
		this.leftOverIncome = leftOverIncome;
	}

	public double getMonthlySavingsTargetFive() {
		return monthlySavingsTargetFive;
	}

	public void setMonthlySavingsTargetFive(double monthlySavingsTargetFive) {
		this.monthlySavingsTargetFive = monthlySavingsTargetFive;
	}

	public double getMonthlySavingsTargetTen() {
		return monthlySavingsTargetTen;
	}

	public void setMonthlySavingsTargetTen(double monthlySavingsTargetTen) {
		this.monthlySavingsTargetTen = monthlySavingsTargetTen;
	}

	public double getMonthlySavingsTargetFifteen() {
		return monthlySavingsTargetFifteen;
	}

	public void setMonthlySavingsTargetFifteen(double monthlySavingsTargetFifteen) {
		this.monthlySavingsTargetFifteen = monthlySavingsTargetFifteen;
	}

	public double getMonthlySavingsTargetTwenty() {
		return monthlySavingsTargetTwenty;
	}

	public void setMonthlySavingsTargetTwenty(double monthlySavingsTargetTwenty) {
		this.monthlySavingsTargetTwenty = monthlySavingsTargetTwenty;
	}

	public double getMonthlySavingsTargetTwentyFive() {
		return monthlySavingsTargetTwentyFive;
	}

	public void setMonthlySavingsTargetTwentyFive(double monthlySavingsTargetTwentyFive) {
		this.monthlySavingsTargetTwentyFive = monthlySavingsTargetTwentyFive;
	}

	public double getMonthsFivePercent() {
		return monthsFivePercent;
	}

	public void setMonthsFivePercent(double monthsFivePercent) {
		this.monthsFivePercent = monthsFivePercent;
	}

	public double getMonthsTenPercent() {
		return monthsTenPercent;
	}

	public void setMonthsTenPercent(double monthsTenPercent) {
		this.monthsTenPercent = monthsTenPercent;
	}

	public double getMonthsFifteenPercent() {
		return monthsFifteenPercent;
	}

	public void setMonthsFifteenPercent(double monthsFifteenPercent) {
		this.monthsFifteenPercent = monthsFifteenPercent;
	}

	public double getMonthsTwentyPercent() {
		return monthsTwentyPercent;
	}

	public void setMonthsTwentyPercent(double monthsTwentyPercent) {
		this.monthsTwentyPercent = monthsTwentyPercent;
	}

	public double getMonthsTwentyFivePercent() {
		return monthsTwentyFivePercent;
	}

	public void setMonthsTwentyFivePercent(double monthsTwentyFivePercent) {
		this.monthsTwentyFivePercent = monthsTwentyFivePercent;
	}

	public double getSavingsTargetMonths() {
		return savingsTargetMonths;
	}

	public void setSavingsTargetMonths(double savingsTargetMonths) {
		this.savingsTargetMonths = savingsTargetMonths;
	}

}
