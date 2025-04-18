package com.operators;

public class LogicalOperators {
	public static void main(String[] args) {
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = true;
		boolean b4 = false;
		System.out.println(b1 && b3);
		System.out.println(b1 && b2);
		System.out.println(b2 && b3);
		System.out.println(b2 && b4);
		System.out.println();
		System.out.println(b1 || b3);
		System.out.println(b1 || b2);
		System.out.println(b2 || b3);
		System.out.println(b2 || b4);
		System.out.println();
		
		System.out.println(!true);
		System.out.println(!false);
		System.out.println();
		
		System.out.println(b1 || b2 && b3);
		// true || false && true
		//true
		//&& has the highest precedence first && is calculated 
		
		System.out.println(b2 || b1 && (b2 ||b4));
		// brackets highest precedence
		
		System.out.println(b2 || b1 && (b2 ||b4 && b1));
		//in brackets again  same && has highest
		
		System.out.println();
		int num1 = 10;
		int num2 = 30;
		int num3 = 10;
		
		boolean result = (num1 <num2) && (num2 >= num3);
		//(relational operator) && (relational operator)
		System.out.println(result);
		
		boolean result1 = (num1 >= num3) || (num1 != num3) && (num2< num3);
		System.out.println(result1);
		System.out.println(!result1);
		
		System.out.println();
		//System.out.println(5!= 5);
		System.out.println();
		
		
		//Ternary Operator
		//boolean condition ? exec1 : exec2
		//if condition is true expression after ? will be executed
		//if condition is false expression after : will be executed
		int a =10;
		int b = 9;
		
		boolean isALarge = (a>b)? true : false;
		System.out.println(isALarge);
		
		String res = (a<b) ? "A is small" :"A is big";
		System.out.println(res);
		
		
		//bug
		String res1 = (a>b) ? "A is small" :"A is big";
		System.out.println(res1);
		
		int age =18;
		String isVote = age >= 18 ? "Can Vote" :"Not elgible to vote";
		System.out.println(isVote);
		
		int number = 8;
		String value = number > 0 ? "number is positive ": "number is negative";
		System.out.println(value);
		
		//nested ternary operator
		int number1 = 0;
		String value1 = (number1 >0) ? "number is positive" : (number1 == 0) ? "number is zero" : "number is negative";
		System.out.println(value1);
		
		
	}

}
