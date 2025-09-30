package com.student;

public class Student extends Person{
	
	private int rollno;
	
	private String subjects;
	
	private char grade;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String displayinfo() {
		return "Student [rollno=" + rollno + ", subjects=" + subjects + ", grade=" + grade + "]";
	}

	public Student(int rollno, String subjects, char grade) {
		super();
		this.rollno = rollno;
		this.subjects = subjects;
		this.grade = grade;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getSubjects() {
		return subjects;
	}

	public void setSubjects(String subjects) {
		this.subjects = subjects;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

}
