package com.exception;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		try {
		System.out.println("Enter your age : ");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if(age > 18) {
			System.out.println("Eligible to vote");
		}
		else {
//			System.out.println("Not eligible to vote");
			throw new InvalidException("your are not eligible to vote");
		}
		}
		catch(Exception e){
			System.out.println(e);
			
		}
		
	}

}
