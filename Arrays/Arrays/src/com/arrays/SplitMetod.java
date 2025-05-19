package com.arrays;

import java.util.Arrays;

public class SplitMetod {
	public static void main(String[] args) {
		String s = "Hi this is Java Class";
		String s2 = "Hi, this, Java, Class";
		String[] arr = s.split(" ");
		String[] arr1 = s.split(",");
		for (String a : arr) {
			System.out.println(a);
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr1));
	}

}
