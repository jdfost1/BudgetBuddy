package com.budgetBuddy.tools;

public class Quick401k {

	private double nestEgg;

	public double getNestEgg() {
		return nestEgg;
	}

	public void setNestEgg(double nestEgg) {
		this.nestEgg = nestEgg;
	}
	
	public double calculate401k(int salary, double contribution, int age, int retireAge,
			double currentBalance, double rate, double employerMatchEnd, double employerMatch)
	{
		int years = retireAge - age;
		double totalEmployerMatch;
		double newBalance = 0;
		
		 rate = rate/100;
	        employerMatchEnd = employerMatchEnd/100;
	        employerMatch= employerMatch/100;
	        contribution = contribution/100;
	        for(int i = 0; i< years; i++)
	        {
	            if(contribution >= employerMatchEnd){
	                totalEmployerMatch = employerMatchEnd*salary*employerMatch;
	            }
	            else 
	            totalEmployerMatch = contribution * salary * employerMatch;
	       
	          currentBalance =  (currentBalance)+ (currentBalance * rate) + (salary * contribution);
	          
	          newBalance = currentBalance+totalEmployerMatch;
	          
	        }//end of loop
	        return newBalance;
	}//end of method
	

}//end of class