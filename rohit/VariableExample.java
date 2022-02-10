package com.rohit;

public class VariableExample {
	int age=22;
	static float marks=82;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Variable-->name to the memory location,hold a value in memory
		String name = "Rohit";
		System.out.println(name);
		
		
		//Types of variable  1) Local Variable-->used inside method and access within a method
                         //  2) instance variable --> it is accessed through the object ,it is outside the class   	
	     
		VariableExample ve = new VariableExample();
		System.out.println(ve.age);
		
		
		//static variable--> no need of object, and outside of class
		
		System.out.println("marks");
		
	}
   
	
}
