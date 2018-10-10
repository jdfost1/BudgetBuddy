<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Quick Budget</title>
</head>
<body>
<h1>Create Quick Budget</h1>
<form:form action="budget/result" modelAttribute="budget">
Enter Income: <form:input path="income"/>
<br>
<input type="submit" value="CalculateBudget"/>
</form:form>

</body>
</html>