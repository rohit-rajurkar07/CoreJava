package com.rohit;

public class OperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//operator-> to perform mathematical operation
		// UNARY --> NEED ONLY ONE OPERAND TO PERFORM ANY OPERTION
		
		// post increment--> first print the value then increase
	
		int age =20;
		System.out.println(age++);
		// age = 20
		
		//post decrement--> first print the value then decrease
		
		System.out.println(age--);
		//age=20
		
		//pre- increment --> first increase
		
		System.out.println(++age);
		//age=21
		
		//pre decrement 
		System.out.println(--age);
		//age= 20
		
		//arithmetic operation --> add, sub, mul, div
		
		int a=10;
		int b=8;
		System.out.println("Addition = " + (a+b));
		System.out.println("Subtraction = " + (a-b));
		System.out.println("Multiplication = "+ (a*b));
		System.out.println("division = "+ (a/b));
		
		//shift operator 
		
		 //1) Right operator 
		
		int c = 10;
		int d = 2;
		System.out.println(c>>d);  // ( it uses the right shifting internally) = 10>>2 = 10/2^2 = 10/4=2
		
		//left operator
		System.out.println(c<<d);  //(it uses the left shifting internally = 10<<2 = 10*2^2= 10*4= 40)
		
		// Relational operator (<,>,<=,>=,==,!=)
		
		int x = 8;
		int y = 7;
		System.out.println("less than = "+ (x<y));
		System.out.println("greator than =  "+ (x>y));
		System.out.println("less than equals = "+ (x<=y));
		System.out.println("greator than equal= "+ (x>=y));
		System.out.println("equals  =" + (x=y));
		System.out.println("Not equals ="+ (x!=y));
		
		
		//Assignment operators ( =, +=, -=, *=, /=, 
		
		int p= 2;
		int q= 4;
		p += q;
		System.out.println("addition =" + p);
		p-= q;
		System.out.println(+p);
		p*=q;
		System.out.println(+p);
		p/=q;
		System.out.println(+p);
	

		int v=15;
		int u=10;
		System.out.println((v+u));
		
		
	//Bit- wise operators
		int w=10;
		int m=20;
		System.out.println(w&m); // if we have both the true value it gives true, 10 is 1010 and 20 is 10100
		                                                                                    //  10 is  01010
		                                                                           //         result = 11110
		System.out.println(w|m);
		System.out.println(w^m);
		
		// Logical operator --> (&&, ||)
		 
		int k= 10;
		int l=20;
		
		System.out.println((k<l)&&(l<k));
		// if both the condition are true then it will writen true
		
		System.out.println((k<l) || (l<k));
		//if any codition is true then it write true
		
	// Ternary Operator also called conditional operator
		 int xc = 8;
		 int yc =9;
		 
		int result = (xc>yc)?xc:yc;
		System.out.println(result);
		
		
		
		
		
		
    
		
		
		
		
		
		
	}

}
