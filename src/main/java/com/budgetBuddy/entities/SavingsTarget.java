package com.budgetBuddy.entities;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.budgetBuddy.model.BudgetForm;

@Entity
@Table(name = "savings_target")
public class SavingsTarget {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	// user's chosen option for savings target plan (monthly amount and months)
	@Column(name = "monthly_savings_target")
	private double monthlySavingsTarget;

	@Column(name = "savings_target_months")
	private double savingsTargetMonths;

	@Column(name = "savings_target_total")
	private double savingsTargetTotal;

	@Column(name = "starting_date")
	private Date startDate;

	@Column(name = "end_date")
	private Date endDate;
	
	@Column(name="days_left")
	private int daysLeft;

	

	private double monthlyIncome;
	private double leftOverIncome;
	private static final DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

	// Percentage of leftover income options (5%,10%,15%,20%,and 25% of user's
	// leftover income)
	public double monthlySavingsTargetFive;
	private double monthlySavingsTargetTen;
	private double monthlySavingsTargetFifteen;
	private double monthlySavingsTargetTwenty;
	private double monthlySavingsTargetTwentyFive;

	// Number of months needed to hit savings target goal using (5%,10%,15%,20%,and
	// 25% of user's leftover income)
	private double monthsFivePercent;
	private double monthsTenPercent;
	private double monthsFifteenPercent;
	private double monthsTwentyPercent;
	private double monthsTwentyFivePercent;

	public void calculateSavingsTargetOptions(BudgetForm form) {
		monthlyIncome = form.getIncome() / 12;

		// calculate leftover income after deducting expenses from income
		this.leftOverIncome = monthlyIncome - (form.getRent() + form.getCarPayment() + form.getCarInsurance()
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

		// time stamp the current object to get the users starting date for their
		// savings target
		this.startDate = new Date();

	}

	public static Date calculateEndDate(int savingsTargetMonths) {

		// get current date
		Date startingDate = new Date();

		// create calendar object and pass it the starting date object
		Calendar currentDate = Calendar.getInstance();
		currentDate.setTime(startingDate);

		// create calendar object,use current date object, and add months to create end
		// date
		Calendar newDate = Calendar.getInstance();
		newDate.setTime(startingDate);
		newDate.add(Calendar.MONTH, savingsTargetMonths);

		// after calculating end date.. convert back to date object
		Date endDate = newDate.getTime();

		// return the end date for the users savings target
		return endDate;
	}

	public static int calculateDaysRemaining(Date endDate) {
		// get current date
		Date currentDate = new Date();

		//calculate days between current date and target date
		int daysRemaining = (int) ChronoUnit.DAYS.between(currentDate.toInstant(), endDate.toInstant());
		return daysRemaining;
	}

	// getters and setters

	public double getSavingsTargetTotal() {
		return savingsTargetTotal;
	}

	public void setSavingsTargetTotal(double savingsTargetTotal) {
		this.savingsTargetTotal = savingsTargetTotal;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
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
	public int getDaysLeft() {
		return daysLeft;
	}

	public void setDaysLeft(int daysLeft) {
		this.daysLeft = daysLeft;
	}

}
