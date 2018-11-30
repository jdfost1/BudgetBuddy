<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<title>Change Password - Budget Buddy</title>
	<jsp:include page="template/css-include.jsp"/>
	<jsp:include page="template/favicon.jsp"/>
</head>
<body>
	<jsp:include page="template/header.jsp"/>
	<div class="container">
		<div class="row">
			<div class="col-sm-8 col-lg-6 offset-sm-2 offset-lg-3">
				<div id="card" class="card">
					<h5 class="card-header">Change Password</h5>
					<div class="card-body">
						<form:form action="${userActionUrl}" method="post" modelAttribute="userPasswordUpdate">
							<div class="form-group">
								<label for="currentPasswordInput">Current Password</label>
								<form:input type="password" path="currentPassword" id="currentPasswordInput" cssClass="form-control"/>
								<form:errors path="currentPassword" element="div" cssClass="invalid-feedback"/>
								<c:if test="${incorrectCurrentPassword}">
									<div class="invalid-feedback">The password you entered does not match your current password.</div>
								</c:if>
							</div>
							<div class="form-group">
								<label for="newPasswordInput">New Password</label>
								<form:input type="password" path="newPassword" id="newPasswordInput" cssClass="form-control"/>
								<form:errors path="newPassword" element="div" cssClass="invalid-feedback"/>
							</div>
							<div class="form-group">
								<label for="matchingNewPasswordInput">Confirm New Password</label>
								<form:input type="password" path="matchingNewPassword" id="matchingNewPasswordInput" cssClass="form-control"/>
								<form:errors path="matchingNewPassword" element="div" cssClass="invalid-feedback"/>
							</div>
							<button type="submit" class="btn btn-block btn-success">Change Password</button>
						</form:form>
					</div>
				</div>
			</div>
		</div>
	</div>
	<%@ include file="template/js-include.html"%>
</body>
</html>