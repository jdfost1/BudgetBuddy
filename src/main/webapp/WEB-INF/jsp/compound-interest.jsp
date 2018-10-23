<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Compound Interest Calculator - Budget Buddy</title>
	<%@ include file="template/css-include.html"%>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/compound-interest.css" />
</head>
<body>
	<%@ include file="template/header.html"%>
	<div class="container">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<div id="card" class="card">
					<h5 class="card-header">Calculate Compound Interest</h5>
					<div class="card-body">
						<form:form action="compound-interest-result" modelAttribute="compoundInterest">
							<div class="form-group">
								<label for="principalInput">Starting Balance</label>
								<form:input path="principal" id="principalInput" cssClass="form-control" />
								<form:errors path="principal" element="div"	cssClass="invalid-feedback" />
							</div>
							<div class="form-group">
								<label for="interestRateInput">Interest Rate (%)</label>
								<form:input path="interestRate" id="interestRateInput" cssClass="form-control" />
								<form:errors path="interestRate" element="div" cssClass="invalid-feedback" />
							</div>
							<div class="form-group">
								<label for="compoundsPerYearInput">Number of Times Compounded Per Year</label>
								<form:input path="compoundsPerYear" id="compoundsPerYearInput" cssClass="form-control" />
								<form:errors path="compoundsPerYear" element="div" cssClass="invalid-feedback" />
							</div>
							<div class="form-group">
								<label for="yearsInput">Number of Years</label>
								<form:input path="years" id="yearsInput" cssClass="form-control" />
								<form:errors path="years" element="div" cssClass="invalid-feedback" />
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