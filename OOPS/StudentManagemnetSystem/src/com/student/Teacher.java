package com.student;

public class Teacher extends Person{
	
	private String subjecthandled;

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Teacher(String subjecthandled) {
		super();
		this.subjecthandled = subjecthandled;
	}

	public String getSubjecthandled() {
		return subjecthandled;
	}

	public void setSubjecthandled(String subjecthandled) {
		this.subjecthandled = subjecthandled;
	}

	public void registerTeacher(String subject) {
		// TODO Auto-generated method stub
		
	}

}
