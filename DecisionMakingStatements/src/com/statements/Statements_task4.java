package com.statements;

import java.util.Scanner;

public class Statements_task4 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		
		if(number %2 ==0 && number % 5 == 0) {
			System.out.println("Number is even and divisble by 5");
		}
		else if (number % 2 ==0 && number % 5 != 0) {
			System.out.println("Number is even and not divisible by 5");
		}
		else {
			System.out.println("number is odd");
		}
		sc.close();
		
	}

}
