package com;

public class Driver {
	
	private int driverId;
	
	private String category;
	
	private String driverName;
	
	private double totalDistance;

	public Driver(int driverId, String category, String driverName, double totalDistance) {
		super();
		this.driverId = driverId;
		this.category = category;
		this.driverName = driverName;
		this.totalDistance = totalDistance;
	}

	public Driver() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getDriverId() {
		return driverId;
	}

	@Override
	public String toString() {
		return "Driver [driverId=" + driverId + ", category=" + category + ", driverName=" + driverName
				+ ", totalDistance=" + totalDistance + "]";
	}

	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public double getTotalDistance() {
		return totalDistance;
	}

	public void setTotalDistance(double totalDistance) {
		this.totalDistance = totalDistance;
	}
	

}
