package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Employee;
import com.model.Student;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctxt = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("Context Loaded");
		
		StudentDetails(ctxt);

		
		Employee emp = ctxt.getBean("emp", Employee.class);
		System.out.println(emp);
	}

	private static void StudentDetails(ApplicationContext ctxt) {
		//		Student st = new Student();
		//		System.out.println(st);
				
				//IOC
				Student student = ctxt.getBean("st", Student.class);
				System.out.println(student);
				Student student2 = ctxt.getBean("st", Student.class);
				System.out.println(student2);
	}

}
