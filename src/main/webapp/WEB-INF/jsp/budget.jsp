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
   
    
<div id="logo"class="container">
<div>
<img src="resources/images/budget buddy logo.PNG">
</div>
</div>
<h1>Create Quick Budget</h1>
<form:form action="budget/result" modelAttribute="budget">
Enter Income: <form:input path="income"/>
<br>
<input type="submit" value="CalculateBudget"/>
</form:form>

</body>
</html>