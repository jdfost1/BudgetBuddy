<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
    <!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<head>
<meta charset="ISO-8859-1">
<title>Compound Interest Calculator - Budget Buddy</title>
</head>
<body>
<style type="text/css">
body{
background-color:green;
}

#theForm{
font-weight:bold;
algin:center;
  width: 650px;
    font-size: 18px;
    background: white;
    padding: 30px 30px 15px 30px;
    border: 5px solid black;
   
}
#bottom{
background-color:green;}
#form1{
color:black;
text-align:center;
font-size:25px;}
#loginButton{
background-color:green;
color:white;
}
#header{
background-color:black;
color:white;
}
h1{
text-align:center;
color:white;
}
a{
color:white;
}

ul{
    list-style-type: none;
}
#logo{
    text-align:center;
    background-color:black;
}
.panelTitle{font-weight:bold;}

</style>
<body>
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
	<form:form action="compound-interest-calculator/result" modelAttribute="interest" >
		 
		 <div class="input-group input-sm">
		 <label class="input-group-addon" for="Starting Balance:">
		 <i class="fa fa-user">Starting Balance:</i></label> 
		 <form:input path="startingBalance"/>
		</div><br>
		
		 <div class="input-group input-sm">
		 <label class="input-group-addon" for="Starting Balance:">
		 <i class="fa fa-user">Annual Rate of Return:</i></label> 
		 <form:input path="annualRateOfReturn"/>
		</div><br>
		
		 <div class="input-group input-sm">
		 <label class="input-group-addon" for="Starting Balance:">
		 <i class="fa fa-user">Number of Years:</i></label> 
		 <form:input path="timeYears"/>
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
   
</body>
</html>