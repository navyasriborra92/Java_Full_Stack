package com.student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentRegistration {
	
	Scanner sc = new Scanner(System.in);
	Student student;
	
	ArrayList<Student> studentlist = new ArrayList<>();
	
	public void addStudent(Student student) {
		studentlist.add(student);
		System.out.println("Student Registered successfully" + student);
		for(Student s : studentlist) {
			s.displayinfo();
 		}
	}
	
	public Student studentByRollNo(int rollno) {
		for(Student student : studentlist) {
			student.displayinfo();
 		}		
		return null;
	}

}
