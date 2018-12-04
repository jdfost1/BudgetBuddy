<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<title>View Budget - Budget Buddy</title>
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
						<!-- Nav tabs -->
						<ul class="nav nav-tabs nav-fill" id="myTab" role="tablist">
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
						
						<!-- Tab panes -->
						<div class="tab-content">
							<div class="tab-pane active" id="home" role="tabpanel" aria-labelledby="home-tab">
								<h3>Current Budget</h3>
								<p>Monthly budget generated with your current income, fixed expenses, and savings
									target.</p>
								<a href="${pageContext.request.contextPath}/budget/create">Update Budget</a>
								<p> Housing: $${budget.rent }</p>
								<p>Utilities: $${budget.utilities}</p>
								<p>Car Payment: $${budget.carPayment}</p>
								<p>Car Insurance: $${budget.carInsurance}</p>
								
								<p>Other Bills: $${budget.remainingExpenses}</p>
								
								<p>Savings Target: $${budget.savingsTarget}</p>
								<p>General Savings: $${budget.generalSavings}</p>
								<p>Retirement: $${budget.retirement}</p>
								<p>Spending: $${budget.spending}</p>
							</div>
						  	<div class="tab-pane" id="profile" role="tabpanel" aria-labelledby="profile-tab">
						  		<h3>Suggested Budget</h3>
								<p>Monthly budget suggested by Budget Buddy based off your income. Each category is the maximum you should be spending each month.</p><br>
								<p>Housing: $${suggestedBudget.housing} </p>
								<p>Utilities: $${suggestedBudget.utilities}</p>
								<p>Transportation: $${suggestedBudget.transportation}</p>
								<p>Retirement: $${suggestedBudget.retirement}</p>
								<p>Spending: $${suggestedBudget.spending}</p>
								<p>Food: $${suggestedBudget.food }</p>
								<p>Savings: $${suggestedBudget.savings }</p>
								<p>Miscellaneous: $${suggestedBudget.miscellaneous }</p>
						  	</div>
						  	<div class="tab-pane" id="messages" role="tabpanel" aria-labelledby="messages-tab">
						  		<h3>Budget Advice</h3>
								<p>Advice from Budget Buddy based of your calculated suggested budget and current budget.</p><br>
								<p>${budgetAdvice.housingMessage }</p>
								<p>${budgetAdvice.transportationMessage }</p>
								<p>${budgetAdvice.utilitiesMessage }</p>
						  	</div>
						  	<div class="tab-pane" id="settings" role="tabpanel" aria-labelledby="settings-tab">
						  		<h3>Savings Goal Summary</h3>
								<p>Real Time of Savings Goal Status</p><br>
								<p>Savings Goal: $${savingsTarget.savingsTargetTotal}</p>
								<p>Monthly Savings Goal: $${savingsTarget.monthlySavingsTarget}</p>
								<p>Savings Goal Start Date: ${savingsTarget.getFormattedStartDate(savingsTarget.startDate)}</p>
								<p>Savings Goal End Date: ${savingsTarget.getFormattedEndDate(savingsTarget.endDate) }</p>
								<p>Days Remaining to reach Savings Goal: ${savingsTarget.daysLeft }</p>
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