<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<title>Quick Budget - Budget Buddy</title>
	<jsp:include page="template/css-include.jsp"/>
</head>
<body>
    <jsp:include page="template/header.jsp"/>
	<div class="container">
     	<div class="row">
     		<div class="col-sm-8 col-lg-6 offset-sm-2 offset-lg-3">
	     		<div id="card" class="card">
				  <h5 class="card-header">Quick Monthly Budget Calculator</h5>
				  <div class="card-body">
				    <form:form action="quick-budget-result" modelAttribute="budget">
					 	<div class="form-group">
							<label for="incomeInput">Annual Income</label>
						    <form:input path="income" id="incomeInput" cssClass="form-control"/>
						    <form:errors path="income" element="div" cssClass="invalid-feedback"/>
						</div>		
						<button type="submit" class="btn btn-success">Calculate</button>
					</form:form>
				  </div>
				</div>
     		</div>
     	</div>
     </div>
     <%@ include file="template/js-include.html"%>
</body>
</html>