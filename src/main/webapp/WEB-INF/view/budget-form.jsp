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
							<c:if test="${param.notCreated != null}">
								<div class="alert alert-warning">
									You must create your budget before you can view it.
								</div>
							</c:if>
							<div class="progress">
								<div class="progress-bar bg-success" role="progressbar" style="width: 50%;" aria-valuenow="50" aria-valuemin="0" aria-valuemax="100">Step 1 of 2</div>
							</div>
							<br>
							<div class="form-group">
								<label for="annualIncome">Annual Income</label>
								<form:input  path="income" id="income" cssClass="form-control"/>
								<form:errors path="income" element="div"	cssClass="invalid-feedback"/>
							</div>
							<div class="form-group">
								<label for="annualIncome">Savings Goal Amount</label>
								<form:input  path="savingsTarget" id="savingsTarget" cssClass="form-control"/>
								<form:errors path="savingsTarget" element="div"	cssClass="invalid-feedback"/>
							</div>
							<div class="form-group">
								<label for="annualIncome">Monthly Housing Payment (Rent/Mortgage)</label>
								<form:input  path="rent" id="rent" cssClass="form-control"/>
								<form:errors path="rent" element="div"	cssClass="invalid-feedback"/>
							</div>
							<div class="form-group">
								<label for="annualIncome">Monthly Auto Loan Payment</label>
								<form:input  path="carPayment" id="carPayment" cssClass="form-control"/>
								<form:errors path="carPayment" element="div"	cssClass="invalid-feedback"/>
							</div>
							<div class="form-group">
								<label for="annualIncome">Monthly Auto Insurance Payment</label>
								<form:input  path="carInsurance" id="carInsurance" cssClass="form-control"/>
								<form:errors path="carInsurance" element="div"	cssClass="invalid-feedback"/>
							</div>
							<div class="form-group">
								<label for="annualIncome">Monthly Utility Payment</label>
								<form:input  path="utilities" id="utilities" cssClass="form-control"/>
								<form:errors path="utilities" element="div"	cssClass="invalid-feedback"/>
							</div>
							<div class="form-group">
								<label for="annualIncome">Remaining Monthly Fixed Expenses Total</label>
								<form:input  path="remainingExpenses" id="remainingExpenses" cssClass="form-control"/>
								<form:errors path="remainingExpenses" element="div"	cssClass="invalid-feedback"/>
							</div>
							<button type="submit" id="submitButton" class="btn btn-block btn-success">Continue</button>
						</form:form>
					</div>
				</div>
			</div>
		</div>
	</div>
	<%@ include file="template/js-include.html"%>
</body>
</html>