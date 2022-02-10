package com.controlstatement;

import java.util.Scanner;

public class IfElseLadderExample {

	public static void main(String[] args) {
		
		// is is used when we have multiple condition to check //
		// student -> given exam --> A B C --> A = Bike  grade B = shoes grade c = book
		Scanner sc = new Scanner(System.in);
		
	  char Grade = 'A';
	  System.out.println(" Enter Your Grade- ");
	  
	  
	  
	  if (Grade == 'A') {
		  System.out.println(" Student will get Bike");
	  }
	  else if (Grade == 'B') {
		  System.out.println( " Student will get shoes ");
	  }
	  else {
		  System.out.println(" Student will get Book ");
	  }
  
	  
	  // StudentId--> 101 to 130 // id-> (101,110)--> Music team 
	  // id -->111-120 -> sports
	  //Id -> Dance Team
	  
	  
	  System.out.println("Enter Your StudentId");
	  int StudentId= sc.nextInt(); 
	  
      if (StudentId>=101 && StudentId<=110) {
		  System.out.println("Music Team");
	  }
      else if  (StudentId>=111 && StudentId<=120) {
    	  System.out.println(" Sports team");
      }
      else {
    	  System.out.println(" Dance team");
      }
	  
	

}
}
