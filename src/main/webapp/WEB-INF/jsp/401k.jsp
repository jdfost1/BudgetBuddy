<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<title>401k Calculator - Budget Buddy</title>
	<%@ include file="template/css-include.html"%>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/common.css" />
</head>
<body>
	<%@ include file="template/header.html"%>
	<div class="container">
		<div class="row">
			<div class="col-sm-8 col-lg-6 offset-sm-2 offset-lg-3">
				<div id="card" class="card">
					<h5 class="card-header">401k Calculator</h5>
					<div class="card-body">
						<form:form action="401k-result" modelAttribute="account">
							<div class="form-group">
								<label for="salaryInput">Annual salary</label>
								<form:input path="salary" id="salaryInput" cssClass="form-control" />
								<form:errors path="salary" element="div" cssClass="invalid-feedback" />
							</div>
							<div class="form-group">
								<label for="contributionInput">Percent of your paycheck that you contribute</label>
								<form:input path="contribution" id="contributionInput" cssClass="form-control" />
								<form:errors path="contribution" element="div" cssClass="invalid-feedback" />
							</div>
							<div class="form-group">
								<label for="rateInput">Percent of expected annual rate of return</label>
								<form:input path="rate" id="rateInput" cssClass="form-control" />
								<form:errors path="rate" element="div" cssClass="invalid-feedback" />
							</div>
							<div class="form-group">
								<label for="ageInput">Current age</label>
								<form:input path="age" id="ageInput" cssClass="form-control" />
								<form:errors path="age" element="div" cssClass="invalid-feedback" />
							</div>
							<div class="form-group">
								<label for="retireAgeInput">Age you want to retire</label>
								<form:input path="retireAge" id="retireAgeInput" cssClass="form-control" />
								<form:errors path="retireAge" element="div"	cssClass="invalid-feedback" />
							</div>
							<div class="form-group">
								<label for="employerMatchInput">Percent of your contribution your employer will match</label>
								<form:input path="employerMatch" id="employerMatchInput" cssClass="form-control" />
								<form:errors path="employerMatch" element="div"	cssClass="invalid-feedback" />
							</div>
							<div class="form-group">
								<label for="employerMatchEndInput">Percent at which your employer match ends</label>
								<form:input path="employerMatchEnd" id="employerMatchEndInput" cssClass="form-control" />
								<form:errors path="employerMatchEnd" element="div" cssClass="invalid-feedback" />
							</div>
							<div class="form-group">
								<label for="currentBalanceInput">Current balance</label>
								<form:input path="currentBalance" id="currentBalanceInput" cssClass="form-control" />
								<form:errors path="currentBalance" element="div" cssClass="invalid-feedback" />
							</div>
							<button type="submit" class="btn btn-success">Calculate</button>
						</form:form>
					</div>
				</div>
			</div>
		</div>
	</div>
	<%@ include file="template/js-include.html"%>
</body>
</html>