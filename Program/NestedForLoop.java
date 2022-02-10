package com.Program;
// Right Triangle Star Pattern

public class NestedForLoop {

	public static void main(String[] args) {
		
		int num= 7;
		int row, column;
		for (row=1;row<=7;row++) {
			 for (column=1;column<=row;column++) {
				 System.out.print("*");
			 }System.out.println();
			 
		}
		
		int nums=5;
		int rows,colm;
		for (rows=1;rows<=5    ;rows++) {
			for (colm=1;colm<=rows;colm++);  {
				System.out.print("*");
			}System.out.println();
		}
	}

}
