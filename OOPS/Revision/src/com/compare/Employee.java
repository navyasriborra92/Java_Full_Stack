package com.compare;

import java.util.Objects;

public class Employee {
	
	int id;
	
	String name;
	
	String skill;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, String skill) {
		super();
		this.id = id;
		this.name = name;
		this.skill = skill;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, skill);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id && Objects.equals(name, other.name) && Objects.equals(skill, other.skill);
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", skill=" + skill + "]";
	}
	
	

}
