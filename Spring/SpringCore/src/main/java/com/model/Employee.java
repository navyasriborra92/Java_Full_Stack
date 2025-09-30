package com.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {

	private int empid;
	
	private List<String> skills;

	private Set<String> softskills;
	
	private Map<Integer, String> hobbies;
	
	private Address address;

	public Employee(int empid, List<String> skills, Set<String> softskills, Map<Integer, String> hobbies) {
		super();
		this.empid = empid;
		this.skills = skills;
		this.softskills = softskills;
		this.hobbies = hobbies;
	}

	public Employee(int empid, List<String> skills, Set<String> softskills, Map<Integer, String> hobbies,
			Address address) {
		super();
		this.empid = empid;
		this.skills = skills;
		this.softskills = softskills;
		this.hobbies = hobbies;
		this.address = address;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}
	public Map<Integer, String> getHobbies() {
		return hobbies;
	}


	public void setHobbies(Map<Integer, String> hobbies) {
		this.hobbies = hobbies;
	}


	public Employee(int empid, List<String> skills, Set<String> softSkills) {
		super();
		this.empid = empid;
		this.skills = skills;
		softskills = softSkills;
	}


	public Set<String> getSoftskills() {
		return softskills;
	}


	public void setSoftskills(Set<String> softskills) {
		this.softskills = softskills;
	}


	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", skills=" + skills + ", softskills=" + softskills + ", hobbies=" + hobbies
				+ ", address=" + address + "]";
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public List<String> getSkills() {
		return skills;
	}

	public Employee(int empid, List<String> skills) {
		super();
		this.empid = empid;
		this.skills = skills;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
}
