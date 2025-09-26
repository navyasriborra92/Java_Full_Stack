package com.db;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.NativeQuery;

import com.constants.Constants;
import com.model.Employee;
import com.util.HibernateUtil;

public class EmployeeDAO {
	
	public List<Employee> getAllEmployees() {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		List<Employee> emp = session.createQuery(Constants.GET_ALL_EMPLOYEES, Employee.class).list();

		session.getTransaction().commit();
		return emp;
		
	}
	
	public void addEmployee(Employee emp) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		MutationQuery nativeMutationQuery = session.createNativeMutationQuery(Constants.SAVE_EMPLOYEE)
				.setParameter(1, emp.getName())
				.setParameter(2, emp.getAge())
				.setParameter(3, emp.getEmail())
				.setParameter(4, emp.getSalary())
				.setParameter(5, emp.getPhone_number());
		nativeMutationQuery.executeUpdate();
		session.getTransaction().commit();
	}
	
	public void deleteEmployee(int empid) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		MutationQuery nativeMutationQuery = session.createNativeMutationQuery(Constants.DELETE_EMPLOYEE)
				.setParameter(1, empid);
		nativeMutationQuery.executeUpdate();
		session.getTransaction().commit();
	}

}
