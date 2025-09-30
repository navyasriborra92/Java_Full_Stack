package com.test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.model.Employee;

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext ctxt = new ClassPathXmlApplicationContext("beans.xml");
		JdbcTemplate template = ctxt.getBean("jdbcTemplate", JdbcTemplate.class);
//		template.update("insert into users values(?,?)","a@gmail.com", "abc");
//		template.update("update users set email = ? where email = ? ","b@gmail.com","a@gmail.com");
		template.update("delete from users where email = ?", "b@gmail.com");
		
		//Row Mapper
		Employee employee = template.queryForObject("Select * from Employee where empid = ?", new RowMapper<Employee>(){

			@Override
			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				return new Employee(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getDouble(5), rs.getString(6));
			}
			
		}, 13);
		
		System.out.println(employee);
		
		List<Employee> employeelist = template.query("Select * from Employee", new RowMapper<Employee>(){

			@Override
			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				return new Employee(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getDouble(5), rs.getString(6));
			}
			
		});
		
		System.out.println(employeelist);
		
		Employee emp = template.queryForObject("Select * from Employee where empid = ?", (rs, rownum) -> 
		new Employee(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getDouble(5), rs.getString(6)), 11);
		System.out.println(emp);
		
		List<Employee> emp1 = template.query("Select * from Employee", (rs, rownum) -> 
		new Employee(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getDouble(5), rs.getString(6)));
		System.out.println(emp1);
	}

}
