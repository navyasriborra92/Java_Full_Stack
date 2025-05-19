package com.dsa;

public class Factorial {
	public static void main(String[] args) {
		int a = 1;
		int result = 1;
		for(int i=a ; i<=5; i++) {
			result*=i;
		}
		System.out.println(result);
	}

}
