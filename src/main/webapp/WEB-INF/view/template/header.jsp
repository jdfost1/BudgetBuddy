<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="sec"	uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- Security Authorization -->
<sec:authorize var="auth" access="hasAuthority('USER')" />

<header>
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<a class="navbar-brand" href="${pageContext.request.contextPath}/">Budget Buddy</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
					role="button" data-toggle="dropdown" aria-haspopup="true"
					aria-expanded="false"> Financial Quick Tools </a>
					<div class="dropdown-menu" aria-labelledby="navbarDropdown">
						<a class="dropdown-item" href="${pageContext.request.contextPath}/tools/quick-budget">Quick
							Budget</a> <a class="dropdown-item"
							href="${pageContext.request.contextPath}/tools/401k-calculator">401k Calculator</a> <a
							class="dropdown-item"
							href="${pageContext.request.contextPath}/tools/compound-interest-calculator">Compound
							Interest Calculator</a>
					</div>
				</li>
			</ul>
			<c:choose>
				<c:when test="${auth}">
					<div class="dropdown">
					  <button class="btn btn-outline-success dropdown-toggle" type="button" id="myAccountMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
					    My Account
					  </button>
					  <div class="dropdown-menu dropdown-menu-right" aria-labelledby="myAccountMenuButton">
					    <a class="dropdown-item" href="${pageContext.request.contextPath}/account/view">View Account</a>
					    <a class="dropdown-item" href="${pageContext.request.contextPath}/account/update">Update Account</a>
					    <a class="dropdown-item" href="${pageContext.request.contextPath}/account/delete" title="You will be asked for confirmation before deletion.">Delete Account</a>
					    <div class="dropdown-divider"></div>
					    <form:form id="logout-form" action="${pageContext.request.contextPath}/account/logout" method="post">
							<button type="submit" class="btn btn-danger btn-block">Log Out</button>
						</form:form>
					  </div>
					</div>
				</c:when>
				<c:otherwise>
					<a class="btn btn-outline-success my-2 my-sm-0"
						href="${pageContext.request.contextPath}/account/login" role="button">Log In</a>
				</c:otherwise>
			</c:choose>
		</div>
	</nav>
</header>