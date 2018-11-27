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
    <div class="container">
		<div class="row">
			<div class="col-sm-8 col-lg-6 offset-sm-2 offset-lg-3">
				<div id="card" class="card">
					<h5 class="card-header">Compound Interest Result</h5>
					<div class="card-body">
						<p><b>Principal:</b> <fmt:formatNumber type="currency" value="${compoundInterest.principal}"/></p>
						<p><b>Interest Rate:</b> <fmt:formatNumber type="percent" maxFractionDigits="2" value="${compoundInterest.interestRate / 100}"/></p>
						<p><b>Compounds Per Year:</b> ${compoundInterest.compoundsPerYear}</p>
						<p><b>Number of Years:</b> ${compoundInterest.years}</p>
						<hr>
						<p><b>Resulting Balance:</b> <fmt:formatNumber type="currency" value="${compoundInterestResult.amount}"/></p>
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