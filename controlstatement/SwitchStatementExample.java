package com.controlstatement;

import java.util.Scanner;

public class SwitchStatementExample {

	public static void main(String[] args) {
		
		// It is used to increase readability of program
        
		//student competition between 18,20 and 2222
		//age--> games= easy, medium and high.
		// switch cases allows byte, char int string short and also allow wrapper class
		
		Scanner sc= new Scanner(System.in); 
			
		System.out.println("Enter student Age ");
		int age = sc.nextInt();
		switch (age) {
		case 18:
			System.out.println("Easy Mode");
			break;
			
		case 20:
			System.out.println("Medium");
			break;
		case 22:
			System.out.println("Hard");
			break;
			
		default:
			System.out.println("Student should be between 18 and 22");
		
		}
		
			//student-> Beginner, intermediate, expert  
		    // Meduim easy and high
		
		System.out.println("Enter Your Level");
		String level= sc.next();
		switch (level) {
		case "Beginer":
			System.out.println("Easy Task");
			break;
			
		case "intermediate":
			System.out.println("Medium Task");
			break;
	
		case "Expert":
			System.out.println("hard task");
			break;
			default:
				System.out.println("NO TASK");
		}
		
		
		
		// student Division --> A-88,B-24,C=75,student
		
		System.out.println("Enter Your Division- ");
		char div = sc.next().charAt(0);
		switch(div) {
		case 'A':
			System.out.println(" There are 88 student");
			break;
		case 'B':
			System.out.println("You are from 'B' division and there are 40 student");
			break;
		case 'C':
		System.out.println("you are from 'C' division and there are 75 student");
			break;
		}
	}

}
