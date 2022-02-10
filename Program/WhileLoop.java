package com.Program;

public class WhileLoop {

	public static void main(String[] args) {
		// when two parts of program repeated multiple times
		//and when no of iteration is not fixed
		
	//	int id = 5;
		// while (id<5 ) {
			//System.out.println("Student id is generated- " + id);
			//id++;
		
         
	
		int num=6;
		int row, col;
		row=1;
		col=1;
		while (row<=num)  {
			while (col<=row) {
				System.out.print("*");
				col++;
				
			}
		 row++;
		System.out.println();
		col++;
		}	
				
	}

}
