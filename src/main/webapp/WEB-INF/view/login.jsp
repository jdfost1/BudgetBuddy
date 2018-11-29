<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<title>Login - Budget Buddy</title>
	<jsp:include page="template/css-include.jsp"/>
	<jsp:include page="template/favicon.jsp"/>
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
	<jsp:include page="template/header.jsp"/>
	<div class="container">
		<div class="row">
			<div class="col-sm-8 col-lg-6 offset-sm-2 offset-lg-3">
				<div id="card" class="card">
					<h5 class="card-header">Please Sign In</h5>
					<div class="card-body">
						<div class="logo-container">
							<img src="${pageContext.request.contextPath}/resources/img/logo_white.png" width="100" height="100">
						</div>
						<form:form action="process-login">
							<c:if test="${param.error != null}">
								<div class="alert alert-danger" role="alert">
									The email or password you have entered is invalid.
									<br>
									<a href="${pageContext.request.contextPath}/account/reset-password" class="alert-link">Forgot your password? ></a>
								</div>
							</c:if>
							<c:if test="${param.logout != null}">
								<div class="alert alert-success">
									You have been logged out successfully.
								</div>
							</c:if>
							<c:if test="${param.accessDenied != null}">
								<div class="alert alert-danger">
									Please log in to access that page.
								</div>
							</c:if>
							<c:if test="${param.emailUpdated != null}">
								<div class="alert alert-warning">
									Your email has been updated successfully. Please log in with the new email address.
								</div>
							</c:if>
							<c:if test="${param.accountCreated != null }">
								<div class="alert alert-success">
									Your account has been created successfully. Please log in to create your budget.
								</div>
							</c:if>
							<c:if test="${param.accountDeleted != null}">
								<div class="alert alert-success">
									Your account has been deleted successfully.
								</div>
							</c:if>
							<c:if test="${param.passwordReset != null}">
								<div class="alert alert-success">
									Your password has been reset successfully. You will receive an email with a temporary new password.
								</div>
							</c:if>
							<div class="form-group">
							    <input type="email" id="emailInput" class="form-control form-control-lg" name="email" placeholder="Email" />
							    <input type="password" id="passwordInput" class="form-control form-control-lg" name="password" placeholder="Password"/>
							</div>
							<button type="submit" id="submitButton" class="btn btn-lg btn-block btn-success">Log In</button>
							<a href="${pageContext.request.contextPath}/account/sign-up">Don't have an account? Sign Up</a>	
						</form:form>
					</div>
				</div>
			</div>
		</div>
	</div>
	<%@ include file="template/js-include.html"%>
</body>
</html>