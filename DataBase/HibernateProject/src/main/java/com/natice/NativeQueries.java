package com.natice;

import com.model.Student;
import com.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.NativeQuery;

import java.util.List;

public class NativeQueries {
	
	public static void main(String[] args) {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionfactory();
		
		Session session = sessionFactory.openSession();
//		select(session);		
//		selectWithWhere(session);
//		insert(session);
		update(session);
		

		
	}

	private static void update(Session session) {
		//		DML
				session.beginTransaction();
				MutationQuery nativeMutationQuery = session.createNativeMutationQuery("Update Student set name = ?1, marks = ?2 where studentId = ?3");
				nativeMutationQuery.setParameter(1, "vbghhjh");
				nativeMutationQuery.setParameter(2, 100);
				nativeMutationQuery.setParameter(3, 14);
				nativeMutationQuery.executeUpdate();
				session.getTransaction().commit();
	}

	private static void insert(Session session) {
		//		DML
				session.beginTransaction();
				MutationQuery nativeMutationQuery = session.createNativeMutationQuery("Insert into Student(name,marks) values(?1,?2)");
				nativeMutationQuery.setParameter(1, "rrdfgcv");
				nativeMutationQuery.setParameter(2, 100);
				nativeMutationQuery.executeUpdate();
				session.getTransaction().commit();
	}

	private static void selectWithWhere(Session session) {
		//DQl
				NativeQuery<Student> nativeQuery = session.createNativeQuery("Select * from Student where studentId = 11", Student.class);
				List<Student> list = nativeQuery.list();
				System.out.println(list);
	}

	private static void select(Session session) {
		//DQl
		NativeQuery<Student> nativeQuery = session.createNativeQuery("Select * from Student", Student.class);
		List<Student> list = nativeQuery.list();
		System.out.println(list);
	}

}
