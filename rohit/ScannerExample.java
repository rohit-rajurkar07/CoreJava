package com.rohit;
import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		
		//Scaner It is used get input from system
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Student Data");
		int studentRollNo=sc.nextInt();
		String studentName = sc.next();
		float studentMarks = sc.nextFloat();
		
		System.out.println(studentRollNo);
		System.out.println(studentName);
	   System.out.println(studentMarks);

		
    // Task= Add two numbers
	   
	   
	   System.out.println("Enter value for A- ");
	   int A= sc.nextInt();
	   System.out.println("Enter Value for B- ");
	   int B= sc.nextInt();
	   
	  int add= A+B;
	    System.out.println("Addition " + (add)); 
	    
	    
	    
	    System.out.println("enter the value for X  ");
	    int X= sc.nextInt();
	    System.out.println("enter the value for Y  ");
	    int Y = sc.nextInt();
	    
	    int Z=X+Y;
	    System.out.println("The Addition is  " + (X+Y));
	    
	  
	    
	    
	   
	
	    
	    
	}

}
