<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<title>Budget Buddy</title>
	<%@ include file="template/css-include.html"%>
</head>
<body>
    <%@ include file="template/header.html"%>
	<div id="logo"class="container">
		<div>
			<h1>Welcome to your Account Page!</h1>
			<img src="${pageContext.request.contextPath}/resources/img/logo.png">
		</div>
	</div>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
* {box-sizing: border-box}

/* Set height of body and the document to 100% */
body, html {
    height: 100%;
    margin: 0;
    font-family: Arial;
}

/* Style tab links */
.tablink {
    background-color: #555;
    color: white;
    float: left;
    border: none;
    outline: none;
    cursor: pointer;
    padding: 14px 16px;
    font-size: 17px;
    width: 25%;
}

.tablink:hover {
    background-color: #777;
}

/* Style the tab content (and add height:100% for full page content) */
.tabcontent {
    color: black;
    display: none;
    padding: 100px 20px;
    height: 100%;
}

#currentBudget {background-color: white;}
#suggestedBudget {background-color: white;}
#budgetAdvice {background-color: white;}
#estimated401k {background-color: white;}
</style>
</head>
<body>

<button class="tablink" onclick="openPage('currentBudget', this, 'green')">Current Budget</button>
<button class="tablink" onclick="openPage('suggestedBudget', this, 'green')" id="defaultOpen">Suggested Budget</button>
<button class="tablink" onclick="openPage('budgetAdvice', this, 'green')">Budget Advice</button>
<button class="tablink" onclick="openPage('estimated401k', this, 'green')">Estimated 401k</button>

<div id="currentBudget" class="tabcontent">
  <h3>Current Budget</h3>
  <p>Budget calculated with user income, fixed expenses, and savings target</p>
</div>

<div id="suggestedBudget" class="tabcontent">
  <h3>Suggest Budget</h3>
  <p>Budget calculated with only user income (quick budget)</p> 
</div>

<div id="budgetAdvice" class="tabcontent">
  <h3>Budget Advice</h3>
  <p>Advice based off suggested budget and current budget.Is the user's fixed expenses too high? for what categories?</p>
</div>

<div id="estimated401k" class="tabcontent">
  <h3>Estimated 401k</h3>
  <p>Estimated 401k calculated with quick 401k calculator</p>
</div>

<script>
function openPage(pageName,elmnt,color) {
    var i, tabcontent, tablinks;
    tabcontent = document.getElementsByClassName("tabcontent");
    for (i = 0; i < tabcontent.length; i++) {
        tabcontent[i].style.display = "none";
    }
    tablinks = document.getElementsByClassName("tablink");
    for (i = 0; i < tablinks.length; i++) {
        tablinks[i].style.backgroundColor = "";
    }
    document.getElementById(pageName).style.display = "block";
    elmnt.style.backgroundColor = color;

}
// Get the element with id="defaultOpen" and click on it
document.getElementById("defaultOpen").click();
</script>
	<%@ include file="template/js-include.html"%>
</body>
</html>