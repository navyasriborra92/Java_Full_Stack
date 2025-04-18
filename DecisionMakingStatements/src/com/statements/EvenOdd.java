package com.statements;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int a = sc.nextInt();
		if(a ==0) {
			System.out.println("number is zero");
		}
		else if(a%2 ==0) {
			System.out.println("Number is Even");
		}
		else {
			System.out.println("Number is Odd");
		}
		sc.close();
	}

}
