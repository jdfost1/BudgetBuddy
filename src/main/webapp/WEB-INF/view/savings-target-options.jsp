
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<title>401k Calculator - Budget Buddy</title>
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
						<form:form action="${pageContext.request.contextPath}/budget/create/complete" modelAttribute="savingsTarget">
							<div class="form-group">
								<label for="salaryInput">5% of leftover income - $${savingsTarget.monthlySavingsTargetFive} a month for ${savingsTarget.monthsFivePercent} months</label>
								<form:hidden path="monthlySavingsTarget" value="${savingsTarget.monthlySavingsTargetFive}" />
								<form:hidden path="savingsTargetMonths" value="${savingsTarget.monthsFivePercent}" />
								<button type="submit" class="btn btn-success">Select</button>
								</div>
							</form:form>
							
							<form:form action="${pageContext.request.contextPath}/budget/create/complete" modelAttribute="savingsTarget">
							<div class="form-group">
								<label for="contributionInput">10% of leftover income - $${savingsTarget.monthlySavingsTargetTen} a month for ${savingsTarget.monthsTenPercent} months</label>
								<form:hidden path="monthlySavingsTarget" value="${savingsTarget.monthlySavingsTargetTen}" />
								<form:hidden path="savingsTargetMonths" value="${savingsTarget.monthsTenPercent}" />
								<button type="submit" class="btn btn-success">Select</button>
								</div>
							</form:form>
							
							<form:form action="${pageContext.request.contextPath}/budget/create/complete" modelAttribute="savingsTarget">
							<div class="form-group">
								<label for="rateInput">15% of leftover income - $${savingsTarget.monthlySavingsTargetFifteen} a month for ${savingsTarget.monthsFifteenPercent} months</label>
								<form:hidden path="monthlySavingsTarget" value="${savingsTarget.monthlySavingsTargetFifteen}" />
								<form:hidden path="savingsTargetMonths" value="${savingsTarget.monthsFifteenPercent}" />
								<button type="submit" class="btn btn-success">Select</button>
								</div>
							</form:form>
							
							<form:form action="${pageContext.request.contextPath}/budget/create/complete" modelAttribute="savingsTarget">
							<div class="form-group">
								<label for="ageInput">20% of leftover income - $${savingsTarget.monthlySavingsTargetTwenty} a month for ${savingsTarget.monthsTwentyPercent} months</label>
								<form:hidden path="monthlySavingsTarget" value="${savingsTarget.monthlySavingsTargetTwenty}" />
								<form:hidden path="savingsTargetMonths" value="${savingsTarget.monthsTwentyPercent}" />
								<button type="submit" class="btn btn-success">Select</button>
								</div>
							</form:form>
							
							<form:form action="${pageContext.request.contextPath}/budget/create/complete" modelAttribute="savingsTarget">
							<div class="form-group">
								<label for="retireAgeInput">25% of leftover income - $${savingsTarget.monthlySavingsTargetTwentyFive} a month for ${savingsTarget.monthsTwentyFivePercent} months</label>
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