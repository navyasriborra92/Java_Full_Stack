package com.streams;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class HashMapFunctions {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(5, "eee");
		map.put(7, "ggg");
		map.put(4, "xxx");
		map.put(9, "yyy");
		map.put(1, "nnn");
		map.put(8, "aaa");
		
		map
		.entrySet()
		.stream()
		.forEach(entry -> System.out.println(entry.getKey()+ "-"+ entry.getValue()));
		
		map
		.keySet()
		.stream()
		.forEach(key -> System.out.println(key));
		
		map
		.values()
		.stream()
		.forEach(value -> System.out.println(value));
		
		List<String> list = map
		.values()
		.stream()
		.toList();
		
		System.out.println(list);
		
		//greater than 2
		List<Integer> list2 = map
		.keySet()
		.stream()
		.filter(key -> key >=2)
		.toList();
		
		System.out.println(list2);
		
		Map<Integer, String> collect = map
		.entrySet()
		.stream()
		.filter(entry -> entry.getKey() >=2)
		.collect(Collectors.toMap(entry -> entry.getKey(), entry -> entry.getValue()));
		
		System.out.println(collect);
		
HashMap<String, String> map1 = new HashMap<String, String>();
		
		map1.put("String1", "course1");
		map1.put("String2", "course2");
		map1.put("String3", "course3");
		map1.put("String4", "course1");
		map1.put("String5", "course1");
		map1.put("String6", "course1");
		
		List<String> list3 = map1
		.entrySet()
		.stream()
		.filter(entry -> entry.getValue().equals("course1"))
		.map(entry -> entry.getKey())
		.toList();
		
		System.out.println(list3);
		
		//count even no
		List<Integer> nums = new ArrayList<Integer>(Arrays.asList(3,563,7,56,67,85,2));
		
		long count = nums
		.stream()
		.filter(num -> num%2 ==0)
		.count();
		
		System.out.println(count);
		
		//sums of nums
		
		int sum = nums
		.stream()
		.mapToInt(n -> n)
		.sum(); //works only on int
		
		System.out.println(sum);
		
		//multiples of 5
		List<Integer> list4 = nums
		.stream()
		.filter(n -> n%5 ==0)
		.toList();
		
		System.out.println(list4);
		
		double average = nums
		.stream()
		.mapToInt(n -> n)
		.average()
		.getAsDouble();
		
		System.out.println(average);
		
		//Optional will prevent to get from null value
		
		int max = nums
		.stream()
		.mapToInt(n -> n)
		.max()
		.getAsInt();
		
		System.out.println(max);
		
		int min = nums
				.stream()
				.mapToInt(n -> n)
				.min()
				.getAsInt();
		
		System.out.println(min);
		
		//map -- modification
		//flatmap --merges multiple collection into single collection
		
		List<List<String>> words = new ArrayList<List<String>>();
		words.add(Arrays.asList("hi", "bye"));
		words.add(Arrays.asList("one", "two"));
		words.add(Arrays.asList("apple", "ball"));
		
		List<String> list5 = words
		.stream()
		.flatMap(word -> word.stream())
		.toList();
		
		System.out.println(list5);
		
		//list - stream -order
		//parallel stream order is not guaranteed
		
		List<Integer> numbers = new ArrayList<Integer>(Arrays.asList(3,563,7,56,67,85,2));
		
		numbers
		.parallelStream()
		.forEach(n -> System.out.println(n));
		
			numbers
				.stream()
				.forEach(n -> System.out.println(n));

		//allmatch
			
			boolean match =numbers
			.stream()
			.allMatch(n -> n%5 ==0);
			
			System.out.println(match);
			
			numbers
			.stream()
			.limit(5)
			.forEach(n -> System.out.println(n));
			
			boolean nonematch =numbers
					.stream()
					.noneMatch((n -> n%5 ==0));
					
					System.out.println(nonematch);
		
	}
}
