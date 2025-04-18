package com.statements;

import java.util.Scanner;

public class DynamicInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks = ");
		int marks = sc.nextInt();
		
		String result = (marks > 90 && marks <100) ? "Grade A" : (marks <= 90 && marks >70) ? "Grade B" : (marks <= 70 && marks >50) ? 
				"Grade C" : (marks <= 50 && marks >0) ? "Fail" : "Invalid";
			System.out.println(result);
			
			sc.nextLine();
			
			String name = sc.next("Enter name : ");
			System.out.println(name);
			
			//String name2 = sc.nextLine("Enter name2 : ");
			sc.close();
	}

}
