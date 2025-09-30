package com.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.compare.Student;

public class CompareTest {

	public static void main(String[] args) {
List<Student> studentlist = new ArrayList<Student>();
		
		studentlist.add(new Student(10, "XXXX", "gefchs"));
		studentlist.add(new Student(2, "YYYY", "hfjbdh"));
		studentlist.add(new Student(22, "VVVVV", "ufdh"));
		studentlist.add(new Student(25, "NNNN", "iuhfdjn"));
		studentlist.add(new Student(28, "AAAA", "uhfjkj"));
		
		System.out.println(studentlist);
		Collections.sort(studentlist);
		System.out.println(studentlist);
		
		List<Employee> emps = new ArrayList<Employee>();
		emps.add(new Employee(344,"XXXX","Java"));
		emps.add(new Employee(424,"YYYY","AI"));
		emps.add(new Employee(934,"HHHH","DS"));
		emps.add(new Employee(134,"NNNN","BD"));
		emps.add(new Employee(354,"AAAA","GenAI"));
		
		System.out.println(emps);
		//one method classes outside
		Collections.sort(emps, new IdComparator());
		System.out.println(emps);
		Collections.sort(emps, new NameCompartor());
		System.out.println(emps);
		
		//second method anonymous class
		Comparator<Employee> skillComp = new Comparator<Employee>() {

			@Override
			public int compare(com.compare.Employee o1, com.compare.Employee o2) {
				// TODO Auto-generated method stub
				return o1.skill.compareTo(o2.skill);
			}
			
		};
		Collections.sort(emps, skillComp);
		System.out.println(emps);
		
		Comparator<Employee> idComp = (Employee emp1, Employee emp2) -> {
			return Integer.compare(emp1.id, emp2.id);
		};
		
		Collections.sort(emps, idComp);
		System.out.println(emps);
		
		Comparator <Employee> nameComp = (Employee emp1, Employee emp2) -> {
			return emp1.name.compareTo(emp2.name);
		};
		Collections.sort(emps, nameComp);
		System.out.println(emps);
		
		Comparator<Employee> skillCompartor = (Employee emp1, Employee emp2) ->{
			return emp1.skill.compareTo(emp2.skill);
		};
		Collections.sort(emps, skillCompartor);
		System.out.println(emps);
	}
}
