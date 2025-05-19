package com.accessmodifiers;

public class Class1 {
	
	public int a = 10;
	
	private int b = 20;
	
	protected int c = 30;
	
	int d = 40;
	
	public static void main(String[] args) {
		Class1 obj = new Class1();
		System.out.println(obj.a);
		System.out.println(obj.b);
		obj.hi();
		
	}
	
//	private Class1() {
//		
//	} ///if private constructor any other class cannot see the constructor
	
//	protected Class1() {
//		
//	}

	public void hi() {
		System.out.println("hi from class1");
	}
	
	private void bye() {
		System.out.println("bye");
	}
}
