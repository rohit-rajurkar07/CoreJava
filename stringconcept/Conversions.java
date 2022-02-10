package com.stringconcept;

public class Conversions {

	public static void main(String[] args) {
		//StringBuilder to StringBuffer//
		
		StringBuilder Sb= new StringBuilder();
		System.out.println("Sb-"+ Sb.getClass());
		Sb.append("xyz");
		StringBuffer sb1= new StringBuffer(Sb);
		sb1.append("pqr");
		System.out.println("Sb to sb1 "+ sb1 );
		
		//StringBuffer to StringBuilder
		StringBuffer Sb2= new StringBuffer();
		System.out.println("Sb2-"+ Sb2.getClass());
		Sb2.append("rohit ");
		StringBuilder sb3= new StringBuilder(Sb2);
		sb3.append("rajurkar");
		System.out.println("Sb to sb1 "+ sb3 );
		
		//String to StringBuffer
		
		String S= "Rohit";
		StringBuffer T= new StringBuffer(S);
		System.out.println("S to T: " + T.append(" RJ"));
		
		
		//String to StringBuilder
		String S1= "seema";
		StringBuffer T1= new StringBuffer(S1);
		System.out.println("S1 to T1: " + T1.append(" RJ"));
		
		//StringBuffer to String
		
		StringBuffer t2= new StringBuffer("TaTa");
		String t3= new String(t2);
		t3=t3.concat(" Motors");
		System.out.println(t3);
		
		//StringBuilder to String
		StringBuilder SB= new StringBuilder("Maruti ");
		String K= new String(SB);
		K=K.concat("Cars");
		System.out.println(K);
		
	}

}
