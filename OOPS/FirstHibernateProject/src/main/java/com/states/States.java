package com.states;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.model.Employees;
import com.util.Util;

public class States {
	
	public static void main(String[] args) {
		SessionFactory sessionFactory = Util.getSessionFactory();
		Employees emp = new Employees("sdbhjsk@gmail.com", 1234567890);//Transient
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.persist(emp); //persistant state
		System.out.println("data Inserted");
		session.getTransaction().commit();
		
		session.close();//detached
		
		emp.setSalary(12345678);
		System.out.println("no data updated");
		
	}

}
