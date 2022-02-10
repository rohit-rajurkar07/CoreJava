package com.rohit;

public class wrapperClass {
	
	// it is immutable

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Wraper class--> Used to convert primitive data type to object and vice versa
		
		byte b=12;
		short s = 20;
		int i= 14;
		float f= 54f;
		double d= 8d;
		char c= 'C';
		long l= 75l;
		boolean bl= true;
		
		//Auto-Boxing --> convert primitive data types into objects
		
          Byte by= b;
      Short sh = s;
      Long lg= l;
       Boolean bln= bl;    
        Float g= f;
        Double db= d;
       Character ch= 'C';
      Integer sd= 7;
        
      System.out.println(by);
      System.out.println(sh);
      System.out.println(lg);
      System.out.println(bln);
      System.out.println(ch);
      System.out.println(g);
      System.out.println(sd);
      System.out.println(db);
		
		// if we want to do equals of 2 object
      System.out.println(bln.equals(sd));
      
      //if we want to convert integer to string wrapper class is used
      
      String name= Integer.toString(i);
      System.out.println(name + "  " + name.getClass());
      
      //Un-boxing --> convert object into primitive data types
      
      byte byt= by;
      short sht= sh;
      float flt= f;
      char chr= ch;
      long lth= lg;
      int in = sd;
      double dbl = d;
      boolean Bln = bl;
      
      System.out.println(byt);
      System.out.println(sht);
      System.out.println(flt);
      System.out.println(chr);
      System.out.println(lth);
      System.out.println(in);
      System.out.println(dbl);
      System.out.println(Bln);
       
      
      
      
      
		
		
		
		
		
	}

}
