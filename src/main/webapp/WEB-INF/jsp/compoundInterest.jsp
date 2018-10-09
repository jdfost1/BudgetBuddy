<html>
           <!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script>
    
    
    function calculate(){
    var balance = document.getElementById("balance").value;
    var rate = document.getElementById("rate").value;
    rate = rate/100;
    var i;
    var years = document.getElementById("years").value;
    
    for(i=0;i < years;i++){
    balance = parseFloat(balance) + parseFloat(rate*balance);
    }
    document.getElementById("results").innerHTML = "Resulting balance after "+ years+" years : $"+balance.toFixed(2);
    }//end of calculate function
    </script>
    <style>
    body{
        background-color:black;
        color:white;
        font-size:30px;
    }
    button{
 width:25%;
    height:40px;
    font-size:20px;
    font-weight: bold;
    background-color:green;
    }
    input{
        color:black;
    }
    h1{
        background-color:green;
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
    #logo{
        background-color:black;
    }
    #results{
        color:lime;
    }
    #compoundvideo{
        background-color:green;
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
     

        <h1>Compound Interest Calculator</h1>
    <label>Select a starting balance</label><br>
        <div class="slidecontainer">
  <input type="range" min="0" max="100000" value="1000" step="100" class="slider" id="balance">
  <p>Balance: $ <span id="balanceOutput"></span></p>
</div><br>
<script>
var slider1 = document.getElementById("balance");
var output1 = document.getElementById("balanceOutput");
output1.innerHTML = slider1.value;

slider1.oninput = function() {
  output1.innerHTML = this.value;
}
</script><br>
        
        
    <label>Select the annual rate of return </label><br>
        <div class="slidecontainer">
  <input type="range" min="1" max="15" value="5" step=".5" class="slider" id="rate">
  <p>Rate of Return: <span id="sliderOutput"></span>%</p>
</div><br>
<script>
var slider = document.getElementById("rate");
var output = document.getElementById("sliderOutput");
output.innerHTML = slider.value;

slider.oninput = function() {
  output.innerHTML = this.value;
}
</script>
        
    <label>Enter the number of years to calculate your investment</label><br>
               <div class="slidecontainer">
  <input type="range" min="1" max="100" value="25" step="1" class="slider" id="years">
  <p>Years to calculate:  <span id="yearsOutput"></span></p>
</div><br>
<script>
var slider2 = document.getElementById("years");
var output2 = document.getElementById("yearsOutput");
output2.innerHTML = slider2.value;

slider2.oninput = function() {
  output2.innerHTML = this.value;
}
</script><br><br>
<div id="results">
            </div>
        <button onclick="calculate()">Calculate Investment</button><br>
        
       
    </body>
    </html>