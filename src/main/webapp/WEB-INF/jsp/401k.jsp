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
text-align:center;
color:black;
}
button{
background-color:black;}

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
h5{
color:white;
font-size:30px;}
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
   
      
       <div class="container">
     	<div class="row">
     		<div class="col-md-6 offset-md-3">
	     		<div id="card" class="card">
				  <h5 class="card-header">401k Calculator</h5>
				  <div class="card-body">
				   <form:form action="401kResult" modelAttribute="account">
					 	
						
						 <div class="form-group">
		 <label id="incomeLabel"class="input-group-addon" for="salary">
		 <i class="fa fa-user">Enter your annual salary:</i></label> 
		 <form:input path= "salary"  cssClass="form-control"/>
		</div><br>
		
		<div class="form-group">
		 <label id="incomeLabel"class="input-group-addon" for="income">
		 <i class="fa fa-user">Enter the percent of your paycheck that you contribute:</i></label> 
		 <form:input path="contribution"  cssClass="form-control"/>
		</div><br>
		<div class="form-group">
		 <label id="incomeLabel"class="input-group-addon" for="income">
		 <i class="fa fa-user">Enter the percent of expected annual rate of return:</i></label> 
		 <form:input path="rate"  cssClass="form-control"/>
		</div><br>
		
		<div class="form-group">
		 <label id="incomeLabel"class="input-group-addon" for="income">
		 <i class="fa fa-user">Enter your current age:</i></label> 
		 <form:input path="age"  cssClass="form-control"/>
		</div><br>
		
		<div class="form-group">
		 <label id="incomeLabel"class="input-group-addon" for="income">
		 <i class="fa fa-user">Enter age you want to retire:</i></label> 
		 <form:input path="retireAge"  cssClass="form-control"/>
		</div><br>
		
		<div class="form-group">
		 <label id="incomeLabel"class="input-group-addon" for="income">
		 <i class="fa fa-user">Enter the percent of your contribution your employer will match:</i></label> 
		 <form:input path="employerMatch"  cssClass="form-control"/>
		</div><br>
		
		<div class="form-group">
		 <label id="incomeLabel"class="input-group-addon" for="income">
		 <i class="fa fa-user">Enter the percent at which your employer match ends:</i></label> 
		 <form:input path="employerMatchEnd"  cssClass="form-control"/>
		</div><br>
		
		<div class="form-group">
		 <label id="incomeLabel"class="input-group-addon" for="income">
		 <i class="fa fa-user">Enter your current balance:</i></label> 
		 <form:input path="currentBalance"  cssClass="form-control"/>
		 </div><br>	
						
						<button type="submit" class="btn btn-primary">Calculate</button>
					</form:form>
				  </div>
				</div>
     		</div>
     	</div>
     </div>

</body>
</html>