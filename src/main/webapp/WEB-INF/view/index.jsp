<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!-- Security Authorization -->
<sec:authorize var="auth" access="hasAuthority('USER')"/>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<title>Budget Buddy</title>
	<jsp:include page="template/css-include.jsp"/>
	<jsp:include page="template/favicon.jsp"/>
</head>
<body>
    <jsp:include page="template/header.jsp"/>
	<div id="logo"class="container">
		<div>
			<br>
			<h2 class="hello">Hello<c:if test="${auth}"> <sec:authentication property="principal.username"/></c:if>, welcome to Budget Buddy!</h2>
			<br>
			<img src="${pageContext.request.contextPath}/resources/img/banner_white.png">
			<c:if test="${auth}">
				<p>If it is your first time here, click <a href="${pageContext.request.contextPath}/budget/budget-form">here</a> to create your budget.</p>
				<p>Click <a href="${pageContext.request.contextPath}/budget">here</a> to view your budget if it is already created.</p>
			</c:if>
		</div>
	</div>
	<%@ include file="template/js-include.html"%>
</body>
</html>