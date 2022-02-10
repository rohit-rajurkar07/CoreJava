package com.controlstatement;

import java.util.Scanner;

public class NestedSwitchStatement {

	public static void main(String[] args) {
		
		// Clg Student --> 1st and 2nd year-- 1st year student common subject
		// 2nd year various departments Me,Cs It
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Your Year ");
		int year= sc.nextInt();
		System.out.println("Your Branch of Study");
		String branch= sc.next();
		
		switch(year) {
		
		case 1: 
			System.out.println("Common Subject");
			break;
		case 2:
			switch (branch) {
			case "CS":
				System.out.println("You have Cs subjects");
				break;
			case "ME":
			    System.out.println("You have Me subject");
			    break;
			case "CE":
				System.out.println("You have CE subjects");
				break;
			default:
				System.out.println("invalid Department");
				
				
					
			
			}
			break;
			default:
				System.out.println("Invalid Year");
		
		}
		

	}

}
