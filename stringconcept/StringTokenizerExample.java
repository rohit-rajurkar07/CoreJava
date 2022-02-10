package com.stringconcept;
import java.util.Scanner;
import java.util.StringTokenizer;
public class StringTokenizerExample {

	public static void main(String[] args) {
		
       //it allows u to break string into tokens
		StringTokenizer st= new StringTokenizer("acer laptop");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		StringTokenizer st2 = new StringTokenizer("I,am,good,boy", ",");
		while (st2.hasMoreTokens())  {
			System.out.println(st2.nextToken());
		}
		 //str="10 20 30 40 50" sum of all the number
		
		StringTokenizer str= new  StringTokenizer("10,20,30,40,50");
		int sum=0;
		while (str.hasMoreTokens()); {
			int num= Integer.parseInt(str.nextToken());
		    sum= sum+num;			
			
		}
		System.out.println(sum);
		
	 	// print number of tokens presnt in string
		StringTokenizer st1= new StringTokenizer("acer laptop");
		System.out.println("total no. of tokens: " + st1.countTokens());
	}

}
