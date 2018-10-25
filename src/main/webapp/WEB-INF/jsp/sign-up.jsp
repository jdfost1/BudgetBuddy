<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Sign Up - Budget Buddy</title>
	<%@ include file="template/css-include.html"%>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/common.css" />
</head>
<body>
	<%@ include file="template/header.html"%>

	<div id="bottom" class="container">
		<div class="row">
			<div class="col-md-4 col-md-offset-4">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title">Create New Account</h3>
					</div>
					<div id="panelBody" class="panel-body">
						<c:url var="loginUrl" value="/login" />
						<form action="${loginUrl}" method="post">
							<div class="input-group input-sm">
								<label class="input-group-addon" for="username"><i
									class="fa fa-user"></i></label> <input type="text" class="form-control"
									id="userId" name="userId" placeholder="Enter First Name"
									required>
							</div>
							<div class="input-group input-sm">
								<label class="input-group-addon" for="username"><i
									class="fa fa-user"></i></label> <input type="text" class="form-control"
									id="userId" name="userId" placeholder="Enter Last Name"
									required>
							</div>
							<div class="input-group input-sm">
								<label class="input-group-addon" for="username"><i
									class="fa fa-user"></i></label> <input type="text" class="form-control"
									id="userId" name="userId" placeholder="Enter Email Address"
									required>
							</div>
							<div class="input-group input-sm">
								<label class="input-group-addon" for="username"><i
									class="fa fa-user"></i></label> <input type="text" class="form-control"
									id="userId" name="userId" placeholder="Enter Birthday" required>
							</div>
							<div class="input-group input-sm">
								<label class="input-group-addon" for="username"><i
									class="fa fa-user"></i></label> <input type="text" class="form-control"
									id="userId" name="userId" placeholder="Enter Username" required>
							</div>
							<div class="input-group input-sm">
								<label class="input-group-addon" for="password"><i
									class="fa fa-lock"></i></label> <input type="password"
									class="form-control" id="password" name="password"
									placeholder="Enter Password" required>
							</div>
							<div class="input-group input-sm">
								<label class="input-group-addon" for="password"><i
									class="fa fa-lock"></i></label> <input type="password"
									class="form-control" id="password" name="password"
									placeholder="Confirm Password" required>
							</div>
							<button type="submit" id="submitButton" class="btn btn-block btn-success">Sign Up</button>
							<a href="login">Already have an account? Log In</a>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>

	<%@ include file="template/js-include.html"%>
</body>
</html>