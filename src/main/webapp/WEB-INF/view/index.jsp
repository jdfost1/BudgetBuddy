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
		</div>
		<hr>
		<div class="row">
			<div class="col mt-3 mb-4">
				<h2>Not ready to sign up?</h2>
				<p>Try our financial quick tools! These tools give you quick insight into your finances without needing an account.</p>
				<div class="card-deck mt-0">
					<div class="card quick-tool">
						<img class="card-img-top" src="${pageContext.request.contextPath}/resources/img/placeholder.png" alt="Quick Budget icon">
						<div class="card-body">
							<h5 class="card-title"><a href="${pageContext.request.contextPath}/tools/quick-budget">Quick Budget</a></h5>
							<p class="card-text">Here you can create a quick budget breakdown based on your annual income.</p>
						</div>
					</div>
					<div class="card quick-tool">
						<img class="card-img-top" src="${pageContext.request.contextPath}/resources/img/placeholder.png" alt="401k Calculator icon">
						<div class="card-body">
							<h5 class="card-title "><a href="${pageContext.request.contextPath}/tools/401k-calculator">401k Calculator</a></h5>
							<p class="card-text">This card has supporting text below as a
								natural lead-in to additional content.</p>
						</div>
					</div>
					<div class="card quick-tool">
						<img class="card-img-top" src="${pageContext.request.contextPath}/resources/img/placeholder.png" alt="Compound Interest Calculator">
						<div class="card-body">
							<h5 class="card-title"><a href="${pageContext.request.contextPath}/tools/compound-interest-calculator">Compound Interest Calculator</a></h5>
							<p class="card-text">Here you can quickly calculate compound interest to predict the value of an investment.</p>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<jsp:include page="template/footer.jsp" />
	<%@ include file="template/js-include.html"%>
</body>
</html>