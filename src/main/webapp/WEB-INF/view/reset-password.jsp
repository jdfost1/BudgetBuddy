<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<title>Reset Password - Budget Buddy</title>
	<jsp:include page="template/css-include.jsp"/>
	<jsp:include page="template/favicon.jsp"/>
</head>
<body>
	<jsp:include page="template/header.jsp"/>
	<div class="container">
		<div class="row">
			<div class="col-sm-8 col-lg-6 offset-sm-2 offset-lg-3">
				<div id="card" class="card">
					<h5 class="card-header">Reset Password</h5>
					<div class="card-body">
						<form:form action="${userActionUrl}" method="post" modelAttribute="userDelete">
							<div class="alert alert-primary" role="alert">
							  To reset your password, enter your email address and press "Reset Password".
							</div>
							<div class="form-group">
								<label for="emailInput">Email Address</label>
								<form:input type="email" path="email" id="emailInput" cssClass="form-control"/>
								<form:errors path="email" element="div"	cssClass="invalid-feedback"/>
								<c:if test="${userNotExist}">
									<div class="invalid-feedback">The email address entered does not match any user account.</div>
								</c:if>
							</div>
							<button type="submit" class="btn btn-block btn-success">Reset Password</button>
						</form:form>
					</div>
				</div>
			</div>
		</div>
	</div>
	<%@ include file="template/js-include.html"%>
</body>
</html>