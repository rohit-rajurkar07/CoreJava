package com.rohit;

public class Conversions {

	public static void main(String[] args) {
		// String to integer
		
		String s= "200";
		String t= "100";
		int i = Integer.parseInt(s);   //it is used to convert string into integer//
		
		int j = Integer.parseInt(t);
		
		System.out.println("Addition of two integer " + (i+j));
		
		
		// Interger to string
		
		int A = 1;
		String D = String.valueOf(A);
		String E = Integer.toString(A);
		String F= String.format("%d", A);
		
		System.out.println((D + E + F));
		
		
		//String to Long
		
		String m = "123456";
		Long l= Long.parseLong(m);
        System.out.println(l);
        
        // Long to String//
        
        long q = 999;
        String w = String.valueOf(q);
        String e = Long.toString(q);
        System.out.println(w);
        System.out.println(e);
		
        //String to float//
        
        String N= "2.1";
        float fl = Float.parseFloat(N);
        System.out.println(N);
        
        //FLoat to string
         
        float ft= 2.3f;
        String st= String.valueOf(ft);
        String  st2 = Float.toString(ft);
        System.out.println(st);
        System.out.println(st2);
        
        //String to double//
        String N2= "2.8";
        double f2 = Double.parseDouble(N2);
        System.out.println(N2);
        
        
        
        //Double to string//
        
        double dt= 2.9d;
        String St= String.valueOf(dt);
        String  St2 = Double.toString(dt);
        System.out.println(st);
        System.out.println(st2);
        
        //String to boolean//
        
        String kl= "True";
        String rl= "TRue";
        String sr="okay";
        Boolean B=Boolean.parseBoolean(kl);
        Boolean B1=Boolean.parseBoolean(rl);
        Boolean b2=Boolean.parseBoolean(sr);
        System.out.println(B);
        System.out.println(B1);
        System.out.println(b2);
        
        //Boolean to string
        
       boolean Bl3= true;
       boolean BN= false;
       String st5=String.valueOf(Bl3);
       String st6= String.valueOf(BN);
       System.out.println(st5);
       System.out.println(st6);
       
       //Integer to long//
       
       int i1=4;
       int i2 = 6;
       Long l1= Long.valueOf(i1);
       Long l2= new Long(i2);
       System.out.println(l1);
       System.out.println(l2);
       
       //Long to int
       
       long l4 = 32l;
       int i5= (int)14;  // Type Casting
       Long l5 = new Long(l4);
       int i6 = l5.intValue();
       System.out.println(i5);
       System.out.println(i6);
       
       // int to double
       
       int i12=4;
       int i20 = 6;
       Double l7= Double.valueOf(12);
       Double l9= new Double(i20);
       System.out.println(l1);
       System.out.println(l2);
       
       // Double to int
       
       double d4= 76d;
       int i19= (int)d4;
       Double d5 = new Double(d4);
       int i11 = d5.intValue();
       System.out.println(i19);
       
       
       //integer to char
       
       int i15= 65;
       char C1= (char)i12;
       System.out.println(C1);
       
       //char to int
       char C2= 'A';
       char C3 = '1';
       int wl= C2;
       int wl2=C3;
       System.out.println(wl);
       System.out.println(wl2);
       
       //2nd method 
       int io= Character.getNumericValue(C2);
       int io2 = Integer.parseInt(String.valueOf(C3));
       System.out.println(io);
       System.out.println(io2);
       
       
       //Decimal to binary
        System.out.println("Decimal to binary -" + Integer.toBinaryString(10));
        // 10/2=0 , 5/2=1, 2/2=0,  1/2=1
        
        //hexa to decimal
        
        System.out.println("Hexa decimal is "+ Integer.parseInt("AB", 16));
        //10*16^1 + 11*16^0=171
        
        // Decimal to hexa
        System.out.println("deci to hex is " + Integer.toHexString(121));
        //121/16=9 9/16 =7, -->79
        
        //octale to decimal
        System.out.println("octal is " + Integer.parseInt("121", 8));
        //1*8^2 + 2*8^1 = 81
        
      //  Decimal to octal
        System.out.println("Decimal to octal is " + Integer.toOctalString(81));
        //81/8=1,  10/8=2, 1/8=1 -->121 in reverse order 
        
        
        
       
       
       
       
       
      
       
       
        
        
        
       
        
        
		

	}

}
