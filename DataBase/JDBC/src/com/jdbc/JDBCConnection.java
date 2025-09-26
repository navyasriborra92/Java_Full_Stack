package com.jdbc;

import java.sql.*;


public class JDBCConnection {

		public static void main(String[] args) throws ClassNotFoundException {
//			1)Register your driver(optional)
//			This is a translator  -> between java and sql
//			MySQL Connector
//			2)Establish a connection -- username and password + url
//			jdbc:mysql://localhost:3306
//			3) Create  a statement
//			4) Prepare your SQL Query
//			5) Execute
			
//			6) Close the statement and connection
			
			
			Class.forName("org.postgresql.Driver");
//			System.out.println("Driver Registered");
			
			
			String url = "jdbc:postgresql://localhost:5432/postgres";
	        String username = "postgres";
	        String password = "your_password";
	        
	        DriverManager.getConnection(url,username, password );
		
			
		}

	}

