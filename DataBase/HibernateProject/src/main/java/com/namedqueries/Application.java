package com.namedqueries;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import com.model.Student;
import com.util.HibernateUtil;

public class Application {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionfactory();
		Session session= sessionFactory.openSession();
		
//		select(session);
		
//		update(session);
//		updatesql(session);
		NativeQuery<Student> nativeQuery = session.createNativeQuery("allsqlStudents", Student.class);
		List<Student> list = nativeQuery.list();
		System.out.println(list);
		
	}

	private static void updatesql(Session session) {
		session.beginTransaction();
		MutationQuery mutationQuery = session.createNamedMutationQuery("updatesqlStudents");
		mutationQuery.setParameter(1, 79);
		mutationQuery.setParameter(2, 5);
		mutationQuery.executeUpdate();
		session.getTransaction().commit();
	}

	private static void update(Session session) {
		session.beginTransaction();
		MutationQuery mutationQuery = session.createNamedMutationQuery("updateStudents");
		mutationQuery.setParameter(1, 89);
		mutationQuery.setParameter(2, 5);
		mutationQuery.executeUpdate();
		session.getTransaction().commit();
	}

	private static void select(Session session) {
		Query<Student> namedQuery = session.createNamedQuery("allStudents", Student.class);
		List<Student> list = namedQuery.list();
		System.out.println(list);
	}

}
