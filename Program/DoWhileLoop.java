package com.Program;

public class DoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // if no. of iteration is not fixed to execute atleast once
		int studentId = 0;
		do { 
			System.out.println(studentId + "Is Generated ");
			studentId++;
		} while (studentId<5);	
		
		
		int num=5;
		int row,col;
		for (row=1;row<=num;row++) {
			for (col=1;col<=row;col++);  {
				System.out.print("*");
			}System.out.println();
		
		} 
		
	}    

}
