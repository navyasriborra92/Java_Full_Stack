package com.statements;

import java.util.Scanner;

public class statement_task_discount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int price = 1000;
		System.out.println(("enter the number of products bought : "));
		int products = sc.nextInt();
		System.out.println("Is member premium ? ");
		boolean premium =sc.nextBoolean();
		int discount;
		int total_price = products *price;
		int final_price;
		
		if(premium ==true) {
			discount = products * 100;
			final_price = total_price - discount;
		}
		else {
			final_price = total_price;
		}
		System.out.println(final_price);
		sc.close();
	}

}
