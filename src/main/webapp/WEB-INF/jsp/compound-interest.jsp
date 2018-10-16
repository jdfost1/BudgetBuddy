<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Compound Interest Calculator - Budget Buddy</title>
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
   
    

	<div id="bottom"class="container">
      <div class="row">
         <div class="col-md-4 col-md-offset-4">
            <div class="panel panel-default">
               <div class="panel-heading">
                  <h3 class="panel-title"><strong>Calculate Compound Interest</strong></h3>
               </div>
               <div id="panelBody" class="panel-body">
	<form:form action="compound-interest-result" modelAttribute="interest" >
		 
		 <div class="input-group input-sm">
		 <label id="balanceLabel"class="input-group-addon" for="Starting Balance:">
		 <i class="fa fa-user">Starting Balance:</i></label> 
		 <form:input path="principal"/>
		</div><br>
		
		 <div class="input-group input-sm">
		 <label id="returnLabel"class="input-group-addon" for="Starting Balance:">
		 <i class="fa fa-user">Interest Rate (%):</i></label> 
		 <form:input path="interestRate"/>
		</div><br>
		
		<div class="input-group input-sm">
		 <label id="returnLabel"class="input-group-addon" for="Starting Balance:">
		 <i class="fa fa-user">Number of Times Compounded Per Year:</i></label>
		 <form:input path="compoundsPerYear"/>
		</div><br>
		
		 <div class="input-group input-sm">
		 <label id="yearsLabel"class="input-group-addon" for="Starting Balance:">
		 <i class="fa fa-user">Number of Years:</i></label> 
		 <form:input path="years"/>
		 </div>
		<br>
		
		<div class="form-actions">
		<input id="loginButton"type="submit" value="Calculate"/></div>
	</form:form>
	</div>
	 </div>
            </div>
         </div>
      </div>
      
       -->
  	 <form:form action="compound-interest-result" modelAttribute="interest" >
		Starting Balance: <form:input path="principal"/>
		<form:errors path="principal" cssClass="error"/>
		<br>
		Interest Rate (%): <form:input path="interestRate"/>
		<form:errors path="interestRate" cssClass="error"/>
		<br>
		Number of Times Compounded Per Year: <form:input path="compoundsPerYear"/>
		<form:errors path="compoundsPerYear" cssClass="error"/>
		<br>
		Number of Years: <form:input path="years"/>
		<form:errors path="years" cssClass="error"/>
		<br>
		<input type="submit" value="Calculate"/>
	</form:form>
	
	
</body>
</html>