package com.student;

import java.util.Scanner;

public class College {
	
	public static void main(String[] args) {
		while(true) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name : ");
		String name = sc.next();
		System.out.print("Enter your age : ");
		int age = sc.nextInt();
		System.out.println("Enter your choice \n 1.Student \n 2.Teacher");
		int type = sc.nextInt();
		
		switch(type) {
		case 1 :
			System.out.println("enter your rollno : ");
			int rollno = sc.nextInt();
			System.out.println("Enter the subject ");
			String subject = sc.next();
			System.out.println("enter the grade : ");
			char grade = sc.next().charAt(0);;
			StudentRegistration sr = new StudentRegistration();
			Student student = new Student(rollno, subject,grade );
			sr.addStudent(student);			
			break;
		case 2:
			System.out.println("Enter subject : ");
			String subjecthandled =  sc.next();
			Teacher t = new Teacher();
			t.registerTeacher(subjecthandled);
			break;
		
			}
		}
	}

}
