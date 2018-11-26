<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<title>Compound Interest Result - Budget Buddy</title>
	<jsp:include page="template/css-include.jsp"/>
	<jsp:include page="template/favicon.jsp"/>
</head>
<body>
    <jsp:include page="template/header.jsp"/>
	<h1>Compound Interest Result</h1>
	<p>Resulting balance after ${compoundInterest.years} years: <fmt:formatNumber type="currency" value="${compoundInterestResult.amount}"/></p>
	<%@ include file="template/js-include.html"%>
</body>
</html>