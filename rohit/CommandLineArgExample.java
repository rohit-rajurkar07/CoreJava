package com.rohit;

public class CommandLineArgExample {
	// it will take the input from console

	public static void main(String[] args) {
		
		
		System.out.println("First Argument " + args[0]);
		System.out.println("Second Argument " + args[1]);
		
		// Get the length of argument
		System.out.println((args.length));
		
		System.out.println("Third Argument " + args[2]);
		System.out.println("Fourth Argument " + args[3]);
		
		float f = Float.parseFloat(args[2]);
		float d = Float.parseFloat(args[3]);
		float k = f/d;
		 System.out.println("the division is "+ k);
		 
		 
		 
		 
		 
		 
		 // Row = 1 ( 1<=5)

	}

}
