package com.budgetBuddy.model;

public class SavingsTimeline {
	private double monthlySavingsTarget;
	private double monthlyIncome;
	private double leftOverIncome;
	private double monthlySavingsTarget100;
	private double monthlySavingsTarget10;
	private double monthlySavingsTarget20;
	private double monthlySavingsTarget30;
	private double monthlySavingsTarget40;
	private double monthlySavingsTarget50;

	private double monthsTenPercent;
	private double monthsTwentyPercent;
	private double monthsThirtyPercent;
	private double monthsFortyPercent;
	private double monthsFiftyPercent;

	public void calculateSavingsTargetOptions(BudgetForm form) {
		monthlyIncome = form.getIncome() / 12;
		leftOverIncome = monthlyIncome - (form.getRent()+form.getCarPayment()+form.getCarInsurance()+form.getUtilities()+form.getRemainingExpenses());
       
		double savingsTarget = form.getSavingsTarget();
        
		//calculate 10%,20%,30%,40%,and 50% of users monthly leftover income
		monthlySavingsTarget10 = leftOverIncome * .1;
		monthlySavingsTarget20 = leftOverIncome * .2;
		monthlySavingsTarget30 = leftOverIncome * .3;
		monthlySavingsTarget40 = leftOverIncome * .4;
		monthlySavingsTarget50 = leftOverIncome * .5;

		//calculate the number of months to hit savings target using 10%,20%,30%,40%,and 50% of users monthly leftover income
		monthsTenPercent =  savingsTarget / monthlySavingsTarget10;
		monthsTwentyPercent = savingsTarget / monthlySavingsTarget20;
		monthsThirtyPercent = savingsTarget / monthlySavingsTarget30;
		monthsFortyPercent = savingsTarget / monthlySavingsTarget40;
		monthsFiftyPercent = savingsTarget / monthlySavingsTarget50;

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

	public double getMonthlySavingsTarget100() {
		return monthlySavingsTarget100;
	}

	public void setMonthlySavingsTarget100(double monthlySavingsTarget100) {
		this.monthlySavingsTarget100 = monthlySavingsTarget100;
	}

	public double getMonthlySavingsTarget10() {
		return monthlySavingsTarget10;
	}

	public void setMonthlySavingsTarget10(double monthlySavingsTarget10) {
		this.monthlySavingsTarget10 = monthlySavingsTarget10;
	}

	public double getMonthlySavingsTarget20() {
		return monthlySavingsTarget20;
	}

	public void setMonthlySavingsTarget20(double monthlySavingsTarget20) {
		this.monthlySavingsTarget20 = monthlySavingsTarget20;
	}

	public double getMonthlySavingsTarget30() {
		return monthlySavingsTarget30;
	}

	public void setMonthlySavingsTarget30(double monthlySavingsTarget30) {
		this.monthlySavingsTarget30 = monthlySavingsTarget30;
	}

	public double getMonthlySavingsTarget40() {
		return monthlySavingsTarget40;
	}

	public void setMonthlySavingsTarget40(double monthlySavingsTarget40) {
		this.monthlySavingsTarget40 = monthlySavingsTarget40;
	}

	public double getMonthlySavingsTarget50() {
		return monthlySavingsTarget50;
	}

	public void setMonthlySavingsTarget50(double monthlySavingsTarget50) {
		this.monthlySavingsTarget50 = monthlySavingsTarget50;
	}

	public double getMonthsTenPercent() {
		return monthsTenPercent;
	}

	public void setMonthsTenPercent(double monthsTenPercent) {
		this.monthsTenPercent = monthsTenPercent;
	}

	public double getMonthsTwentyPercent() {
		return monthsTwentyPercent;
	}

	public void setMonthsTwentyPercent(double monthsTwentyPercent) {
		this.monthsTwentyPercent = monthsTwentyPercent;
	}

	public double getMonthsThirtyPercent() {
		return monthsThirtyPercent;
	}

	public void setMonthsThirtyPercent(double monthsThirtyPercent) {
		this.monthsThirtyPercent = monthsThirtyPercent;
	}

	public double getMonthsFortyPercent() {
		return monthsFortyPercent;
	}

	public void setMonthsFortyPercent(double monthsFortyPercent) {
		this.monthsFortyPercent = monthsFortyPercent;
	}

	public double getMonthsFiftyPercent() {
		return monthsFiftyPercent;
	}

	public void setMonthsFiftyPercent(double monthsFiftyPercent) {
		this.monthsFiftyPercent = monthsFiftyPercent;
	}
}
