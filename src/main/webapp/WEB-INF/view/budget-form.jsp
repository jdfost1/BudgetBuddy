<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<title>Create Budget - Budget Buddy</title>
	<jsp:include page="template/css-include.jsp"/>
	<jsp:include page="template/favicon.jsp"/>
</head>
<body>
	<jsp:include page="template/header.jsp"/>
	<div class="container">
		<div class="row">
			<div class="col-sm-8 col-lg-6 offset-sm-2 offset-lg-3">
				<div id="card" class="card">
					<h5 class="card-header">Create New Budget</h5>
					<div class="card-body">
						<form:form action="${pageContext.request.contextPath}/budget/create/savings-target" modelAttribute="budgetForm">
							<div class="form-group">
								<label for="annualIncome">Enter your annual income</label>
								<form:input  path="income" id="income" cssClass="form-control"/>
							</div>
							<div class="form-group">
								<label for="annualIncome">Enter the total amount for your desired savings goal </label>
								<form:input  path="savingsTarget" id="savingsTarget" cssClass="form-control"/>
							</div>
							<div class="form-group">
								<label for="annualIncome">Enter the amount you currently pay monthly for housing (rent/mortgage)</label>
								<form:input  path="rent" id="rent" cssClass="form-control"/>
							</div>
							<div class="form-group">
								<label for="annualIncome">Enter the amount you currently pay monthly for your auto loan </label>
								<form:input  path="carPayment" id="carPayment" cssClass="form-control"/>
							</div>
							<div class="form-group">
								<label for="annualIncome">Enter the amount you pay monthly for auto insurance</label>
								<form:input  path="carInsurance" id="carInsurance" cssClass="form-control"/>
							</div>
							<div class="form-group">
								<label for="annualIncome">Enter the amount you pay monthly for utilities (gas, electric, water, etc.)</label>
								<form:input  path="utilities" id="utilities" cssClass="form-control"/>
							</div>
							<div class="form-group">
								<label for="annualIncome">Enter the amount you pay monthly for the total of any remaining fixed expenses</label>
								<form:input  path="remainingExpenses" id="remainingExpenses" cssClass="form-control"/>
							</div>
							<button type="submit" id="submitButton" class="btn btn-block btn-success">Submit</button>
						</form:form>
					</div>
				</div>
			</div>
		</div>
	</div>
	<%@ include file="template/js-include.html"%>
</body>
</html>