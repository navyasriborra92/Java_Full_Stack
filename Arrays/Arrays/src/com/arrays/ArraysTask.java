package com.arrays;

import java.util.Scanner;

public class ArraysTask {
	Scanner sc  = new Scanner(System.in);
	
	public static void main(String[] args) {
		ArraysTask at = new ArraysTask();
		at.byteArray();	
		at.shortArray();
		at.longArray();
		at.intArray();
		at.doubleArray();
		at.doubleArray();
		at.charArray();
		at.stringArray();
		at.booleanArray();
		
		for(int i =0; i<8; i++) {
			continue;
		}
	}
	
	void byteArray() {
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		byte[] byteArr = new byte[size];
		
		for(int i =0 ; i< byteArr.length ; i++) {
			System.out.println("Enter the values in the byteArray : ");
			byteArr[i] = sc.nextByte();
		}
		
		for(int i =0; i<byteArr.length ; i++) {
			System.out.println("Printing the elements in the byte Array at index " +"["+ (i)+"] :" + byteArr[i]);
		}
	}
	
	void shortArray() {
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		short[] shortArr = new short[size];
		
		for(int i =0 ; i< shortArr.length ; i++) {
			System.out.println("Enter the values in the shortArr : ");
			shortArr[i] = sc.nextShort();
		}
		
		for(int i =0; i<shortArr.length ; i++) {
			System.out.println("Printing the elements in the short Array at index " +"["+ (i)+"] :" + shortArr[i]);
		}
	}
	
	void longArray() {
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		long[] longArr = new long[size];
		
		for(int i =0 ; i< longArr.length ; i++) {
			System.out.println("Enter the values in the longArr : ");
			longArr[i] = sc.nextLong();
		}
		
		for(int i =0; i<longArr.length ; i++) {
			System.out.println("Printing the elements in the short Array at index " +"["+ (i)+"] :" + longArr[i]);
		}
	}
	
	void intArray() {
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		int[] intArr = new int[size];
		
		for(int i =0 ; i< intArr.length ; i++) {
			System.out.println("Enter the values in the intArray : ");
			intArr[i] = sc.nextInt();
		}
		
		for(int i =0; i<intArr.length ; i++) {
			System.out.println("Printing the elements in the int Array at index " +"["+ (i)+"] :" + intArr[i]);
		}
	}
	
	void doubleArray() {
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		double[] doubleArr = new double[size];
		
		for(int i =0 ; i< doubleArr.length ; i++) {
			System.out.println("Enter the values in the doubleArr : ");
			doubleArr[i] = sc.nextDouble();
		}
		
		for(int i =0; i<doubleArr.length ; i++) {
			System.out.println("Printing the elements in the double Array at index " +"["+ (i)+"] :" + doubleArr[i]);
		}
	}
	
	void floatArray() {
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		float[] floatArr = new float[size];
		
		for(int i =0 ; i< floatArr.length ; i++) {
			System.out.println("Enter the values in the floatArr : ");
			floatArr[i] = sc.nextFloat();
		}
		
		for(int i =0; i<floatArr.length ; i++) {
			System.out.println("Printing the elements in the float Array at index " +"["+ (i)+"] :" + floatArr[i]);
		}
	}
	
	void charArray() {
			System.out.println("Enter a word: ");
			String input = sc.next();
			char[] charArr = new char[input.length()];
		
		for(int i =0; i< input.length() ; i++) {
			charArr[i] = input.charAt(i);
			System.out.println("Printing the elements in the char Array at index " +"["+ (i)+"] :" + charArr[i]);
		}
	}
	
	void stringArray() {
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		String[] stringArr = new String[size];
		
		for(int i =0 ; i< stringArr.length ; i++) {
			System.out.println("Enter the values in the stringArr : ");
			stringArr[i] = sc.next();
		}
		
		for(int i =0; i<stringArr.length ; i++) {
			System.out.println("Printing the elements in the string Array at index " +"["+ (i)+"] :" + stringArr[i]);
		}
	}
	
	void booleanArray() {
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		boolean[] boolArr = new boolean[size];
		
		for(int i =0 ; i< boolArr.length ; i++) {
			System.out.println("Enter the values in the boolArr : ");
			boolArr[i] = sc.nextBoolean();
		}
		
		for(int i =0; i<boolArr.length ; i++) {
			System.out.println("Printing the elements in the boolean Array at index " +"["+ (i)+"] :" + boolArr[i]);
		}
	}

}
