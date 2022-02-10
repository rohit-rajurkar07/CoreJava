package com.stringconcept;

public class StringExample {

	public static void main(String[] args) {
		
		//Need of String-> for secure operation 
		//String -> it is a object that represent sequence of characters  for ex abcd="Rohit"
	//String is immutable ->if we set the value for string it cannot be change -> bcoz of string constant pool
		// we will store string values in heap as well as string constant pool
		// Heap-> its a memory inside jvm which holds objects value.
		//String constant pool is also memory inside the heap where values of all the string store.
		//Two types of generating strings 1)string literals 2) new keyword 
		
	//1) String Literal-> we dont have heap here,only use SCP. if the literals inside memory is already in JVM will 	
   String A="Rohit";
   A.concat("Rajurkar");
   System.out.println(A);
   
   
   //String by new keyword 
   String  name= new String("Rohit");
   name.concat("rj");
   System.out.println(name);
   
   //example
   
   String B= new String("Hello");
   String C=new String("Hello");
   String D="Hello";
   String E="Hello";
   
   //_Heap-> B and C is pointing to Hello
   // SCP -> D and E is pointing to only in one object hello  (SCP=STRING CONCEPT POOL)
   
   //example  2
   
   String name2= new String("rohit");
   //name2.concat("raju");  name2 is not pointing to rajurkar
  name2= name2.concat(" rajurkar"); // name2 is pointing to both rohit and rajurkar
   System.out.println(name2);
   
   //Heap = name2 is pointing to rohit
   //SCP is pointing to rohit and rajurkar
   //SCP advantages = to improve the performances and memory managment
   
   //Example 3 
   String x = new String ("Mango");
   x.concat("banana");
   String y= x.concat(" apple");
   y.concat("plum");
   //heap = x is pointing to mango and apple
   //string cncept pool is pointing to banana and plum  ( Storing all the values)
   System.out.println(x);
   System.out.println(y);
   
   // equals of two string  //
   
   String h= new String("sanjay");
   String i= new String("sanjay");
   System.out.println("by == " + (h==i));
   System.out.println();
   
   // object class-> equals method = used to point references of an object
   //string overides the equals method from object class to equals to valuer of an object.
   

   
	}

}
