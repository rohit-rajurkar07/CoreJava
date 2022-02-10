package com.stringconcept;

public class StringBuilderExample {

	public static void main(String[] args) {
		
		//it is used to overcome the problem in string Buffer, which is non- synchronized method
		
		StringBuilder sb= new StringBuilder("Rahul");
		sb.append(" Rajurkar");
		System.out.println(sb);
		
		StringBuilder a= new StringBuilder("seema");
		StringBuilder b= new StringBuilder("seema");
		System.out.println("By== " + (a==b));
		System.out.println("By equals " + (a.equals(b)));
		// Object --> equals method -> String Buffer doesnt override equals method
		
		// capacity --> how many char value string can hold-> default 16
		
		StringBuilder c= new StringBuilder();
		System.out.println("Default capacity of string Builder is" + c.capacity());
		c.append("abcdefghijklmnop");
		System.out.println("Default capacity of string Builder is" + c.capacity());
		c.append("a");
		System.out.println("Default capacity of string Builder is" + c.capacity());
		//New capacity =(old capacity +1) *2
		
		c.append("r");
		System.out.println("Default capacity of string Builder is" + c.capacity());
		
		
		
		//capacity with initial value
		StringBuilder d= new StringBuilder(5);
		System.out.println(d.capacity());
		d.append("abcde");
		System.out.println("Default capacity is " + d.capacity());
		
	    d.append("kdfjldfjdlsfjlsdfdlsfj");
	    System.out.println(d.capacity());
	    
	    //capacity with string values
	    StringBuilder o= new StringBuilder("Message");
	    System.out.println("Default Capacity is-" + o.capacity());
	    // new capacity = String length
		
	}

	}


