package com.statements;

import java.util.Scanner;

public class Statements_task_tax {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the salary : ");
		int salary = sc.nextInt();
		int tax;
		
		if (salary < 250000) {
			System.out.println("no tax");
		}
		else if(salary <500000 && salary >= 250000) {
			tax = (salary * 5)/100;
			System.out.println(tax +"tax");
		}
		else if(salary <1000000 && salary >= 500000) {
			tax = (salary*20)/100;
			System.out.println(tax +"tax");
		}
		else if(salary >= 1000000) {
			tax = (salary*30)/100;
			System.out.println(tax +"tax");
		}
		sc.close();
	}
}
