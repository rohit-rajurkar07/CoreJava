package com.stringconcept;

public class StringBufferExample {

	public static void main(String[] args) {
		// string buffer= it is used to make the string mutabkr which means we can modify the string
		// it is not used when SCP is there
		// every method in it is synchronized --> one object can be modified by multiple thread
		//simultaneously 
		
		StringBuffer sb= new StringBuffer("Rahul");
		sb.append(" Rajurkar");
		System.out.println(sb);
		
		StringBuffer a= new StringBuffer("seema");
		StringBuffer b= new StringBuffer("seema");
		System.out.println("By== " + (a==b));
		System.out.println("By equals " + (a.equals(b)));
		// Object --> equals method -> String Buffer doesnt override equals method
		
		// capacity --> how many char value string can hold-> default 16
		
		StringBuffer c= new StringBuffer();
		System.out.println("Default capacity of string Buffer is" + c.capacity());
		c.append("abcdefghijklmnop");
		System.out.println("Default capacity of string Buffer is" + c.capacity());
		c.append("a");
		System.out.println("Default capacity of string Buffer is" + c.capacity());
		//New capacity =(old capacity +1) *2
		
		c.append("r");
		System.out.println("Default capacity of string Buffer is" + c.capacity());
		
		
		
		//capacity with initial value
		StringBuffer d= new StringBuffer(5);
		System.out.println(d.capacity());
		d.append("abcde");
		System.out.println("Default capacity is " + d.capacity());
		
	    d.append("kdfjldfjdlsfjlsdfdlsfj");
	    System.out.println(d.capacity());
	    
	    //capacity with string values
	    StringBuffer o= new StringBuffer("Message");
	    System.out.println("Default Capacity is-" + o.capacity());
	    // new capacity = String length
		
	}

}
