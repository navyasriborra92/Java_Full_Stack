package com.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Employees;
import com.util.Util;

public class Application {
	
	public static void main(String[] args) {
	
		Application app = new Application();
		app.insertData();
		app.getData();
		app.updateData();
		app.deleteData();
	}
	
	
	public void insertData() {
		SessionFactory sessionFactory = Util.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		Employees emp = new Employees( "sdfg@gmail.com", 12343123);
		session.beginTransaction();
		//save -insert
		session.persist(emp);
		session.getTransaction().commit();
		System.out.println("Data Inserted");
	}
	public void getData() {
		SessionFactory sessionFactory = Util.getSessionFactory();
		Session session = sessionFactory.openSession();
		Employees employees = session.find(Employees.class, 1);
		
		System.out.println(employees);
		
	}
	
	public void updateData() {
		SessionFactory sessionFactory = Util.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		Employees employees = session.find(Employees.class, 1);
//		Employees emp = new Employees();
//		employees.setEmpId(1);
		employees.setSalary(40000000);
		session.beginTransaction();
		session.merge(employees);
		session.getTransaction().commit();
		
	}

	public void deleteData() {
		SessionFactory sessionFactory = Util.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		Employees employees = session.find(Employees.class, 0);
		session.beginTransaction();
		session.remove(employees);
		session.getTransaction().commit();
	}
}
