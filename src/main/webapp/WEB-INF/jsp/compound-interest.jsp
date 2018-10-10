<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Compound Interest Calculator - Budget Buddy</title>
</head>
<body>
	<h1>Calculate Compound Interest</h1>
	<form:form action="compound-interest-calculator/result" modelAttribute="interest">
		Starting Balance: <form:input path="startingBalance"/>
		<br>
		Annual Rate of Return: <form:input path="annualRateOfReturn"/>
		<br>
		Number of Years: <form:input path="timeYears"/>
		<br>
		<input type="submit" value="Calculate"/>
	</form:form>
</body>
</html>