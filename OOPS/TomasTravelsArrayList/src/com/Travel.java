package com;

import java.util.ArrayList;
import java.util.List;

public class Travel {
		
	public boolean isCarDriver(Driver driver1) {
//		if(driver1.getCategory().equalsIgnoreCase("CAR")) {
//				return true;
//		}
		return driver1.getCategory().equalsIgnoreCase("CAR");
	}
	
	public String retrieveByDriverId(ArrayList<Driver> driver, int driverId) {
//		for(Driver d: driver) {
//			if(d.getDriverId()== driverId)
//			{
//				return "Driver name is "+ d.getDriverName()+ " Belonging to the category " + d.getCategory()+ " traveled \n"
//						+ d.getTotalDistance()+ " KM so far.";
//				}
//			}
//		return "Driver not matched"; 
		
		return driver
				.stream()
				.filter(d -> d.getDriverId() == driverId)
				.findFirst()
				.map(d -> String.format("Driver name is %s Belonging to the category %s  traveled s %d KM so far.", d.getDriverName(), d.getCategory(),d.getTotalDistance()))
				.orElse("Driver not matched");
	}
	
	
	public long retrieveCountOfDriver(ArrayList<Driver> driver, String category) {
//		int count = 0;
//		for(Driver d : driver) {
//			if(d.getCategory().toLowerCase().equals(category)) {
//				count++;
//			}
//		}
//		return count;
		
		return driver
				.stream()
				.filter(d -> d.getCategory().equalsIgnoreCase(category))
				.count();
	}
	
	public List<Driver> retrieveDriver(ArrayList<Driver> driver, String category){

//		ArrayList<Driver> result = new ArrayList<Driver>();
//		for(Driver d: driver) {
//			if(d.getCategory().equalsIgnoreCase(category)) {
//				result.add(d);	
//			}
//		}
//		return result;
		return driver
				.stream()
				.filter(d -> d.getCategory().equalsIgnoreCase(category))
				.toList();
		}

	
	public Driver retriveMaximumDistanceTravelledDriver(ArrayList<Driver> driver) {

//	Driver maxDistanceTravelled = driver.get(0);
//	for(Driver d: driver) {
//		if(d.getTotalDistance() > maxDistanceTravelled.getTotalDistance()) {
//			maxDistanceTravelled = d;
//		}
//	}
//	return maxDistanceTravelled;
		
		return driver
				.stream()
				.sorted((d1, d2) -> Double.compare(d2.getTotalDistance(), d1.getTotalDistance()))		
				.findFirst().get();

	}
}
