<%@ taglib prefix="sec"	uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<footer>
	<div class="mb-3">
		<a class="btn btn-light" href="#" role="button">Back to Top</a>
	</div>
	<c:if test="${!auth}">
		<div>
			<ul style="text-align: center">
				<li><a href="${pageContext.request.contextPath}/account/sign-up">Sign Up</a></li>
				<li><a href="${pageContext.request.contextPath}/account/login">Log In</a></li>
			</ul>
		</div>
	</c:if>
	<b>&copy; 2018 BudgetBuddy.site</b>
</footer>