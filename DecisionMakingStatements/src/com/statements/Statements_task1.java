package com.statements;

import java.util.Scanner;

public class Statements_task1 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the operation to perform \n + \n - \n * \n / \n %");
		String operator = sc.nextLine();
		System.out.println("Enter the first input number");
		int a = sc.nextInt();
		System.out.println("Enter the second input number");
		int b = sc.nextInt();
		switch(operator) {
		case ("+") :
			int result = a+b;
			System.out.println(a + operator + b + "=" +result);
		case ("-") :
			result = a-b;
			System.out.println(a + operator + b + "=" + result);
		case ("*") :
			result = a*b;
			System.out.println(a + operator + b + "=" +result);
		case("/") :
			result = a/b;
			System.out.println(a + operator + b + "=" +result);
		case("%") :
			result = a%b;
			System.out.println(a + operator + b + "=" +result);
		}
		sc.close();
	}

}
