<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<style type="text/css">
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
background-color:green;}
</style>
<head>
	<meta charset="UTF-8">
	<title>Login - Budget Buddy</title>
	<%@ include file="template/css-include.html"%>
</head>
<body>
	<%@ include file="template/header.html"%>
 
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
                  <h3 class="panel-title">Please sign in</h3>
               </div>
               <div id="panelBody" class="panel-body">
				<c:url var="loginUrl" value="/login" />
                  <form action="${loginUrl}" method="post" class="form-horizontal">
                     
                     <c:if test="${param.error != null}">
                        <div class="alert alert-danger">
                           <p>Invalid username and password.</p>
                        </div>
                     </c:if>
                     
                     <c:if test="${param.logout != null}">
                        <div class="alert alert-success">
                           <p>You have been logged out successfully.</p>
                        </div>
                     </c:if>
                     
                     <c:if test="${param.accessDenied != null}">
                        <div class="alert alert-danger">
                           <p>Access Denied: You are not authorised! </p>
                        </div>
                     </c:if>
                     
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
   <%@ include file="template/js-include.html"%>
</body>
</html>