<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<title>Sign Up - Budget Buddy</title>
	<jsp:include page="template/css-include.jsp"/>
	<jsp:include page="template/favicon.jsp"/>
</head>
<body>
	<jsp:include page="template/header.jsp"/>
	<div class="container">
		<div class="row">
			<div class="col-sm-8 col-lg-6 offset-sm-2 offset-lg-3">
				<div id="card" class="card">
					<h5 class="card-header">Create Account</h5>
					<div class="card-body">

						<form:form action="${userActionUrl}" modelAttribute="userRegistration">
							<div class="form-group">
								<label for="emailInput">Email Address</label>
								<form:input type="email" path="email" id="emailInput" cssClass="form-control"/>
								<form:errors path="email" element="div"	cssClass="invalid-feedback"/>
							</div>
							<div class="form-group">
								<label for="nameInput">Name</label>
								<form:input path="name" id="nameInput" cssClass="form-control"/>
								<form:errors path="name" element="div" cssClass="invalid-feedback"/>
							</div>
							<div class="form-group">
								<label for="ageInput">Age</label>
								<form:input path="age" id="ageInput" cssClass="form-control"/>
								<form:errors path="age" element="div" cssClass="invalid-feedback"/>
							</div>
							<div class="form-group">
								<label for="passwordInput">Password</label>
								<form:input type="password" path="password" id="passwordInput" cssClass="form-control"/>
								<form:errors path="password" element="div" cssClass="invalid-feedback"/>
							</div>
							<div class="form-group">
								<label for="confirmPasswordInput">Confirm Password</label>
								<form:input type="password" path="matchingPassword" id="confirmPasswordInput" cssClass="form-control"/>
								<form:errors path="matchingPassword" element="div" cssClass="invalid-feedback"/>
							</div>
							<button type="submit" id="submitButton" class="btn btn-block btn-success">Sign Up</button>
							<a href="login">Already have an account? Log In</a>
						</form:form>
					</div>
				</div>
			</div>
		</div>
	</div>
	<%@ include file="template/js-include.html"%>
</body>
</html>