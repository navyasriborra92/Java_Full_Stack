package com.mappings;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.model.Passport;
import com.model.User;
import com.util.HibernateUtil;

public class OneToOneMapping {
	
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionfactory();
		Session session = sessionFactory.openSession();
		
		
//		insert(session);
//		select(session);
//		remove(session);
//		Passport passport = session.find(Passport.class, 11); 
//		System.out.println(passport);
		
	}

	private static void remove(Session session) {
		session.beginTransaction();
		session.remove(new User(2, new Passport(11, " ")));
		session.getTransaction().commit();
	}

	private static void select(Session session) {
		User user = session.find(User.class, 11);
		System.out.println(user);
	}

	private static void insert(Session session) {
//		User user = new User("qwertr", new Passport(13, "hyd"));
		User user = new User("Navy");
		Passport passport = new Passport(21, "HYD");
		user.setPassport(passport);
		passport.setUser(user);
		
		session.beginTransaction();
		session.persist(user);
		session.getTransaction().commit();
	}

}
