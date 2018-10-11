<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
<title>Quick Budget</title>
</head>
<body>
<style type="text/css">
body{
background-color:green;
}

#panelBody{
background-color:black;
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
#loginButton{
color:white;
font-weight:bold;
background-color:green;}
#incomeLabel{
background-color:green;
color:white;}

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
                  <h3 class="panel-title"><strong>Calculate 401k Balance</strong></h3>
               </div>
               <div id="panelBody" class="panel-body">
	<form:form action="401kResult" modelAttribute="account">
		 
		 <div class="input-group input-sm">
		 <label id="incomeLabel"class="input-group-addon" for="income">
		 <i class="fa fa-user">Enter annual salary:</i></label> 
		 <form:input path="salary"/>
		</div><br>
		
		<div class="input-group input-sm">
		 <label id="incomeLabel"class="input-group-addon" for="income">
		 <i class="fa fa-user">Enter expected rate of return:</i></label> 
		 <form:input path="rate"/>
		</div><br>
		
		<div class="input-group input-sm">
		 <label id="incomeLabel"class="input-group-addon" for="income">
		 <i class="fa fa-user">Enter age:</i></label> 
		 <form:input path="age"/>
		</div><br>
		
		<div class="input-group input-sm">
		 <label id="incomeLabel"class="input-group-addon" for="income">
		 <i class="fa fa-user">Enter age you want to retire:</i></label> 
		 <form:input path="retireAge"/>
		</div><br>
		
		<div class="input-group input-sm">
		 <label id="incomeLabel"class="input-group-addon" for="income">
		 <i class="fa fa-user">Enter the percent of contribution your employer will match up to:</i></label> 
		 <form:input path="employerMatch"/>
		</div><br>
		
		<div class="input-group input-sm">
		 <label id="incomeLabel"class="input-group-addon" for="income">
		 <i class="fa fa-user">Enter your employer match:</i></label> 
		 <form:input path="employerMatchEnd"/>
		</div><br>
		
		<div class="input-group input-sm">
		 <label id="incomeLabel"class="input-group-addon" for="income">
		 <i class="fa fa-user">Enter your current balance:</i></label> 
		 <form:input path="currentBalance"/>
		</div><br>
		
	
		
		
		
		
		<div class="form-actions">
		<input id="loginButton"type="submit" value="Calculate Nest Egg"/></div>
	</form:form>
	</div>
	 </div>
            </div>
         </div>
      </div>

</body>
</html>