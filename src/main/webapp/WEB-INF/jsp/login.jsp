<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<title>Login - Budget Buddy</title>
	<%@ include file="template/css-include.html"%>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/common.css" />
	<style>
		#emailInput { 
			border-bottom-left-radius: 0;
			border-bottom-right-radius: 0;
		}
		
		#passwordInput { 
			border-top: none; 
			border-top-left-radius: 0;
			border-top-right-radius: 0;
		}
	</style>
</head>
<body>
	<%@ include file="template/header.html"%>
	<div class="container">
		<div class="row">
			<div class="col-sm-8 col-lg-6 offset-sm-2 offset-lg-3">
				<div id="card" class="card">
					<h5 class="card-header">Please Sign In</h5>
					<div class="card-body">
						<c:url var="loginUrl" value="/account/login" />
						<form:form action="login/loginValidate" modelAttribute="loginForm" class="form-horizontal">

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
									<p>Access Denied: You are not authorized!</p>
								</div>
							</c:if>
							
							<div class="form-group">
							    <form:input type="email" id="emailInput" path="userName" class="form-control form-control-lg" name="emailInput" placeholder="Email" />
							    <form:input type="password" id="passwordInput" path="password" class="form-control form-control-lg" name="passwordInput" placeholder="Password"/>
							</div>
							<button type="submit" id="submitButton" class="btn btn-lg btn-block btn-success">Log In</button>
							<a href="sign-up">Don't have an account? Sign Up</a>
						</form:form>
					</div>
				</div>
			</div>
		</div>
	</div>
	<%@ include file="template/js-include.html"%>
</body>
</html>