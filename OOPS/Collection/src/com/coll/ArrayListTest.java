package com.coll;

import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add("gfuygfiuk");
		al.add(4);
		al.get(0);
		al.add(new Employee("dsgfsdg", 10));
		Employee emp = (Employee)al.get(3);
		System.out.println(emp);
		System.out.println(al);
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("gffyt");
		names.add("jhguyg");
		System.out.println(names);
		
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee("ccfgdytfdt",10));
		employees.add(new Employee("guyjh",10));
		System.out.println(employees);
	}
}
	
	class Employee{
		String name;
		int age;
		public Employee() {
			super();
			// TODO Auto-generated constructor stub
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public Employee(String name, int age) {
			super();
			this.name = name;
			this.age = age;
		}
		@Override
		public String toString() {
			return "Employee [name=" + name + ", age=" + age + "]";
		}
	}

