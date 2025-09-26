package com.hql;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.SelectionQuery;

import com.model.Student;
import com.util.HibernateUtil;

import jakarta.persistence.Query;

public class HQL {
	
	public static void main(String[] args) {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionfactory();
		
		Session session = sessionFactory.openSession();
//		CRUD Operations
//		select(session);
//		selectWithWhere(session);
//		insert(session);
//		update(session);
//		delete(session);
		
	}

	private static void delete(Session session) {
		session.beginTransaction();
		MutationQuery mutationQuery = session.createMutationQuery("delete from Student where studentId =?1");
		mutationQuery.setParameter(1, 1);
		mutationQuery.executeUpdate();
		session.getTransaction().commit();
	}

	private static void update(Session session) {
		session.beginTransaction();
		MutationQuery mutationQuery = session.createMutationQuery("update Student set marks =?1 where studentId =?2");
		mutationQuery.setParameter(1,99);
		mutationQuery.setParameter(2, 1);
		mutationQuery.executeUpdate();
		session.getTransaction().commit();
	}

	private static void insert(Session session) {
		session.beginTransaction();
		
		MutationQuery mutationQuery = session.createMutationQuery("Insert into Student(name,marks) values(?1,?2)");
//		mutationQuery.setParameter(1, 11);
		mutationQuery.setParameter(1, "sri");
		mutationQuery.setParameter(2, 100);
		
		mutationQuery.executeUpdate();
		
		session.getTransaction().commit();
	}

	private static void select(Session session) {
		SelectionQuery<Student> query = session.createSelectionQuery("from Student where studentId=?1 and name = ?2", Student.class);
		query.setParameter(1, 10);
		query.setParameter(2, "nav");
		List<Student> list = query.list();
		System.out.println(list);
	}

	private static void selectWithWhere(Session session) {
		SelectionQuery<Student> selectionQuery = session.createSelectionQuery("Select s From Student s", Student.class);
//		SelectionQuery<Student> selectionQuery = session.createSelectionQuery("From Student s", Student.class);
		List<Student> list = selectionQuery.list();
		System.out.println(list);
	}

}
