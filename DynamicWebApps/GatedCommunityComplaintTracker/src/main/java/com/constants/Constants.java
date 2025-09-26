package com.constants;

public class Constants {
	
	public static final String GET_ALL_USERS = "select * from ResidentDetails where residentusername = ? and password = ?";
	public static final String GET_RESIDENT_COMPLAINTS = "select * from Complaints where username = ?";

}
