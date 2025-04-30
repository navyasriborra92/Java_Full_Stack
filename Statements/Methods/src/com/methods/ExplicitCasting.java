package com.methods;

public class ExplicitCasting {
	public static void main(String[] args) {
		short s = 65;
		byte b = (byte) s;
		char c = (char) s;
		
		float num = '&';
		
		System.out.println("Short: " + s);
		System.out.println("byte: " + b);
		System.out.println(c);
		System.out.println(num);
	}

}
