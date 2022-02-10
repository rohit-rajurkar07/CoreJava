package com.stringconcept;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		
       
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter String to Check- ");
		String a=sc.next();
		int res= palindrome(a);
		if (res==0) {
			System.out.println(a + "is palindrome");
		}
		else {
			System.out.println(a + "is not palindrome");
		}
		
		palindrome(a);
		
	}

	private static int  palindrome(String a) {
		int l= a.length()-1;
		for (int i=0;i<=a.length();i++)  {
			if (a.charAt(i) !=a.charAt(l)){
				return -1;
			}
		}
		return l;
		
	}

}
