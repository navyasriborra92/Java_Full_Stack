package com.polymorphism;

public class Calculator {
	
	public static void main(String[] args) {
		int sum = sum();
		System.out.println(sum);
		sum = Calculator.sum(10,5);
		System.out.println(sum);
		Calculator.sum(10, 20, 30);
		
	}
	
	static int sum() {
		int a = 10+20;
		return a;
	}
	
	static int sum(int a, int b) {
		int c = a+b;
		return c;
	}
	
	static void sum(int a, int b, int c) {
		int d = a+b +c;
		System.out.println(d);;
	}

	/*  This cannot achieve polymorphism or 
	compile time polymorphism or 
	early binding or *
	method overloading
	
	static void sum(int a, int b) {
		int c = a+b;
		return c;
	}
	*/

}
