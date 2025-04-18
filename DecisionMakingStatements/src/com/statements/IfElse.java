package com.statements;

import java.util.Scanner;

public class IfElse {
	public static void main(String[] args) {
		
		/*
		 * only if - yes
		 * if else - yes
		 * only else - no
		 * only else if - no
		 * */
		 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number : ");
		int a = sc.nextInt();
		if (a==0) {
			System.out.println("zero");
		}
		if (a>0) {
			System.out.println("Positive");
		}
		if(a<0) {
			System.out.println("Negative");
		}
		if (a>0) {
			System.out.println("Positive");
		}
		else if(a ==0) {
			System.out.println("Zero");
		}
		else {
			System.out.println("Negative");
		}
		System.out.println("Bye");
		sc.close();
	}

}
