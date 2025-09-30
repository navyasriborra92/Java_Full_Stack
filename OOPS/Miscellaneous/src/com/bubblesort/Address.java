package com.bubblesort;

import java.util.Objects;

public class Address {
	
	String  pincode;

	@Override
	public String toString() {
		return "Address [pincode=" + pincode + "]";
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(String pincode) {
		super();
		this.pincode = pincode;
	}

	@Override
	public int hashCode() {
		return Objects.hash(pincode);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		return Objects.equals(pincode, other.pincode);
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

}
