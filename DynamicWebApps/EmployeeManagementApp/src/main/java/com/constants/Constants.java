package com.constants;

public class Constants {
	
	public static final String GET_USER = "select * from users where email = ? and password =?";
	public static final String GET_ALL_EMPLOYEES = "FROM Employee";
	public static final String SAVE_EMPLOYEE = "INSERT INTO employee (name, age, email, salary, phone_number) VALUES (?, ?, ?, ?, ?)";
	public static final String DELETE_EMPLOYEE = "Delete from employee where empid = ?";
}
