<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<title>Not Found - Budget Buddy</title>
	<jsp:include page="template/css-include.jsp"/>
	<jsp:include page="template/favicon.jsp"/>
</head>
<body>
    <jsp:include page="template/header.jsp"/>
	<div class="container top-50">
		<h1>Oops! The page you requested could not be found.</h1>
		<p><a href="${pageContext.request.contextPath}">Click here to return to the home page.</a></p>
	</div>
	<%@ include file="template/js-include.html"%>
</body>
</html>