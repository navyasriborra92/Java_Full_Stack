package com.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.streams.Employee;

public class StreamOperation {

	public static void main(String[] args) {
		
		List<Integer> nums = new ArrayList<Integer>(Arrays.asList(1,4,32,44,24,34,24,44,4));
		//sort asc
		List<Integer> list = nums
		.stream()
		.sorted()
		.toList();
		
		System.out.println(list);
		//desc
		List<Integer> list1 = nums
				.stream()
				.sorted(Comparator.reverseOrder())
				.toList();
		
		System.out.println(list1);
		//even
		List<Integer> even = nums
				.stream()
				.filter((num)-> num%2 ==0)
				.toList();
		
		System.out.println(even);
		//set
		Set<Integer> sort = nums
				.stream()
				.sorted()
				.collect(Collectors.toSet());
		System.out.println(sort);
		
		List<Employee> emps = new ArrayList<Employee>();
		emps.add(new Employee(344,"XXXX",1000));
		emps.add(new Employee(424,"YYYY",1900));
		emps.add(new Employee(934,"HHHH", 2346));
		emps.add(new Employee(134,"NNNN",100000000));
		emps.add(new Employee(354,"AAAA",10000000));
		//hike salary
		List<Integer> emphike = emps
				.stream()
				.map((emp)-> emp.salary+= 5000)
				.toList();
		
		System.out.println(emphike);
		//sort by emp name
		List<Employee> hike = emps
				.stream()
				.map((emp)-> new Employee(emp.empid, emp.empName, emp.salary+= 5000))
				.toList();
		
		System.out.println(hike);
		//sort by empid
		emps
				.stream()
				.sorted((emp1, emp2)-> Integer.compare(emp1.empid, emp2.empid))
				.forEach(emp -> System.out.println(emp));
		//startswith
		emps
		.stream()
		.filter(emp -> emp.empName.startsWith("N"))
		.forEach(emp -> System.out.println(emp));
		
		//greater
		emps
		.stream()
		.filter(emp -> emp.salary > 100000)
		.forEach(emp -> System.out.println(emp));
		
		System.out.println(emps);
		
		System.out.println(nums);
		
		//Distinct
		List<Integer> unique = nums
				.stream()
				.distinct()
				.toList();
		System.out.println(unique);
		
		//find highest value
		Integer integer = nums
		.stream()
		.sorted(Comparator.reverseOrder())
		.findFirst()
		.get();
		
		System.out.println(integer);
		
		//find second highest
		
		Integer integer2 = nums
		.stream()
		.sorted(Comparator.reverseOrder())
		.distinct()
		.skip(1)
		.findFirst()
		.get();
		
		System.out.println(integer2);
	}
}
