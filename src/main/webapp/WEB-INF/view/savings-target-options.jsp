
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<title>401k Calculator - Budget Buddy</title>
	<jsp:include page="template/css-include.jsp"/>
</head>
<body>
	<jsp:include page="template/header.jsp"/>
	<div class="container">
		<div class="row">
			<div class="col-sm-8 col-lg-6 offset-sm-2 offset-lg-3">
				<div id="card" class="card">
					<h5 class="card-header">Savings Target Plan Options</h5>
					<div class="card-body">
					
						<form:form action="completeBudget" modelAttribute="Timeline">
							<div class="form-group">
								<label for="salaryInput">5% of leftover income - $${Timeline.monthlySavingsTargetFive} a month for ${Timeline.monthsFivePercent} months</label>
								<form:hidden path="monthlySavingsTarget" value="${Timeline.monthlySavingsTargetFive}" />
								<form:hidden path="savingsTargetMonths" value="${Timeline.monthlySavingsTargetFive}" />
								<button type="submit" class="btn btn-success">Select</button>
								</div>
							</form:form>
							
							<form:form action="completeBudget" modelAttribute="Timeline">
							<div class="form-group">
								<label for="contributionInput">10% of leftover income - $${Timeline.monthlySavingsTargetTen} a month for ${Timeline.monthsTenPercent} months</label>
								<form:hidden path="monthlySavingsTarget" value="${Timeline.monthlySavingsTargetTen}" />
								<form:hidden path="savingsTargetMonths" value="${Timeline.monthlySavingsTargetTen}" />
								<button type="submit" class="btn btn-success">Select</button>
								</div>
							</form:form>
							
							<form:form action="completeBudget" modelAttribute="Timeline">
							<div class="form-group">
								<label for="rateInput">15% of leftover income - $${Timeline.monthlySavingsTargetFifteen} a month for ${Timeline.monthsFifteenPercent} months</label>
								<form:hidden path="monthlySavingsTarget" value="${Timeline.monthlySavingsTargetFifteen}" />
								<form:hidden path="savingsTargetMonths" value="${Timeline.monthlySavingsTargetFifteen}" />
								<button type="submit" class="btn btn-success">Select</button>
								</div>
							</form:form>
							
							<form:form action="completeBudget" modelAttribute="Timeline">
							<div class="form-group">
								<label for="ageInput">20% of leftover income - $${Timeline.monthlySavingsTargetTwenty} a month for ${Timeline.monthsTwentyPercent} months</label>
								<form:hidden path="monthlySavingsTarget" value="${Timeline.monthlySavingsTargetTwenty}" />
								<form:hidden path="savingsTargetMonths" value="${Timeline.monthlySavingsTargetTwenty}" />
								<button type="submit" class="btn btn-success">Select</button>
								</div>
							</form:form>
							
							<form:form action="completeBudget" modelAttribute="Timeline">
							<div class="form-group">
								<label for="retireAgeInput">25% of leftover income - $${Timeline.monthlySavingsTargetTwentyFive} a month for ${Timeline.monthsTwentyFivePercent} months</label>
								<form:hidden path="monthlySavingsTarget" value="${Timeline.monthlySavingsTargetTwentyFive}" />
								<form:hidden path="savingsTargetMonths" value="${Timeline.monthlySavingsTargetTwentyFive}" />
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