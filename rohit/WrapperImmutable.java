package com.rohit;

public class WrapperImmutable {
	Integer i= 5;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      WrapperImmutable wi = new WrapperImmutable();
      System.out.println("Initial Value - " + wi.i);
      
      modifier(wi.i);
      System.out.println("After value " + wi.i);
	}

	private static void modifier(Integer i) {
		
		//private= access modifier
		//modifier= name of methed inside we have taken argument
		
		i= i+1;
	}

}
