package com.wrapper;

public class Test {
	
	int num3;
	
	Integer num4;
	
	
	public static void main(String[] args) {
		int a = 10;
		Integer i = new Integer(20);
		
		System.out.println(a);
		System.out.println(i);
		
		
		//Autoboxing
		
		Integer c = Integer.valueOf(a);
		System.out.println(c);
		
		//Autounboxing
		int d = c.intValue();
		
		System.out.println(d);
		
		String s = "200";
		System.out.println( s+ 2);
		int num  = Integer.parseInt(s);
		System.out.println( num+ 2);
		String str = String.valueOf(num);
		System.out.println( str+ 2);
		
		
		// The local variable num2 may not have been initialized
		int num2;
		
		//System.out.println(num2);
		
		Test t = new Test();
		System.out.println(t.num3);
		
		System.out.println(t.num4);
	}
	

}
