<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<title>View Account - Budget Buddy</title>
	<jsp:include page="template/css-include.jsp"/>
	<jsp:include page="template/favicon.jsp"/>
</head>
<body>
	<jsp:include page="template/header.jsp"/>
	<div class="container">
		<div class="row">
			<div class="col-sm-8 col-lg-6 offset-sm-2 offset-lg-3">
				<div id="card" class="card">
					<h5 class="card-header">View Account</h5>
					<div class="card-body">
						<form:form modelAttribute="user">
							<c:if test="${param.updated != null}">
								<div class="alert alert-success" role="alert">
									Your account details have been updated successfully.
								</div>
							</c:if>
							<div class="form-group">
								<label for="emailInput">Email Address</label>
								<input type="email" value="${user.email}" id="emailInput" class="form-control" readonly/>
								<form:errors path="email" element="div"	cssClass="invalid-feedback"/>
							</div>
							<div class="form-group">
								<label for="nameInput">Name</label>
								<input value="${user.name}" id="nameInput" class="form-control" readonly/>
							</div>
							<div class="form-group">
								<label for="ageInput">Age</label>
								<input value="${user.age}" id="ageInput" class="form-control" readonly/>
							</div>
							<div class="form-group">
								<label>Actions</label>
								<br>
								<a href="${pageContext.request.contextPath}/account/update" class="btn btn-success">Update Account</a>
								<a href="${pageContext.request.contextPath}/account/delete" class="btn btn-danger" title="You will be asked for confirmation before deletion.">Delete Account</a>
							</div>
						</form:form>
					</div>
				</div>
			</div>
		</div>
	</div>
	<%@ include file="template/js-include.html"%>
</body>
</html>