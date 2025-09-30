package com.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
	
	private int empid;
	
	private String name;
	
	private int age;
	
	private String email;
	
	private double salary;
	
	private String phone_number;

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", age=" + age + ", email=" + email + ", salary="
				+ salary + ", phone_number=" + phone_number + "]";
	}

	public Employee(int empid, String name, int age, String email, double salary, String phone_number) {
		super();
		this.empid = empid;
		this.name = name;
		this.age = age;
		this.email = email;
		this.salary = salary;
		this.phone_number = phone_number;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
