package com.controlstatement;

public class NestedIfLadder {

	public static void main(String[] args) {
		
      // if we have multiple nested condition it is used
		
		//vending m/c -> insert note -> 10,20,30 rps 
		// according to money it gives chips choclate and biscuits
		  
		
		String PaymentStatus="Done";
		int amount= 10;
		if (PaymentStatus== "Done")  {
		    if (amount==10)  {
		    	System.out.println("Chips");
		    }
		    else  if (amount == 20) {
		    	System.out.println("Choclate");
		    }
		    
		    else if (amount== 30)  {
		    	System.out.println("Biscuits");
		    }
		}
		
		// // StudentId--> 101 to 130 // id-> (101,110)--> Music team 
		  // id -->111-120 -> sports
		  //Id -> Dance Team
		
		
		
		
	}

}
