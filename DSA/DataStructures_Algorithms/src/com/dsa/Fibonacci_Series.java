package com.dsa;

import java.util.Scanner;

public class Fibonacci_Series {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range : ");		
        int n = sc.nextInt(); // number of terms
        int a = 0, b = 1;

        System.out.print("Fibonacci Series: " + a + " " + b);

        for (int i = 2; i < n; i++) {
            int next = a + b;
            System.out.print(" " + next);
            a = b;
            b = next;
        }
        sc.close();
	}

}
