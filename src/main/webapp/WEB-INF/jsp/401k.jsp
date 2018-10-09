<html>
       <!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script>

    function calculateNestEgg(){
        var salary = document.getElementById("salary").value;
        var contribution = document.getElementById("contribution").value;
        var age = document.getElementById("age").value;
        var retireAge = document.getElementById("retireAge").value;
        var currentBalance = document.getElementById("401kBalance").value;
        var rate = document.getElementById("rateOfReturn").value;
        var employerMatchEnd = document.getElementById("employerMatch").value;
        var employerMatch = document.getElementById("employerContribution").value;
        
        var years = retireAge - age;
        rate = rate/100;
        employerMatchEnd = employerMatchEnd/100;
        employerMatch= employerMatch/100;
        contribution = contribution/100;
        var totalEmployerMatch;
        
        var i;
        for(i = 0; i< years; i++)
        {
            if(contribution >= employerMatchEnd){
                totalEmployerMatch = employerMatchEnd*salary*employerMatch;
            }
            else 
            totalEmployerMatch = contribution * salary * employerMatch;
       
          currentBalance =  parseFloat(currentBalance)+ parseFloat(currentBalance * rate) + parseFloat(salary * contribution);
          
          currentBalance = currentBalance+totalEmployerMatch;
          
          currentBalance = currentBalance.toFixed(2);
          
        }//end of loop
    
        
        document.getElementById("results").innerHTML = "Nest Egg: $"+ currentBalance;
        
    }//end of function
    </script>
    <style>
    body{
        background-color:black;
        color:white;
        font-size:30px;
        
    }
    h1{
        background-color:green;
        text-align:center;
    }
    h2{
        text-align:center;
    }
  button{
 width:25%;
    height:40px;
    font-size:20px;
    font-weight: bold;
    background-color:green;
    }
    pre{
        
        background-color:black;
        color:white;
         display: block;
    font-family: monospace;
    white-space: pre;
    margin: 1em 0;
    }
.slider {
    -webkit-appearance: none;  /* Override default CSS styles */
    appearance: none;
    width: 2px; /* Full-width */
    height: 5px; /* Specified height */
    background: white; /* Grey background */
    outline: none; /* Remove outline */
    opacity: 0.7; /* Set transparency (for mouse-over effects on hover) */
    -webkit-transition: .2s; /* 0.2 seconds transition on hover */
    transition: opacity .2s;
}
.slidecontainer {
    width: 55%; /* Width of the outside container */
}
.small{
    font-size:15px;
}

#results{
    color:lime;
}
#logo{
    background-color:black;
}
#text{
    width:100%;
}
input{
    color:black;
}
    </style>
    
   
    
    <body>
    <nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="welcome.html">BudgetBuddy.com</a>
    </div>
    <ul class="nav navbar-nav">
      
      
      <li class="dropdown">
          <a class="dropdown-toggle" data-toggle="dropdown" href="#">Budget Tools
          <span class="caret"></span></a>
          <ul class="dropdown-menu">
              <li><a href="quickBudget.html">Quick Budget</a></li>
              <li><a href="401k.html">401k Calculator</a></li>
              <li><a href="compoundInterest.html">Compound Interest Calculator</a></li>
              </ul></li>
      
              
                <li class="active">
          <a  href="login.html">Login
         </a>
          </li>
               <li class="active">
          <a  href="signUp.html">Sign Up
         </a>
          </li>
    </ul>
  </div>
</nav>

   
        
        
         <label>What is your current age?</label><br>
    <div class="slidecontainer">
  <input type="range" min="15" max="65" value="30" class="slider" id= "age">
  <p>Current Age: <span id= "ageOut"></span></p>
</div><br>
<script>
var slider4 = document.getElementById("age");
var output4 = document.getElementById("ageOut");
output4.innerHTML = slider4.value;

slider4.oninput = function() {
  output4.innerHTML = this.value;
}
</script>
    
    <label>What age do you want to retire?</label><br>
       <div class="slidecontainer">
  <input type="range" min="35" max="90" value="65" class="slider" id= "retireAge">
  <p>Retirement Age: <span id= "retireAgeOut"></span></p>
</div><br>
<script>
var slider5 = document.getElementById("retireAge");
var output5 = document.getElementById("retireAgeOut");
output5.innerHTML = slider5.value;

slider5.oninput = function() {
  output5.innerHTML = this.value;
}
</script>
    
    <label>What is your annual salary?</label><br>
          <div class="slidecontainer">
  <input type="range" min="10000" max="300000" value="35000" step= "1000"class="slider" id= "salary">
  <p>Current Annual Salary: $ <span id= "salaryOut"></span></p>
</div><br>
<script>
var slider6 = document.getElementById("salary");
var output6 = document.getElementById("salaryOut");
output6.innerHTML = slider6.value;

slider6.oninput = function() {
  output6.innerHTML = this.value;
}
</script>
    
    <label>What is the current balance in your 401k account?</label><br>
             <div class="slidecontainer">
  <input type="range" min="0" max="500000" value="1000" step="500" class="slider" id= "401kBalance">
  <p>Current 401k balance: $ <span id= "401kBalanceOut"></span></p>
</div><br>
<script>
var slider7 = document.getElementById("401kBalance");
var output7 = document.getElementById("401kBalanceOut");
output7.innerHTML = slider7.value;

slider7.oninput = function() {
  output7.innerHTML = this.value;
}
</script>
    
     <label>What is the average rate of return that you expect? </label><br>
 <div class="slidecontainer">
  <input type="range" min="1" max="15" value="5" step=".5" class="slider" id="rateOfReturn">
  <p>Rate of Return: <span id="sliderOutput"></span>%</p>
</div><br>
<script>
var slider = document.getElementById("rateOfReturn");
var output = document.getElementById("sliderOutput");
output.innerHTML = slider.value;

slider.oninput = function() {
  output.innerHTML = this.value;
}
</script>

        
    <label>What is the percent of your paycheck that you contribute annually? </label><br>
    <div class="slidecontainer">
  <input type="range" min="1" max="100" value="3" class="slider" id="contribution">
  <p>Contribution: <span id="contributionOutput"></span>%</p>
</div><br>
<script>
var slider1 = document.getElementById("contribution");
var output1 = document.getElementById("contributionOutput");
output1.innerHTML = slider1.value;

slider1.oninput = function() {
  output1.innerHTML = this.value;
}
</script>
       
    <label>When does your employer match end?</label> <div class="small"></div><br>
    <div class="slidecontainer">
  <input type="range" min="1" max="100" value="6" class="slider" id="employerMatch">
  <p>Employer Match Ends: <span id="employerMatchOutput"></span>%</p>
</div><br>
<script>
var slider2 = document.getElementById("employerMatch");
var output2 = document.getElementById("employerMatchOutput");
output2.innerHTML = slider2.value;

slider2.oninput = function() {
  output2.innerHTML = this.value;
}
</script>
             
    <label>How much of your contribution does your employer match? </label><br>
     <div class="slidecontainer">
  <input type="range" min="1" max="100" value="50" class="slider" id="employerContribution">
  <p>Employer Match: <span id="employerContributionOutput"></span>%</p>
</div><br>
<script>
var slider3 = document.getElementById("employerContribution");
var output3 = document.getElementById("employerContributionOutput");
output3.innerHTML = slider3.value;

slider3.oninput = function() {
  output3.innerHTML = this.value;
}
</script>
<div id="results">
        </div>
    
    <button onclick="calculateNestEgg()" type="button" >Calculate Nest Egg</button>
    <div id="results">
        </div><br><br>

        </body>
</html>