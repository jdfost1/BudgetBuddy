<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<title>My Budget - Budget Buddy</title>
	<jsp:include page="template/css-include.jsp"/>
	<jsp:include page="template/favicon.jsp"/>
</head>
<body>
	<jsp:include page="template/header.jsp"/>
	<div class="container">
		<div class="row">
			<div class="col-sm-10 offset-sm-1">
				<div id="card" class="card">
					<h2 class="card-header">My Budget</h2>
					<div class="card-body">
						<ul class="nav nav-pills nav-justified" id="myTab" role="tablist">
							<li class="nav-item">
						    	<a class="nav-link active" id="home-tab" data-toggle="tab" href="#home" role="tab" aria-controls="home" aria-selected="true">Current</a>
							</li>
						  	<li class="nav-item">
						    	<a class="nav-link" id="profile-tab" data-toggle="tab" href="#profile" role="tab" aria-controls="profile" aria-selected="false">Suggested</a>
						  	</li>
						  	<li class="nav-item">
						    	<a class="nav-link" id="messages-tab" data-toggle="tab" href="#messages" role="tab" aria-controls="messages" aria-selected="false">Advice</a>
						  	</li>
						  	<li class="nav-item">
						    	<a class="nav-link" id="settings-tab" data-toggle="tab" href="#settings" role="tab" aria-controls="settings" aria-selected="false">Goal</a>
						  	</li>
						</ul>
						<hr>
						<div class="tab-content">
							<div class="tab-pane active" id="home" role="tabpanel" aria-labelledby="home-tab">
								<h3>Current Budget</h3>
								<p>Monthly budget generated with your current income, fixed expenses, and savings
									target.</p>
								<p>Housing: <fmt:formatNumber type="currency" value="${budget.rent}"/></p>
								<p>Utilities: <fmt:formatNumber type="currency" value="${budget.utilities}"/></p>
								<p>Car Payment: <fmt:formatNumber type="currency" value="${budget.carPayment}"/></p>
								<p>Car Insurance: <fmt:formatNumber type="currency" value="${budget.carInsurance}"/></p>
								<p>Other Bills: <fmt:formatNumber type="currency" value="${budget.remainingExpenses}"/></p>
								<p>Savings Target: <fmt:formatNumber type="currency" value="${budget.savingsTarget}"/></p>
								<p>General Savings: <fmt:formatNumber type="currency" value="${budget.generalSavings}"/></p>
								<p>Retirement: <fmt:formatNumber type="currency" value="${budget.retirement}"/></p>
								<p>Spending: <fmt:formatNumber type="currency" value="${budget.spending}"/></p>
								<a class="btn btn-outline-success" href="${pageContext.request.contextPath}/budget/create" role="button">Update Budget</a>
							</div>
						  	<div class="tab-pane" id="profile" role="tabpanel" aria-labelledby="profile-tab">
						  		<h3>Suggested Budget</h3>
								<p>Monthly budget suggested by Budget Buddy based off your income. Each category is the maximum you should be spending each month.</p>
								<p>Housing: <fmt:formatNumber type="currency" value="${suggestedBudget.housing}"/></p>
								<p>Utilities: <fmt:formatNumber type="currency" value="${suggestedBudget.utilities}"/></p>
								<p>Transportation: <fmt:formatNumber type="currency" value="${suggestedBudget.transportation}"/></p>
								<p>Retirement: <fmt:formatNumber type="currency" value="${suggestedBudget.retirement}"/></p>
								<p>Spending: <fmt:formatNumber type="currency" value="${suggestedBudget.spending}"/></p>
								<p>Food: <fmt:formatNumber type="currency" value="${suggestedBudget.food}"/></p>
								<p>Savings: <fmt:formatNumber type="currency" value="${suggestedBudget.savings}"/></p>
								<p>Miscellaneous: <fmt:formatNumber type="currency" value="${suggestedBudget.miscellaneous}"/></p>
						  	</div>
						  	<div class="tab-pane" id="messages" role="tabpanel" aria-labelledby="messages-tab">
						  		<h3>Budget Advice</h3>
								<p>Advice from Budget Buddy based of your calculated suggested budget and current budget.</p>
								<p>${budgetAdvice.housingMessage}</p>
								<p>${budgetAdvice.transportationMessage}</p>
								<p>${budgetAdvice.utilitiesMessage}</p>
						  	</div>
						  	<div class="tab-pane" id="settings" role="tabpanel" aria-labelledby="settings-tab">
						  		<h3>Savings Goal Summary</h3>
								<p>Real Time of Savings Goal Status</p>
								<p>Savings Goal: <fmt:formatNumber type="currency" value="${savingsTarget.savingsTargetTotal}"/></p>
								<p>Monthly Savings Goal: <fmt:formatNumber type="currency" value="${savingsTarget.monthlySavingsTarget}"/></p>
								<p>Savings Goal Start Date: ${savingsTarget.getFormattedStartDate(savingsTarget.startDate)}</p>
								<p>Savings Goal End Date: ${savingsTarget.getFormattedEndDate(savingsTarget.endDate) }</p>
								<p>Days Remaining to reach Savings Goal: ${savingsTarget.daysLeft}</p>
						  	</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<%@ include file="template/js-include.html"%>
</body>
</html>