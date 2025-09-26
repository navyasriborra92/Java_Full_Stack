package com.db;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;

import com.constants.Constants;
import com.model.User;
import com.util.HibernateUtil;

public class DBConnection {
	

	public void saveUser(User user) throws ClassNotFoundException, SQLException {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();				
		List<User> userList = new ArrayList<User>();
		userList.add(user);
		session.beginTransaction();
		for (User u : userList) {
		    session.persist(u); 
		}								
		session.getTransaction().commit();

	}
	
	public boolean validateUser(User user) throws ClassNotFoundException, SQLException {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		NativeQuery<User> nativeQuery = session.createNativeQuery(Constants.GET_USER, User.class)
				.setParameter(1, user.getEmail())
				.setParameter(2, user.getPassword());
		List<User> list = nativeQuery.list();
		
		while(list.isEmpty()) {
			return false;
		}
		return true;
	}

}
