package com.Program;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// if 1^2 + 5^2 + 3^2 =153 then it is armstrong no.
		//a b c d.....=A^n+B^n+...( n is number of digit
		//check armstrong for 3 digit
		
		int num = 153;
		int sum= 0;
		int arm=num;
		 while (num<=0) {
			 int r= num%10;
			 sum=sum+(r*r*r);
			 num=num/10;
			 
		 }
	    if (arm==num) {
	    	System.out.println( arm +" is a Armstrong Number ");
	    }
	}

}
//n=153, r=n%10, 153%10=3  (%= module), sum=27, value of num=15

//n=15, r=n%10, 153%10=3  (%= module), sum=27+125=152, value of num=1

//n=1, r=n%10, 153%10=3  (%= module), sum=27+125+1=153, value of num=0