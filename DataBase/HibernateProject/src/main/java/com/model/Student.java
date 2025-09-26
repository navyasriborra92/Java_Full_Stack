package com.model;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedNativeQueries;
import jakarta.persistence.NamedNativeQuery;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

@Entity
@Table(name = "Student")
@NamedNativeQueries({@NamedNativeQuery(name = "allsqlStudents", query = "Select * From Student"), @NamedNativeQuery(name = "updatesqlStudents", query = "Update Student set marks = ?1 where studentId = ?2")})
@NamedQueries({@NamedQuery(name = "allStudents", query = "From Student"), @NamedQuery(name = "updateStudents", query = "Update Student set marks = ?1 where studentId = ?2")})
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "studentId")
	private int studentId;
	
	private String name;
	
	private int marks;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", marks=" + marks + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(marks, name, studentId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return marks == other.marks && Objects.equals(name, other.name) && studentId == other.studentId;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int studentId, String name, int marks) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.marks = marks;
	}
	
	public Student(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
	

}
