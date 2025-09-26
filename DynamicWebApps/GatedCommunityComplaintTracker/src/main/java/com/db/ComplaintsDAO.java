package com.db;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;

import com.constants.Constants;
import com.model.Complaints;
import com.model.ResidentDetails;
import com.util.HibernateUtil;

public class ComplaintsDAO {
	
	public void saveComplaints(Complaints complaints) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		// Fetch the resident from DB (persistent entity)
		ResidentDetails resident = session.get(ResidentDetails.class, residentId);
		List<Complaints> complaintsList = new ArrayList<Complaints>();
		complaintsList.add(complaints);
		for(Complaints c: complaintsList) {
			session.persist(c);
		}
		session.getTransaction().commit();
		
	}
	
	public List<Complaints> getResidentComplaints(String username) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		NativeQuery<Complaints> nativeQuery = session.createNativeQuery(Constants.GET_RESIDENT_COMPLAINTS, Complaints.class)
				.setParameter(1, username);
		List<Complaints> list = nativeQuery.list();
		return list;
		
	}

}
