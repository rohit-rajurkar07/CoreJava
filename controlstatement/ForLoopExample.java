package com.controlstatement;

public class ForLoopExample {

	public static void main(String[] args) {
		
	// For loop-> when we need to do part of program repeated multiple times
		// when the no of iteration of program is fixed then we use for loop
		//whenever we do programing we need to understand  what we need in output
		for (int id=0; id < 5; id++) {
			System.out.println("Student " + id + "Generated ");
		}
     //even no. -> 2 4 6 8
	// odd no.-> 1 3 5 7 9
		
		int A=50;
		for (int i= 1; i<=A; i++) {
			if ( i % 2 ==0) {
				System.out.println("Even no.- " + i);
			}
			else 
				System.out.println("Odd Number " + i);		
		}
		
		
	}

}
