package com.model;

public class Address {
	
	private int doorno;
	
	public int getDoorno() {
		return doorno;
	}

	public void setDoorno(int doorno) {
		this.doorno = doorno;
	}

	private int pincode;

	public Address(int doorno, int pincode) {
		super();
		this.doorno = doorno;
		this.pincode = pincode;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [doorno=" + doorno + ", pincode=" + pincode + "]";
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
