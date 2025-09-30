package com.exception;

import java.util.Arrays;

public class Company {
	
	 String companyName;
	
	Employee[] employees;
	
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Employee emp1 = new Employee(123,"xxx",123.2);
		Employee emp2 = new Employee(123,"yy",123.2);
		Employee emp3 = new Employee(123,"zz",123.2);
		
		Employee[] emps = new Employee[3];
		emps[0] =emp1;
		emps[1] = emp2;
		emps[2] = emp3;
		
		Company company = new Company();
		company.companyName = "XYZ";
		company.employees = emps;
		System.out.println(company);
	}

	@Override
	public String toString() {
		return "Company [companyName=" + companyName + ", employees=" + Arrays.toString(employees) + "]";
	}

}
