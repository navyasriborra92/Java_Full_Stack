package com.coll;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Iteration {
	
	public static void main(String[] args) {
		
		Student s1 = new Student(1, "Navya");
		Student s2 = new Student(2, "dfgdf");
		Student s3 = new Student(3, "cvbb");
		Student s4 = new Student(4, "esrtesrt");
		Student s5 = new Student(5, "wretretr");
		
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);
		
		System.out.println(students);
		
		for(int i = 0; i<students.size();i++) {
			System.out.println(students.get(i));
		}
		System.out.println("------------------");
		for(Student s : students) {
			System.out.println(s);
		}
		System.out.println("---------------");
		
		//Iterator
		Iterator<Student> iterator = students.iterator();
		while(iterator.hasNext()) {
			Student next = iterator.next();
			System.out.println(next);
		}
		
		System.out.println("ListIterator----------------");
		ListIterator<Student> listIterator2 = students.listIterator();
		while(listIterator2.hasNext()) {
			Student next = listIterator2.next();
			System.out.println(next);
		}
		System.out.println("ListIteratorprevious----------------");
		while(listIterator2.hasPrevious()) {
			Student previous = listIterator2.previous();
			System.out.println(previous);
		}
		
		
	}

}

class Student {
	int id;
	String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
