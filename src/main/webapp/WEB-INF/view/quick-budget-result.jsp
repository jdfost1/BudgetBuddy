<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<title>Quick Budget Result - Budget Buddy</title>
	<%@ include file="template/css-include.html"%>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/common.css" />
	<style>
		body { text-align: center;}
	</style>
</head>
<body>
	<jsp:include page="template/header.jsp"/>
<body>
	<div>
		<h1>Suggested Monthly Budget</h1>
		<p>Rent/Mortgage: <fmt:formatNumber type="currency" value="${budgetResult.rentValue}"/></p>
		<p>Other Bills: <fmt:formatNumber type="currency" value="${budgetResult.otherBillsValue}"/></p>
		<p>Savings: <fmt:formatNumber type="currency" value="${budgetResult.savingsValue}"/></p>
		<p>Retirement: <fmt:formatNumber type="currency" value="${budgetResult.retirementValue}"/></p>
		<p>Education: <fmt:formatNumber type="currency" value="${budgetResult.educationValue}"/></p>
		<p>Spending: <fmt:formatNumber type="currency" value="${budgetResult.funValue}"/></p>
	</div>
	<%@ include file="template/js-include.html"%>
</body>
</html>