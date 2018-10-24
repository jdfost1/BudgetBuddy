<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
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
		
		#submitButton {
			margin-bottom: 20px;
		}
	</style>
</head>
<body>
	<%@ include file="template/header.html"%>
	<div class="container">
		<div class="row">
			<div class="col-md-5 offset-md-3">
				<div id="card" class="card">
					<h5 class="card-header">Please Sign In</h5>
					<div class="card-body">
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
									<p>Access Denied: You are not authorized!</p>
								</div>
							</c:if>
							
							<div class="form-group">
							    <input type="email" id="emailInput" class="form-control form-control-lg" name="userID" placeholder="Email" autofocus>
							    <input type="password" id="passwordInput" class="form-control form-control-lg"name="password" placeholder="Password">
							</div>
							<button type="submit" id="submitButton" class="btn btn-lg btn-block btn-success">Log In</button>
							<a href="signup">Don't have an account? Sign Up</a>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
	<%@ include file="template/js-include.html"%>
</body>
</html>