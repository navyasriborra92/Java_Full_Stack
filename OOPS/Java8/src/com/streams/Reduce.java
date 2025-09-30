package com.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Reduce {
	
	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<Integer>(Arrays.asList(1,2,4));
		
		Integer reduce = nums
		.stream()
		.reduce(0, (a,b) -> a+b);
		
		System.out.println(reduce);
		
		Integer reduce2 = nums
		.stream()
		.reduce(1, (a,b) ->(a*b));
		System.out.println(reduce2);
		
		List<String> words = new ArrayList<String>(Arrays.asList("aaa", "nnnn"));
		
		String reduce3 = words
		.stream()
		.reduce("", (a,b) -> a+" "+b);
		
		System.out.println(reduce3.trim());
	}

}
