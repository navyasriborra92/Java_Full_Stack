package com.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.CommunityUser;
import com.model.Complaints;
import com.model.ResidentDetails;

public class HibernateUtil {
	
	private static SessionFactory sessionFactory  = null;
	
	public static SessionFactory getSessionFactory() {
		
		if(sessionFactory == null) {
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			cfg.addAnnotatedClass(ResidentDetails.class);
			cfg.addAnnotatedClass(CommunityUser.class);
			cfg.addAnnotatedClass(Complaints.class);
			sessionFactory = cfg.buildSessionFactory();
			return sessionFactory;
		}
		return sessionFactory;
		
	}

}
