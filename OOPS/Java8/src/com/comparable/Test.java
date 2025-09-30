package com.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<Student> studentlist = new ArrayList<Student>();
		
		studentlist.add(new Student(10, "XXXX"));
		studentlist.add(new Student(2, "YYYY"));
		studentlist.add(new Student(22, "VVVVV"));
		studentlist.add(new Student(25, "NNNN"));
		studentlist.add(new Student(28, "AAAA"));
		
		System.out.println(studentlist);
		Collections.sort(studentlist);
		System.out.println(studentlist);
		
		//Comparator
		
		List<Employee> emps = new ArrayList<Employee>();
		emps.add(new Employee(344,"XXXX","Java"));
		emps.add(new Employee(424,"YYYY","AI"));
		emps.add(new Employee(934,"HHHH","DS"));
		emps.add(new Employee(134,"NNNN","BD"));
		emps.add(new Employee(354,"AAAA","GenAI"));
		
		System.out.println(emps);
//		Collections.sort(emps, new IdComparator());
		System.out.println(emps);
		Collections.sort(emps, new NameComparator());
		System.out.println(emps);
		Comparator<Employee> domainComp = new Comparator<Employee>() {

			@Override
			public int compare(Employee emp1, Employee emp2) {
				// TODO Auto-generated method stub
				return emp1.domain.compareTo(emp2.domain);
			}
		};
		Collections.sort(emps, domainComp);
		System.out.println(emps);
		
		Comparator<Employee> idComp = (Employee emp1, Employee emp2) -> {
			return Integer.compare(emp1.empid, emp2.empid);
			
		};
		Collections.sort(emps, idComp);
		System.out.println(emps);
		
		Collections.sort(emps, (Employee emp1, Employee emp2) -> {
			return emp1.domain.compareTo(emp2.domain);
			
		});
		
		System.out.println(emps);
		
	}
}
