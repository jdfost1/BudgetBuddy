<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- Security Authorization -->
<sec:authorize var="auth" access="hasAuthority('USER')" />

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<title>Budget Buddy</title>
	<jsp:include page="template/css-include.jsp" />
	<jsp:include page="template/favicon.jsp" />
</head>
<body>
	<jsp:include page="template/header.jsp" />
	<div class="hero">
		<h1 class="hero-heading align-middle">Achieve your financial freedom.</h1>
	</div>
	<div class="container">
		<div class="row">
			<c:if test="${auth}">
				<c:if test="${budget == null}">
					<div class="col mt-5 mb-3">
						<h2>Create Your Budget</h2>
						<p>Ready to start creating your budget and handling your finances? Click the button below to get started.</p>
						<a class="btn btn-success btn-lg" href="${pageContext.request.contextPath}/budget/create" role="button">Create Budget</a>
					</div>
				</c:if>
				<c:if test="${budget != null}">
					<div class="col mt-5 mb-3">
						<h2>My Budget</h2>
						<p>Jump back in and view your budget. Get a handle on your personal finances.</p>
						<a class="btn btn-success btn-lg" href="${pageContext.request.contextPath}/budget" role="button">View Budget</a>
					</div>
				</c:if>
			</c:if>
			<c:if test="${!auth}">
				<div class="col mt-5 mb-3">
					<h2>Budget Buddy</h2>
					<p>This is budgeting done right. Tools for breaking down your budget
						into key areas and giving you advice on how to achieve your goals.</p>
					<div class="sl">
						<a class="btn btn-success sl-btn" href="${pageContext.request.contextPath}/account/sign-up" role="button">Sign Up Free</a>
						<span class="mt-2 mb-2" style="text-align:center;">OR</span>
						<a class="btn btn-outline-success sl-btn" href="${pageContext.request.contextPath}/account/login" role="button">Log In</a>
					</div>
				</div>
			</c:if>
		</div>
		<hr>
		<div class="row">
			<div class="col mt-3 mb-4">
				<c:if test="${auth}">
					<h2>Financial Quick Tools</h2>
					<p>Try out our financial quick tools to gain fast insight into your finances.</p>
				</c:if>
				<c:if test="${!auth}">
					<h2>Not ready to sign up?</h2>
					<p>Try our financial quick tools! These tools give you quick insight into your finances without needing an account.</p>
				</c:if>
				<jsp:include page="template/quick-tools-cards.jsp"/>
			</div>
		</div>
	</div>
	<jsp:include page="template/footer.jsp" />
	<%@ include file="template/js-include.html"%>
</body>
</html>