package com.rev;

import java.util.Objects;

public class Employee {
	
	int id;
	
	String empName;
	
	long salary;
	
	public Employee() {
		super();
	}
	
	public Employee(int id, String empName, long salary) {
		this.id = id;
		this.empName = empName;
		this.salary = salary;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", empName=" + empName + ", salary=" + salary + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(empName, id, salary);
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
		return Objects.equals(empName, other.empName) && id == other.id && salary == other.salary;
	}

	

}
