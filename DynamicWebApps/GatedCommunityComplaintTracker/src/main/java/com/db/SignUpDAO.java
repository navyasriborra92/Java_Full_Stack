package com.db;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;

import com.constants.Constants;
import com.model.CommunityUser;
import com.model.ResidentDetails;
import com.util.HibernateUtil;

public class SignUpDAO {
	
	
	public void saveResident(ResidentDetails residentDetails) {

	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	Session session = sessionFactory.openSession();
	session.beginTransaction();
	List<ResidentDetails> residentList = new ArrayList<ResidentDetails>();
	residentList.add(residentDetails);
	for(ResidentDetails r : residentList) {
		session.persist(r);
		}
	session.getTransaction().commit();
	}
	
	public boolean ValidateUser(String username, String password) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();

		NativeQuery<ResidentDetails> user = session.createNativeQuery(Constants.GET_ALL_USERS, ResidentDetails.class)
				.setParameter(1, username)
				.setParameter(2, password);
		ResidentDetails uniqueResult = user.uniqueResult();
		System.out.println(uniqueResult);		
		if(uniqueResult!= null && uniqueResult.getResidentusername().equals(username)
				&& uniqueResult.getPassword().equals(password)){
			System.out.println("in if");
			return true;			
		}
				
		return false;		
		
	}
	
	public ResidentDetails getResident(String username, String password) {

	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	Session session = sessionFactory.openSession();

	NativeQuery<ResidentDetails> user = session.createNativeQuery(Constants.GET_ALL_USERS, ResidentDetails.class)
			.setParameter(1, username)
			.setParameter(2, password);
	ResidentDetails uniqueResult = user.uniqueResult();
	return uniqueResult;
	}

}
