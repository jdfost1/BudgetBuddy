<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Compound Interest Result - Budget Buddy</title>
	<%@ include file="template/css-include.html"%>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/compound-interest-result.css" />
</head>
<body>
    <%@ include file="template/header.html"%>
	<h1>Compound Interest Result</h1>
	<p>Resulting balance after ${compoundInterest.years} years: <fmt:formatNumber type="currency" value="${compoundInterestResult.amount}"/></p>
	<%@ include file="template/js-include.html"%>
</body>
</html>