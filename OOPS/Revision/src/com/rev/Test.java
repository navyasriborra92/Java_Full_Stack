package com.rev;

import java.util.ArrayList;
import java.util.List;

public class Test {

	static String e;
	public static void main(String[] args) {
		
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(91, "xxx", 25346L));
		employees.add(new Employee(92, "yyy", 4654657L));
		employees.add(new Employee(71, "zzz", 3245764L));
		employees.add(new Employee(94, "nnn", 3546453537L));
		employees.add(new Employee(89, "aaa", 3245544635L));

		List<Employee> list = employees.stream()
		.distinct()
		.toList();
		
		Employee employee = employees
		.stream()
		.sorted((emp1, emp2) -> Integer.compare(emp1.id, emp2.id))
		.findFirst()
		.get();
		
		System.out.println(employee);
		
		Employee employee1 = employees
				.stream()
				.sorted((emp1, emp2) -> Integer.compare(emp1.id, emp2.id))
				.skip(1)
				.findFirst()
				.get();
		System.out.println(employee1);
		
		Employee employee2 = employees
				.stream()
				.sorted((emp1, emp2) -> Integer.compare(emp1.id, emp2.id))
				.skip(1)
				.findAny()
				.get();
		System.out.println(employee2);
		
		
		Employee employee3 = employees
				.stream()
				.sorted((emp1, emp2) -> Long.compare(emp1.salary, emp2.salary))
				.findFirst()
				.get();
		System.out.println(employee3);
	}
}
