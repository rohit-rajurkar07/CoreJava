package com.controlstatement;

import java.util.Scanner;

public class IfElseExample {

	public static void main(String[] args) {
		
      
		 // if else statement --> there are two possibilities
		
		int a = 50;
		int b = 25;
		
		if (a%b==0) {
			System.out.println(a + " is divisible by " + b);
		
			
		}
		
		//Student got result -- if more than 75 get shoes otherwise not
		
	  Scanner sc= new Scanner(System.in);
	   System.out.println("Enter yout name ");
	   String name = sc.next();
	    
	    System.out.println("Enter your marks ");
	    int marks= sc.nextInt();  
	    
	    if (marks > 75) {
	    	System.out.println(name + " will get shoes ");
	    	
	    }
	    else {
	    	System.out.println(name + " will not get shoes");
	    }
	    	
	    
	    // 
	    
	     
	     
	  
	    	
	    	
	    	
	    
	    
		
	}

}
