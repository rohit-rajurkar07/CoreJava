package com.stringconcept;
import java.util.StringJoiner;

public class StringJoinerExample {


	public static void main(String[] args) {
		
		StringJoiner Sj=new StringJoiner(",","[","]");  // we can use any object instead of (/)
		
		Sj.add("Rohit");
		Sj.add("Rajurkar");
		Sj.add("1032190162");
		Sj.add("Mechanical Engineering");
		System.out.println(Sj);
		
StringJoiner Sj2=new StringJoiner(":","{","}");  // we can use any object instead of (/)
		
		Sj2.add("Rohit");
		Sj2.add("Rajurkar");
		Sj2.add("1032190162");
		Sj2.add("Mechanical Engineering");
		System.out.println(Sj2);
		
	//	joining two string joiner object
		
		StringJoiner merge = Sj.merge(Sj2);
		System.out.println(merge);

	}

}
