<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<title>Quick Budget Result - Budget Buddy</title>
	<jsp:include page="template/css-include.jsp"/>
	<jsp:include page="template/favicon.jsp"/>
</head>
<body>
	<jsp:include page="template/header.jsp"/>
	<div class="container">
		<div class="row">
			<div class="col-sm-8 col-lg-6 offset-sm-2 offset-lg-3">
				<div id="card" class="card">
					<h5 class="card-header">Suggested Monthly Budget</h5>
					<div class="card-body">
						<p><b>Annual Income:</b> <fmt:formatNumber type="currency" value="${budget.income}"/></p>
						<hr>
						<p><b>Rent / Mortgage:</b> <fmt:formatNumber type="currency" value="${budgetResult.rentValue}"/></p>
						<p><b>Other Bills:</b> <fmt:formatNumber type="currency" value="${budgetResult.otherBillsValue}"/></p>
						<p><b>Savings:</b> <fmt:formatNumber type="currency" value="${budgetResult.savingsValue}"/></p>
						<p><b>Retirement:</b> <fmt:formatNumber type="currency" value="${budgetResult.retirementValue}"/></p>
						<p><b>Education:</b> <fmt:formatNumber type="currency" value="${budgetResult.educationValue}"/></p>
						<p><b>Spending:</b> <fmt:formatNumber type="currency" value="${budgetResult.funValue}"/></p>
						<hr>
						<a href="${userActionUrl}">&lt; Back to calculator</a>
					</div>
				</div>
			</div>
		</div>
	</div>
	<%@ include file="template/js-include.html"%>
</body>
</html>