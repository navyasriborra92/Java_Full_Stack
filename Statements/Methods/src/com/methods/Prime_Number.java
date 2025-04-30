package com.methods;

import java.util.Scanner;

public class Prime_Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		Prime_Number pn = new Prime_Number();
		pn.prime1(num);
		pn.prime2(num);
		pn.prime3(num);
		pn.prime4(num);
		pn.prime5(num);
		sc.close();
		
	}

	void prime1(int num) {
		long starttime = System.currentTimeMillis();
		
		int count = 0;
		for(int i = 1; i <=num; i++){
			if(num % i == 0) {
				count++;
			}
		}
		long endtime = System.currentTimeMillis();
		if (count ==2) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Not Prime");
		}
		
		long time = endtime -starttime;
		System.out.println(time);
		
	}
	
	void prime2(int num) {
		long starttime = System.currentTimeMillis();
		int count = 0;
		for(int i = 2; i <=num; i++){
			if(num % i == 0) {
				count++;
			}
		}
		long endtime = System.currentTimeMillis();
		if (count ==1) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Not Prime");
		}
		long time = endtime-starttime;
		System.out.println(time);
		
	}
	
	void prime3(int num) {
		long starttime = System.currentTimeMillis();
		int count = 0;
		for(int i = 2; i <=num -1; i++){
			if(num % i == 0) {
				count++;
			}
		}
		long endtime = System.currentTimeMillis();
		if (count == 0) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Not Prime");
		}
		long time = endtime-starttime;
		System.out.println(time);
		
	}
	
	void prime4(int num) {
		long starttime = System.currentTimeMillis();
		int count = 0;
		for(int i = 2; i <=num/2; i++){
			if(num % i == 0) {
				count++;
			}
		}
		long endtime = System.currentTimeMillis();
		if (count == 0) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Not Prime");
		}
		long time = endtime-starttime;
		System.out.println(time);
		
	}
	
	void prime5(int num) {
		long starttime = System.currentTimeMillis();
		int count = 0;
		for(int i = 2; i<=Math.sqrt(num) ; i++){
			if(num % i == 0) {
				count++;
			}
		}
		long endtime = System.currentTimeMillis();
		if (count == 0) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Not Prime");
		}
		long time = endtime -starttime;
		System.out.println(time);
		
	}
}
