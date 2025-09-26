package com.mappings;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.model.Order;
import com.model.Person;
import com.util.HibernateUtil;

public class OneToMany {
	
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionfactory();
		Session session = sessionFactory.openSession();
		
//		insert(session);
//		select(session);
		update(session);
			
		
	}

	private static void update(Session session) {
		session.beginTransaction();
		Person person = session.find(Person.class, 1);
		person.setName("Sri");
		List<Order> orders = person.getOrders();
		Order order = orders.get(0);
		order.setQuantity(2);
		session.merge(person);
		session.getTransaction().commit();
	}

	private static void select(Session session) {
		Person person = session.find(Person.class, 1);
		System.out.println(person);
//		System.out.println(person.getOrders());
	}

	private static void insert(Session session) {
		Person person = new Person("Navya", "88888");
		Order order = new Order(1234, "Laptop", 1);
		Order order2 = new Order(12345, "mobile", 1);
		order.setPerson(person);
		order2.setPerson(person);
		
		List<Order> allorders = new ArrayList<Order>();
		allorders.add(order);
		allorders.add(order2);
		
		person.setOrders(allorders);
		
		session.beginTransaction();
		
		session.persist(person);
		session.getTransaction().commit();
	}

}
