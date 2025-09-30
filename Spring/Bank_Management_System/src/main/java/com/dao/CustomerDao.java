package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.MutationQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.model.Customer;

@Component("dao")
@Transactional
public class CustomerDao {

	@Autowired
	SessionFactory sessionFactory;
	
    public int saveUser(long accountNumber, String password) {
        Session session = sessionFactory.getCurrentSession(); 

        MutationQuery query = session.createMutationQuery(
            "update Customer set password = :password, registered =:registered where accountNumber = :accountNumber"
        );
        query.setParameter("password", password);
        query.setParameter("accountNumber", accountNumber);
        query.setParameter("registered", "registered");

        return query.executeUpdate(); // number of rows updated
    }
	
	public Customer findCustomer(long accountNumber) {
		Session session  = getSession();
		Customer customer = session.find(Customer.class, accountNumber);
		return customer;
	}
	
	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}
}
