<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Compound Interest Calculator - Budget Buddy</title>
	<%@ include file="template/css-include.html" %>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/compound-interest.css"/>
</head>
<body>

<!-- 
   <nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="welcome.html">BudgetBuddy.com</a>
    </div>
    <ul class="nav navbar-nav">
      
      
      <li class="dropdown">
          <a class="dropdown-toggle" data-toggle="dropdown" href="#">Budget Tools
          <span class="caret"></span></a>
          <ul class="dropdown-menu">
              <li><a href="tools/budgetCalculator">Quick Budget</a></li>
              <li><a href="401k.html">401k Calculator</a></li>
              <li><a href="tools/compound-interest-calculator">Compound Interest Calculator</a></li>
              </ul></li>
      
              
                <li class="active">
          <a  href="login.html">Login
         </a>
          </li>
               <li class="active">
          <a  href="signUp.html">Sign Up
         </a>
          </li>
    </ul>
  </div>
</nav>
       -->
     
     <div class="container">
     	<div class="row">
     		<div class="col-md-6 offset-md-3">
	     		<div id="card" class="card">
				  <h5 class="card-header">Calculate Compound Interest</h5>
				  <div class="card-body">
				    <form:form action="compound-interest-result" modelAttribute="interest">
					 	<div class="form-group">
							<label for="principalInput">Starting Balance</label>
						    <form:input path="principal" id="principalInput" cssClass="form-control"/>
						    <form:errors path="principal" element="div" cssClass="invalid-feedback"/>
						</div>
						<div class="form-group">
							<label for="interestRateInput">Interest Rate (%)</label>
						    <form:input path="interestRate" id="interestRateInput" cssClass="form-control"/>
						    <form:errors path="interestRate" cssClass="error"/>
						</div>
						<div class="form-group">
							<label for="compoundsPerYearInput">Number of Times Compounded Per Year</label>
							<form:input path="compoundsPerYear" id="compoundsPerYearInput" cssClass="form-control"/>
							<form:errors path="compoundsPerYear" cssClass="error"/>
						</div>
						<div class="form-group">
							<label for="yearsInput">Number of Years</label>
							<form:input path="years" id="yearsInput" cssClass="form-control"/>
							<form:errors path="years" cssClass="error"/>
						</div>
						<button type="submit" class="btn btn-primary">Calculate</button>
					</form:form>
				  </div>
				</div>
     		</div>
     	</div>
     </div>
  	 
	<%@ include file="template/js-include.html" %>
</body>
</html>