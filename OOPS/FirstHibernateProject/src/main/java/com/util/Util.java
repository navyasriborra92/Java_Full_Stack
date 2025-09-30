package com.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Employees;

public class Util {
	
	private static SessionFactory sessionFactory = null;
	
	public static SessionFactory getSessionFactory() {
		
		if(sessionFactory == null) {
		Configuration cfg = new Configuration();
		
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employees.class);
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		
			return sessionFactory;
		
		}
		return sessionFactory;
		
	}

}
