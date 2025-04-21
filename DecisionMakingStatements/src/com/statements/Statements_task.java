package com.statements;

import java.util.Scanner;

public class Statements_task {
	public static void main(String[] args) {
		System.out.println("Menu \n 1.Chicken65 \n 2.Paneer \n 3.Mutton \n 4.biryani \n 5.ice cream");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		if(i==1) {
			System.out.println("Your Chicken65 order is placed successfully");
		}
		else if(i ==2){
			System.out.println("Your Paneer order is placed successfully");
		}
		else if(i==3) {
			System.out.println("Your Mutton order is placed successfully");
		}
		else if(i ==4) {
			System.out.println("Your biryani order is placed successfully");
		}
		else if(i==5) {
			System.out.println("Your ice cream order is placed successfully");
		}
		sc.close();
	}

}
