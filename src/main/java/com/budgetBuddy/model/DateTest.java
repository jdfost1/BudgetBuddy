package com.budgetBuddy.model;

import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DateTest {
	static long daysLeft;
	static Date endDate;
	
public static void main(String [] args) {
	DateTest newDateTest = new DateTest();
	Date date1 = new Date();
	newDateTest.calculateEndDate(date1,12);
	
	System.out.println("End Date: "+endDate + "Days Left"+ daysLeft);
}
public Date calculateEndDate(Date startingDate, int savingsTargetMonths) {
	
	//create calendar object with passed date object
	Calendar currentDate = Calendar.getInstance();
	currentDate.setTime(startingDate);
	
	//create calendar object and add months to create end date
	Calendar newDate = Calendar.getInstance();
	newDate.setTime(startingDate);
	newDate.add(Calendar.MONTH, savingsTargetMonths);
	
	//after calculating end date.. convert back to date object
	Date endDate = newDate.getTime();
	
	return endDate;
}
public int calculateDaysRemaining(Date currentDate, Date endDate) {
	
	int daysRemaining = (int) ChronoUnit.DAYS.between(currentDate.toInstant(), endDate.toInstant());
	return daysRemaining;
}
}
