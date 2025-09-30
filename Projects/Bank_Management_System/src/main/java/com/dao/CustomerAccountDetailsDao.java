package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.SelectionQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.model.CustomerAccountDetails;

import jakarta.transaction.Transactional;

@Component("cdao")
@Transactional
public class CustomerAccountDetailsDao {
	
	@Autowired
	SessionFactory sessionFactory;
	
	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	public CustomerAccountDetails getCustomerDetails(long accountNumber) {
		Session session = getSession();
		
		NativeQuery<CustomerAccountDetails> nativeQuery = session.createNativeQuery("select c1_0.accountNumber,cad1_0.id,cad1_0.address,cad1_0.contactNo,cad1_0.dateOfBirth,cad1_0.email,cad1_0.firstname,cad1_0.lastName,c1_0.password,c1_0.registered from customer c1_0 "
			+ "left join Customer_AccountDetails cad1_0 on c1_0.accountNumber=cad1_0.accountNumber where c1_0.accountNumber=?", CustomerAccountDetails.class);
		nativeQuery.setParameter(1, accountNumber);
		CustomerAccountDetails singleResult = nativeQuery.getSingleResult();
		return singleResult;
	}
}
