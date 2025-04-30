package com.methods;

public class Method_Learning {
	public static void main(String[] args) {
		sum();
		Method_Learning ml = new Method_Learning();
		ml.sum1();
		int result = ml.sumOfTwoNumbers(10, 10);
		System.out.println(result);
	}
	
	static void sum(){
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println(c);
	}
	 void sum1(){
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println(c);
	}
	 
	int sumOfTwoNumbers(int a , int b) {
		int c = a+b;
		return c;
		
	}

}
