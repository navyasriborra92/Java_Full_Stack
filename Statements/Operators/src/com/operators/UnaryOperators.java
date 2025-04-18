package com.operators;

public class UnaryOperators {
	public static void main(String[] args) {
		/*These are performed on single operand
		 * 1. +a(5, +5)
		 * 2. a= 5
		 * -a = -5
		 * ! operator(opposite)
		 * !true = false
		 * !false = true
		 * 
		 */
		
		boolean a = true;
		System.out.println(!a);
		
		//Increment Operator
		//post increment a++
		int b = 10;
		b++;
		System.out.println(b);
		int x = 12;
		System.out.println(x++);
		System.out.println(x);
		
		//Pre increment
		int c = 13;
		++c;
		System.out.println(c);
		System.out.println(++c);
		System.out.println();
		
		//Decrement Operator
		//post decrement operator
		int e = 9;
		e--;
		System.out.println(e);
		System.out.println(e--);
		
		//pre decrement operator
		int y = 7;
		--y;
		System.out.println(y);
		System.out.println(--y);
		
	}

}
