package com.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Employee;
import com.model.User;

public class HibernateUtil {
	
	private static SessionFactory sessionFactory = null;
	
	public static SessionFactory getSessionFactory() {
	
		if(sessionFactory ==null) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");	
		cfg.addAnnotatedClass(com.model.User.class);
		cfg.addAnnotatedClass(com.model.Employee.class);
		sessionFactory = cfg.buildSessionFactory();
	return sessionFactory;
		}
	return sessionFactory;
	}	

}
