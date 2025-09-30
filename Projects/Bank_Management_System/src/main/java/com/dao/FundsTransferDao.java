package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.model.FundsTransfer;
import com.model.Otp;

import jakarta.transaction.Transactional;

@Component("fdao")
@Transactional
public class FundsTransferDao {
	
	@Autowired
	SessionFactory sessinFactory;
	
	public void saveTransferDetails(FundsTransfer fundsTransfer) {
		Session session = getSession();
		
		session.persist(fundsTransfer);
	}
	
	public Session getSession() {
		return sessinFactory.getCurrentSession();
	}

	public boolean verifyOtp(long accountNumber, int otp) {
		// TODO Auto-generated method stub
		Session session = getSession();
		NativeQuery<Otp> nativeQuery = session.createNativeQuery("Select * from Otp where customer_accountNumber=?;", Otp.class);
		nativeQuery.setParameter(1, accountNumber);
		Otp uniqueResult = nativeQuery.uniqueResult();
		if(uniqueResult.getOtp()==otp) {
			return true;
		}
		return false;
	}

	public void generateOtp(long accountNumber) {
		Session session = getSession();
		Otp otp = session.find(Otp.class, accountNumber);
		otp.generateOtp();
		session.persist(otp);
	}

}
