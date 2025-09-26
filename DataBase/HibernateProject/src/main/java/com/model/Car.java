package com.model;

import java.util.Objects;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

@Entity
public class Car {
	
	@EmbeddedId
	private CarId carId;
	
	private String CompanyName;
	
	private double price;

	public CarId getCarId() {
		return carId;
	}

	public void setCarId(CarId carId) {
		this.carId = carId;
	}

	public String getCompanyName() {
		return CompanyName;
	}

	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(CompanyName, carId, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return Objects.equals(CompanyName, other.CompanyName) && Objects.equals(carId, other.carId)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
	}

	public Car(CarId carId, String companyName, double price) {
		super();
		this.carId = carId;
		CompanyName = companyName;
		this.price = price;
	}

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Car [carId=" + carId + ", CompanyName=" + CompanyName + ", price=" + price + "]";
	}
	
	
	
	

}
