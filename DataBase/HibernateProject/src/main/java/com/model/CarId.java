package com.model;

import java.util.Objects;

import jakarta.persistence.Embeddable;

@Embeddable
public class CarId {
	
	private int id;
	
	private int engineNumber;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEngineNumber() {
		return engineNumber;
	}

	public void setEngineNumber(int engineNumber) {
		this.engineNumber = engineNumber;
	}

	public CarId(int id, int engineNumber) {
		super();
		this.id = id;
		this.engineNumber = engineNumber;
	}

	@Override
	public int hashCode() {
		return Objects.hash(engineNumber, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CarId other = (CarId) obj;
		return engineNumber == other.engineNumber && id == other.id;
	}

	public CarId() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "CarId [id=" + id + ", engineNumber=" + engineNumber + "]";
	}
	

}
