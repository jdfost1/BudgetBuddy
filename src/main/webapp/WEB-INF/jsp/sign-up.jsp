<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<title>Sign Up - Budget Buddy</title>
	<%@ include file="template/css-include.html"%>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/common.css" />
</head>
<body>
	<%@ include file="template/header.html"%>
	<div class="container">
		<div class="row">
			<div class="col-sm-8 col-lg-6 offset-sm-2 offset-lg-3">
				<div id="card" class="card">
					<h5 class="card-header">Create Account</h5>
					<div class="card-body">
						
						<form  action="new-account-confirmation"  modelAttribute="newAccount">
							<div class="input-group input-sm">
								<label class="input-group-addon" for="firstName"><i
									class="fa fa-user"></i></label> <input type="text" class="form-control"
									id="firstName" name="firstName" path="firstName" placeholder="Enter First Name"
									required>
							</div>
							<div class="input-group input-sm">
								<label class="input-group-addon" for="lastName"><i
									class="fa fa-user"></i></label> <input type="text" class="form-control"
									id="lastName" name="lastName"path="lastName" placeholder="Enter Last Name"
									required>
							</div>
							<div class="input-group input-sm">
								<label class="input-group-addon" for="email"><i
									class="fa fa-user"></i></label> <input type="text" class="form-control"
									id="email" name="email" path = "email"placeholder="Enter Email Address"
									required>
							</div>
							<div class="input-group input-sm">
								<label class="input-group-addon" for="birthday"><i
									class="fa fa-user"></i></label> <input type="text" class="form-control"
									id="birthday" name="age"path="age" placeholder="Enter Birthday" required>
							</div>
								<div class="input-group input-sm">
								<label class="input-group-addon" for="salary"><i
									class="fa fa-user"></i></label> <input type="text" class="form-control"
									id="salary" name="salary" path="salary" placeholder="Enter Annual Salary" required>
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