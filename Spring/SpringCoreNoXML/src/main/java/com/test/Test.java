package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.config.Config;
import com.model.Student;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext ctxt = new AnnotationConfigApplicationContext(Config.class);
		Student student = ctxt.getBean("student", Student.class);
		System.out.println(student);
		
		SimTest simtest = ctxt.getBean("simTest", SimTest.class);
		System.out.println(simtest);
		simtest.callSim();
	}	

}
