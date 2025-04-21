package com.statements;

import java.util.Scanner;

public class Satements_task_largestNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = sc.nextInt();
		System.out.println("Enter second number");
		int b = sc.nextInt();
		System.out.println("Enter third number");
		int c = sc.nextInt();
		int largest;
		
		if(a>=b && a>=c) {
			largest = a;
		}
		else if (b>=c && b>=a) {
			largest = b;
		}
		else {
			largest = c;
		}
		System.out.println(largest  + " is the largest number");
		sc.close();
	}

}
