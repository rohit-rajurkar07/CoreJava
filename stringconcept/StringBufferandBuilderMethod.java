package com.stringconcept;
class BufferandBuilderMethod {
	public static void Methodappend() {
		//it is used to concat the string
		StringBuffer sb= new StringBuffer("Rohit");
		sb.append("Rajurkar");
		System.out.println(sb);
		StringBuffer Sb= new StringBuffer("Rohit");
		Sb.append("Rajurkar");
		System.out.println(Sb);
	}
	public static void MethodInsert() {
		//insert given string at given position 
		
		StringBuffer sb1= new StringBuffer("Seema ");
		sb1.insert(1, "Rajurkar");
		System.out.println(sb1);
		
		StringBuilder sb2= new StringBuilder("Seema ");
		sb2.insert(1, "Rajurkar");  // Rajurkar is inserted in index1
		System.out.println(sb2);
	}
	public static void Methodreplace () {
		//it replaces the given string from specified begin index to end index
		
		StringBuffer k= new StringBuffer("xyzhgtds");
		k.replace(2, 5,"pqr");
		System.out.println(k);
		//for zhgt replaces pqr 
		StringBuffer l= new StringBuffer("ASDFGHJMNBV");
		l.replace(3, 6,"QWE"); // GHJ REPLACES QWE
		System.out.println(l);
	}
	public static void MethodDelete() {
		//it deletes the string from specified begin index to the end index
		StringBuffer M= new StringBuffer("xyzhgtds");
		M.delete(2, 6);
		System.out.println(M);
		 
		StringBuilder N= new StringBuilder("QWERFDSAZXC");
		N.delete(3,5);
		System.out.println(N);
		
	}
	public static void MethodReverse() {
		StringBuffer O= new StringBuffer("xyzhgtds");
		O.reverse();
		System.out.println(O);
		 
		StringBuilder P= new StringBuilder("QWERFDSAZXC");
		P.reverse();
		System.out.println(P);
		
}
}

public class StringBufferandBuilderMethod {

	public static void main(String[] args) {
		
		//BufferandBuilderMethod b=new BufferandBuilderMethod();
		//BufferandBuilderMethod.Methodappend();
		//BufferandBuilderMethod.MethodInsert();
		//BufferandBuilderMethod.Methodreplace();
		//BufferandBuilderMethod.MethodDelete();
		BufferandBuilderMethod.MethodReverse();
	
	
	}

}
