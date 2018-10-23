<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>401k Calculator - Budget Buddy</title>
<%@ include file="template/css-include.html"%>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/common.css" />
</head>
<body>
	<%@ include file="template/header.html"%>
	<div class="container">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<div id="card" class="card">
					<h5 class="card-header">401k Calculator</h5>
					<div class="card-body">
						<form:form action="401kResult" modelAttribute="account">
							<div class="form-group">
								<label for="salary">Annual salary</label>
								<form:input path="salary" cssClass="form-control" />
							</div>
							<div class="form-group">
								<label for="income">Percent of your paycheck that you contribute</label>
								<form:input path="contribution" cssClass="form-control" />
							</div>
							<div class="form-group">
								<label for="income">Percent of expected annual rate of return</label>
								<form:input path="rate" cssClass="form-control" />
							</div>
							<div class="form-group">
								<label for="income">Current age</label>
								<form:input path="age" cssClass="form-control" />
							</div>
							<div class="form-group">
								<label for="income">Age you want to retire</label>
								<form:input path="retireAge" cssClass="form-control" />
							</div>
							<div class="form-group">
								<label for="income">Percent of your contribution your employer will match</label>
								<form:input path="employerMatch" cssClass="form-control" />
							</div>
							<div class="form-group">
								<label for="income">Percent at which your employer match ends</label>
								<form:input path="employerMatchEnd" cssClass="form-control" />
							</div>
							<div class="form-group">
								<label for="income">Current balance</label>
								<form:input path="currentBalance" cssClass="form-control" />
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