<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<title>Select Savings Plan - Create Budget - Budget Buddy</title>
	<jsp:include page="template/css-include.jsp"/>
	<jsp:include page="template/favicon.jsp"/>
</head>
<body>
	<jsp:include page="template/header.jsp"/>
	<div class="container">
		<div class="row">
			<div class="col-sm-8 col-lg-6 offset-sm-2 offset-lg-3">
				<div id="card" class="card">
					<h5 class="card-header">Savings Target Plan Options</h5>
					<div class="card-body">
						<div class="progress">
							<div class="progress-bar bg-success" role="progressbar" style="width: 100%;" aria-valuenow="100" aria-valuemin="0" aria-valuemax="100">Step 2 of 2</div>
						</div>
						<br>
						<form:form action="${pageContext.request.contextPath}/budget/create/complete" modelAttribute="savingsTarget">
						<div class="form-group">
							<label for="salaryInput">5% of leftover income - <fmt:formatNumber type="currency" value="${savingsTarget.monthlySavingsTargetFive}"/> a month for <fmt:formatNumber type="number" value="${savingsTarget.monthsFivePercent}" maxFractionDigits="0"/> months</label>
							<form:hidden path="monthlySavingsTarget" value="${savingsTarget.monthlySavingsTargetFive}" />
							<form:hidden path="savingsTargetMonths" value="${savingsTarget.monthsFivePercent}" />
							<button type="submit" class="btn btn-success">Select</button>
							</div>
						</form:form>
						<form:form action="${pageContext.request.contextPath}/budget/create/complete" modelAttribute="savingsTarget">
						<div class="form-group">
							<label for="contributionInput">10% of leftover income - <fmt:formatNumber type="currency" value="${savingsTarget.monthlySavingsTargetTen}"/> a month for <fmt:formatNumber type="number" value="${savingsTarget.monthsTenPercent}" maxFractionDigits="0"/> months</label>
							<form:hidden path="monthlySavingsTarget" value="${savingsTarget.monthlySavingsTargetTen}" />
							<form:hidden path="savingsTargetMonths" value="${savingsTarget.monthsTenPercent}" />
							<button type="submit" class="btn btn-success">Select</button>
							</div>
						</form:form>
						<form:form action="${pageContext.request.contextPath}/budget/create/complete" modelAttribute="savingsTarget">
						<div class="form-group">
							<label for="rateInput">15% of leftover income - <fmt:formatNumber type="currency" value="${savingsTarget.monthlySavingsTargetFifteen}"/> a month for <fmt:formatNumber type="number" value="${savingsTarget.monthsFifteenPercent}" maxFractionDigits="0"/> months</label>
							<form:hidden path="monthlySavingsTarget" value="${savingsTarget.monthlySavingsTargetFifteen}" />
							<form:hidden path="savingsTargetMonths" value="${savingsTarget.monthsFifteenPercent}" />
							<button type="submit" class="btn btn-success">Select</button>
							</div>
						</form:form>
						<form:form action="${pageContext.request.contextPath}/budget/create/complete" modelAttribute="savingsTarget">
						<div class="form-group">
							<label for="ageInput">20% of leftover income - <fmt:formatNumber type="currency" value="${savingsTarget.monthlySavingsTargetTwenty}"/> a month for <fmt:formatNumber type="number" value="${savingsTarget.monthsTwentyPercent}" maxFractionDigits="0"/> months</label>
							<form:hidden path="monthlySavingsTarget" value="${savingsTarget.monthlySavingsTargetTwenty}" />
							<form:hidden path="savingsTargetMonths" value="${savingsTarget.monthsTwentyPercent}" />
							<button type="submit" class="btn btn-success">Select</button>
							</div>
						</form:form>
						<form:form action="${pageContext.request.contextPath}/budget/create/complete" modelAttribute="savingsTarget">
						<div class="form-group">
							<label for="retireAgeInput">25% of leftover income - <fmt:formatNumber type="currency" value="${savingsTarget.monthlySavingsTargetTwentyFive}"/> a month for <fmt:formatNumber type="number" value="${savingsTarget.monthsTwentyFivePercent}" maxFractionDigits="0"/> months</label>
							<form:hidden path="monthlySavingsTarget" value="${savingsTarget.monthlySavingsTargetTwentyFive}" />
							<form:hidden path="savingsTargetMonths" value="${savingsTarget.monthsTwentyFivePercent}" />
							<button type="submit" class="btn btn-success">Select</button>
							</div>
						</form:form>
					</div>
				</div>
			</div>
		</div>
	</div>
	<%@ include file="template/js-include.html"%>
</body>
</html>