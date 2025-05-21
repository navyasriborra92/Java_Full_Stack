package com.hasarelation;

public class Department {
	
	private String name;
	
	private int countOfStudents;
	
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Department [name=" + name + ", countOfStudents=" + countOfStudents + ", professor=" + professor + "]";
	}

	public Department(String name, int countOfStudents, Professor professor) {
		super();
		this.name = name;
		this.countOfStudents = countOfStudents;
		this.professor = professor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCountOfStudents() {
		return countOfStudents;
	}

	public void setCountOfStudents(int countOfStudents) {
		this.countOfStudents = countOfStudents;
	}

	//Has a Relation
	private Professor professor;

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

}
