package com.polymorphism;

public class Final {
	
	int a = 10;
	final int b = 20;
	
	public static void main(String[] args) {
		Final f = new Final();
		f.a =20;
		System.out.println(f.a);
//		f.b = 
	}
	
	final void hi() {
		System.out.println("hi");
	}
	
	void hi(String name) {
		System.out.println("name "+ name);
	}

}
