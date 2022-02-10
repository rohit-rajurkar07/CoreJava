package com.controlstatement;

public class ContinueStamentExample {

	public static void main(String[] args) {
		// it is used to skip the current iteration of loop
		
		//Example of break statement
		
		String a =" ";
		int b=1;
	   String y = " ";
		for (int id=1;id<=10;id++) {
			a=a+" "+id;
			if (id==5)  {
				break;
			}
		}   System.out.println("Student id is found: " + a);
		

	// example of Continue statement
		
		String h =" ";
		int k=1;
		for (int g=1;g<=10;g++) {
			
			if (g==5)  {
				continue;
			}
               h=h+" "+g;
		}   System.out.println("Student id is found: " + h);
		
	//While loop
		 while (k<11) {
			
			 if (k==5) {
				  k++;	
				 continue;
			
			}  
			 
			y=y+" "+k;
			k++;
			System.out.println("student id 5 is "+ y);
		}
		
	}

}
