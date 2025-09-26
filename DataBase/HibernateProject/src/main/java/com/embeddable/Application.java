package com.embeddable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.model.Car;
import com.model.CarId;
import com.util.HibernateUtil;

public class Application {
	
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionfactory();
		Session session = sessionFactory.openSession();
//		insert(session);
//		select(session);
		
	}

	private static void select(Session session) {
		Car car = session.find(Car.class, new CarId(1,123));
		System.out.println(car);
	}

	private static void insert(Session session) {
		session.beginTransaction();
		
		Car car = new Car(new CarId(1, 123), "BMW", 90000);
		Car car1 = new Car(new CarId(1, 111), "BMW", 90000);
		Car car2 = new Car(new CarId(2, 999), "Merc", 90000);
		session.persist(car2);
		session.getTransaction().commit();
	}

}
