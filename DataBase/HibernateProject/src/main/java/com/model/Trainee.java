package com.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Trainees")
public class Trainee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int traineeId;
	
	private String name;
	
	public Trainee(String name) {
		super();
		this.name = name;
	}

	@ManyToMany(cascade= CascadeType.ALL)
	@JoinTable(name = "Trainees_Courses", 
	joinColumns = {@JoinColumn(name = "Trainedd_Id")}, 
	inverseJoinColumns = {@JoinColumn (name = "Course_Id")})
	private List<Course> courses;

	public int getTraineeId() {
		return traineeId;
	}

	public void setTraineeId(int traineeId) {
		this.traineeId = traineeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Trainee [traineeId=" + traineeId + ", name=" + name + ", ]";
	}

	public Trainee(int traineeId, String name) {
		super();
		this.traineeId = traineeId;
		this.name = name;
	}

	public Trainee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	public Trainee(int traineeId, String name, List<Course> courses) {
		super();
		this.traineeId = traineeId;
		this.name = name;
		this.courses = courses;
	}
	
	

}
