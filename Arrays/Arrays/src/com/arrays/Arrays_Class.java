package com.arrays;

import java.util.Scanner;

public class Arrays_Class {
	public static void main(String[] args) {
		
		int[] arr = new int[10];
		
		arr[0] = 7;
		arr[1] = 5;
		arr[2] = 9;
		arr[3] = 4;
		arr[4] = 2;
		System.out.println(arr[0]);
		
		int[] arr2 = {1,3,2,4,24,4,4};
		System.out.println(arr2.length);
		System.out.println(arr.length);
		System.out.println(arr);
		Arrays_Class ac  = new Arrays_Class();
		ac.createCharArray();
		ac.createStringArray();
		ac.doubleArrat();
		ac.classMarks();
		
 	}
	
	void createCharArray() {
		char[] arr = new char[7];
		arr[1] = 'A';
		System.out.println("char array:"+ arr[0]);
		System.out.println("char array:"+ arr[1]);
	}
	
	void createStringArray() {
		String[] arr = new String[7];
		arr[1] = "FLM";
		System.out.println("String array:"+ arr[0]);
		System.out.println("String array:"+ arr[1]);
	}
	
	void doubleArrat() {
		double[] arr = new double[7];
		arr[1] = 1.2;
		arr[2] = 3.4;
		arr[3] = 4.5;
		arr[4] = 5.6;
		
		for(int i = 0; i< arr.length; i++) {
			System.out.println("marks of student " + arr[i]);
		}	
	}
	
	void classMarks() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of students : ");
		int size = sc.nextInt();
		double[] marks = new double[size];
		
		for(int i =0; i < marks.length; i++) {
			System.out.println("Enter the marks of student : " + (i+1));
			marks[i] = sc.nextDouble();			
		}
		
		for(int i =0; i<marks.length;i++) {
			System.out.println("Marks of the student "+ (i+1) +"->"+ marks[i]);
		}
		sc.close();
	}
}
