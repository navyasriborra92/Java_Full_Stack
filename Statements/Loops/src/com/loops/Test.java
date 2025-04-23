package com.loops;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many times u want to print ?  ");
		int number = sc.nextInt();
		//iteration count is know then for loop is used
		for(int i =1; i<= number ; i++) {
			System.out.println(i);
		}
		//upto when while loop has to stop
		int times = sc.nextInt();	
		while(times != 0) {
			System.out.println(times + "times");
			times = sc.nextInt();
		}
		sc.close();
	}

}
