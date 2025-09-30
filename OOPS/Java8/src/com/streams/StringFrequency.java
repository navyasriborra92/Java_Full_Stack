package com.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringFrequency {
	public static void main(String[] args) {
		List<String> fruits = new ArrayList<String>(Arrays.asList("Apple","apple", "guava", "apple", "orange", "grapes"));
		
		Map<String, Long> collect = fruits
		.stream()
		.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		System.out.println(collect);
		
		String fruit = "Apple";
		
		Map<Character, Long> collect2 = fruit
				.toLowerCase()
		.chars()
		.mapToObj(n-> (char) n)
		.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		System.out.println(collect2);
		
		int[] arr = {1,4,64,6,8};
		Arrays.stream(arr)
		.filter(n-> n%2 ==0)
		.forEach(n -> System.out.println(n));
	}


}
