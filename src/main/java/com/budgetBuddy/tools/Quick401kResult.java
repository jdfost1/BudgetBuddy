package com.budgetBuddy.tools;

public class Quick401kResult {
	
	private double nestEgg;
	
	public Quick401kResult(Quick401k account) {
		 double salary = account.getSalary();
		 double contribution = account.getContribution();
		 int age = account.getAge();
		 int retireAge = account.getRetireAge();
		 double currentBalance = account.getCurrentBalance();
		 double rate = account.getRate();
		 double employerMatchEnd = account.getEmployerMatchEnd();
		 double employerMatch = account.getEmployerMatch();
		 
	       
	        
	        int years = retireAge - age;
	        rate = rate/100;
	        employerMatchEnd = employerMatchEnd/100;
	        employerMatch= employerMatch/100;
	        contribution = contribution/100;
	        double totalEmployerMatch;
	        
	        
	        for(int i = 0; i< years; i++)
	        {
	            if(contribution >= employerMatchEnd){
	                totalEmployerMatch = employerMatchEnd*salary*employerMatch;
	            }
	            else 
	            totalEmployerMatch = contribution * salary * employerMatch;
	       
	          currentBalance =  currentBalance+ (currentBalance * rate) + salary * contribution;
	          
	          nestEgg = currentBalance+totalEmployerMatch;
	          
	          
	          
	        }//end of loop
	}

	public double getNestEgg() {
		return nestEgg;
	}

	public void setNestEgg(double nestEgg) {
		this.nestEgg = nestEgg;
	}
}//end of class


