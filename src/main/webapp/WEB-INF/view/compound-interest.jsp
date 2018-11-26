<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<title>Compound Interest Calculator - Budget Buddy</title>
	<jsp:include page="template/css-include.jsp"/>
	<jsp:include page="template/favicon.jsp"/>
</head>
<body>
	<jsp:include page="template/header.jsp"/>
	<div class="container">
		<div class="row">
			<div class="col-sm-8 col-lg-6 offset-sm-2 offset-lg-3">
				<div id="card" class="card">
					<h5 class="card-header">Compound Interest Calculator</h5>
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