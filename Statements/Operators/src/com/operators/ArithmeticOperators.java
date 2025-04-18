package com.operators;

public class ArithmeticOperators {
	
	public static void main(String[] args) {
	int a = 10;
	int b = 20;
	int c = 30;
	int add = a +b;
	System.out.println(a +"+"+ b + "="+ add);
	
	int subtract = b-a;
	System.out.println(a +"-"+ b + "="+ subtract);
	
	int multiply = a*b;
	System.out.println(a +"*"+ b + "="+ multiply);
	
	int division = a/b;
	System.out.println(a +"/"+ b + "="+ division);
	
	int modulo = a%b;
	System.out.println(a +"%"+ b + "="+ modulo);
	
	System.out.println(a+b +"ab"+ a +b);
	
	//BODMAS
	System.out.println(a+b* c-a+(a+b)+b/a);
	
	System.out.println('a'-b);
	//asc code for a =97 when used as char
	
	float d= 12.0f;
	float e = 2.0f;
	System.out.println(d+e);
	System.out.println(d-e);
	
	int x = 4;
	float y= 3.0f;
	float addition = x+y;
	System.out.println(addition);
	
	System.out.println(d/e);
	System.out.println(d%e);
	System.out.println(x/y);
	System.out.println(x%y);
	
	
	}

}
