package com.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Passport {
	
	@Id
	private int passportId;
	
	private String issuedPlace;

	@OneToOne(mappedBy = "passport")
	private User user;
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Passport(int passportId, String issuedPlace, User user) {
		super();
		this.passportId = passportId;
		this.issuedPlace = issuedPlace;
		this.user = user;
	}

	public int getPassportId() {
		return passportId;
	}

	public void setPassportId(int passportId) {
		this.passportId = passportId;
	}

	public String getIssuedPlace() {
		return issuedPlace;
	}

	public void setIssuedPlace(String issuedPlace) {
		this.issuedPlace = issuedPlace;
	}

	@Override
	public String toString() {
		return "Passport [passportId=" + passportId + ", issuedPlace=" + issuedPlace + "]";
	}

	public Passport(int passportId, String issuedPlace) {
		super();
		this.passportId = passportId;
		this.issuedPlace = issuedPlace;
	}

	public Passport() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
