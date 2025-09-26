package com.mappings;

import com.model.Course;
import com.model.Trainee;
import com.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.ArrayList;
import java.util.List;

public class ManyToMany {
	static String s = "ab";
	public static void main(String[] args) {
		SessionFactory sessionfactory = HibernateUtil.getSessionfactory();
		Session session = sessionfactory.openSession();
		String x = "a" + "b";
		System.out.println(x ==s);

		String s1 = "hello";

		String s2 = "hello";
		System.out.println(s1==s2);

		int i =10;
		String a = null;
		switch (s){
			case "A" : System.out.println(i++);
				System.out.println(i);
			break;
			default:
				System.out.println(i++);
				System.out.println(i);
		}


		
//		insert(session);
		select(session);
		
	}

	private static void select(Session session) {
		Trainee trainee = session.find(Trainee.class, 1);
		System.out.println(trainee);
		System.out.println(trainee.getCourses());
	}

	private static void insert(Session session) {
		session.beginTransaction();
		List<Trainee> trainees1 = new ArrayList<Trainee>();
		List<Trainee> trainees2 = new ArrayList<Trainee>();
		List<Course> courses = new ArrayList<Course>();
		List<Course> courses1 = new ArrayList<Course>();
		Trainee trainee1 = new Trainee("Navya");
		Trainee trainee2 = new Trainee("Sri");
		Trainee trainee3 = new Trainee("Navy");
		Trainee trainee4 = new Trainee("NavSri");
		
		
		trainees1.add(trainee1);
		trainees1.add(trainee2);
		
		trainees2.add(trainee3);
		trainees1.add(trainee4);
		Course course1 = new Course("JFS");
		Course course2 = new Course("AI");
		Course course3 = new Course("DS");
		
		courses.add(course1);
		courses.add(course2);
		
		courses1.add(course3);
		
		trainee1.setCourses(courses);
		trainee2.setCourses(courses);
		
		trainee3.setCourses(courses1);
		
		course1.setTrainees(trainees1);
		course2.setTrainees(trainees1);
		
		course3.setTrainees(trainees2);
		
		session.persist(trainee1);
		session.persist(trainee2);
		session.persist(trainee3);
		session.persist(trainee4);
		
		session.getTransaction().commit();
	}

}
