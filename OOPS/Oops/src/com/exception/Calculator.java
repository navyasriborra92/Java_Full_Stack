package com.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
		System.out.println("Enter first number : ");
		int num1 = sc.nextInt();
		System.out.println("Enter second number :  ");
		int num2 = sc.nextInt();
		int num3 = num1/num2;
		System.out.println("After division : "+ num3);
		sc.close();
			}
		catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println("Byee");
		
		
		try {
		
		System.out.println("Enter first number : ");
		int num1 = sc.nextInt();
		System.out.println("Enter second number :  ");
		int num2 = sc.nextInt();
		int num3 = num1/num2;
		System.out.println("After division : "+ num3);
		sc.close();
			}
		catch(InputMismatchException e) {
			System.out.println(e);
		}
		
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		
		finally {
			System.out.println("Finally");
			sc.close();
		}
		
		System.out.println("Byee");
		
	}

}
