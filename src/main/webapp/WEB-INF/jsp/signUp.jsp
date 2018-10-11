<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<style type="text/css">
h3{
font-weight:bold;}
#section{
background-color:black;
}
#jumbo{
background-color:green;
}
h1{
text-align:center;}

#head1{
background-color:green;
color:white;
}
#body{
background-color:black;
}
head{
background-color:green;
color:white;
}
#panelBody{
background-color:black;}
#bottom{
background-color:black;}
#loginButton{
background-color:green;
}
</style>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
   href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>Budget Buddy Login</title>
</head>
<body id="body">
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
              <li><a href="quickBudget.html">Quick Budget</a></li>
              <li><a href="401k.html">401k Calculator</a></li>
              <li><a href="compoundInterest.html">Compound Interest Calculator</a></li>
              </ul></li>
      
              
                <li class="active">
          <a  href="login.html">Login
         </a>
          </li>
               <li class="active">
          <a  href="signup.html">Sign Up
         </a>
          </li>
    </ul>
  </div>
</nav>
   <section>
      <div id="jumbo"class="jumbotron">
         <div id="head1"class="container">
            <h1><img src="resources/images/budget buddy logo.PNG"></h1>
            
         </div>
      </div>
   </section>
   
   <div id="bottom"class="container">
      <div class="row">
         <div class="col-md-4 col-md-offset-4">
            <div class="panel panel-default">
               <div class="panel-heading">
                  <h3 class="panel-title">Create New Account</h3>
               </div>
               <div id="panelBody" class="panel-body">
<c:url var="loginUrl" value="/login" />
                  <form action="${loginUrl}" method="post" >
                     
                  
                     
                     <div class="input-group input-sm">
                        <label class="input-group-addon" for="username"><i
                           class="fa fa-user"></i></label> <input type="text" class="form-control"
                           id="userId" name="userId" placeholder="Enter First Name"
                           required>
                     </div>
                      <div class="input-group input-sm">
                        <label class="input-group-addon" for="username"><i
                           class="fa fa-user"></i></label> <input type="text" class="form-control"
                           id="userId" name="userId" placeholder="Enter Last Name"
                           required>
                     </div>
                     <div class="input-group input-sm">
                        <label class="input-group-addon" for="username"><i
                           class="fa fa-user"></i></label> <input type="text" class="form-control"
                           id="userId" name="userId" placeholder="Enter Email Address"
                           required>
                     </div>
                      <div class="input-group input-sm">
                        <label class="input-group-addon" for="username"><i
                           class="fa fa-user"></i></label> <input type="text" class="form-control"
                           id="userId" name="userId" placeholder="Enter Birthday"
                           required>
                     </div>
                      <div class="input-group input-sm">
                        <label class="input-group-addon" for="username"><i
                           class="fa fa-user"></i></label> <input type="text" class="form-control"
                           id="userId" name="userId" placeholder="Enter Username"
                           required>
                     </div>
                     <div class="input-group input-sm">
                        <label class="input-group-addon" for="password"><i
                           class="fa fa-lock"></i></label> <input type="password"
                           class="form-control" id="password" name="password"
                           placeholder="Enter Password" required>
                     </div>
                       <div class="input-group input-sm">
                        <label class="input-group-addon" for="password"><i
                           class="fa fa-lock"></i></label> <input type="password"
                           class="form-control" id="password" name="password"
                           placeholder="Confirm Password" required>
                     </div>

                     <div class="form-actions">
                        <input type="submit"
                           id="loginButton"class="btn btn-block btn-primary btn-default" value="Log in">
                     </div>
                  </form>
               </div>
            </div>
         </div>
      </div>
   </div>
</body>