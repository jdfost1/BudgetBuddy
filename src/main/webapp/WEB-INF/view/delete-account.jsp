<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<title>Delete Account - Budget Buddy</title>
	<jsp:include page="template/css-include.jsp"/>
	<jsp:include page="template/favicon.jsp"/>
</head>
<body>
	<jsp:include page="template/header.jsp"/>
	<div class="container">
		<div class="row">
			<div class="col-sm-8 col-lg-6 offset-sm-2 offset-lg-3">
				<div id="card" class="card">
					<h5 class="card-header">Delete Account</h5>
					<div class="card-body">
						<form:form action="${userActionUrl}" method="post" modelAttribute="userDelete">
							<div class="alert alert-danger" role="alert">
							  To delete your account and all of your data, enter your email address and press 'Delete'.
							  <br>
							  <br>
							  Warning: This action cannot be undone.
							</div>
							<div class="form-group">
								<label for="emailInput">Email Address</label>
								<form:input type="email" path="email" id="emailInput" cssClass="form-control"/>
								<form:errors path="email" element="div"	cssClass="invalid-feedback"/>
								<c:if test="${emailMismatch}">
									<div class="invalid-feedback">The email address entered does not match the email address used for your account.</div>
								</c:if>
							</div>
							<button type="submit" class="btn btn-block btn-danger">Delete</button>
						</form:form>
					</div>
				</div>
			</div>
		</div>
	</div>
	<%@ include file="template/js-include.html"%>
</body>
</html>