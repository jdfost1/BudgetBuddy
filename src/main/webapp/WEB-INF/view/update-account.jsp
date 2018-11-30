<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<title>Update Account - Budget Buddy</title>
	<jsp:include page="template/css-include.jsp"/>
	<jsp:include page="template/favicon.jsp"/>
</head>
<body>
	<jsp:include page="template/header.jsp"/>
	<div class="container">
		<div class="row">
			<div class="col-sm-8 col-lg-6 offset-sm-2 offset-lg-3">
				<div id="card" class="card">
					<h5 class="card-header">Update Account</h5>
					<div class="card-body">
						<form:form action="${userActionUrl}" method="post" modelAttribute="userUpdate">
							<div class="alert alert-primary" role="alert">
							  To update your account details, change any of the values below.
							  <br>
							  When you are finished, hit the 'Update' button.
							</div>
							<div class="form-group">
								<label for="emailInput">Email Address</label>
								<form:input type="email" path="email" id="emailInput" cssClass="form-control"/>
								<form:errors path="email" element="div"	cssClass="invalid-feedback"/>
							</div>
							<div class="form-group">
								<label for="changePasswordButton">Password</label>
								<br>
								<a href="${pageContext.request.contextPath}/account/change-password" id="changePasswordButton" class="btn btn-outline-success" role="button">Change Password</a>
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
							<button type="submit" class="btn btn-block btn-success">Update</button>
						</form:form>
					</div>
				</div>
			</div>
		</div>
	</div>
	<%@ include file="template/js-include.html"%>
</body>
</html>