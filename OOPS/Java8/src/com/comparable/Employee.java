package com.comparable;

public class Employee {
	
	int empid;
	
	String empName;
	
	String domain;

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empName=" + empName + ", domain=" + domain + "]";
	}

	public Employee(int empid, String empName, String domain) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.domain = domain;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
