package com;

public class Travel {
		
	public boolean isCarDriver(Driver driver1) {
		if(driver1.getCategory().toLowerCase().equals("car")) {
				return true;
		}
		return false;
	}
	
	public String retrievevyDriverId(Driver[] driver, int driverId) {
		for(Driver d: driver) {
			if(d.getDriverId()== driverId)
			{
				return "Driver name is "+ d.getDriverName()+ " Belonging to the category " + d.getCategory()+ " traveled \n"
						+ d.getTotalDistance()+ " KM so far.";
				}
			}
		return null; 
	}
	
	public int retrieveCountOfDriver(Driver[] driver, String category) {
		int count = 0;
		for(Driver d : driver) {
			if(d.getCategory().toLowerCase().equals(category)) {
				count++;
			}
		}
		return count;
	}
	
	public Driver[] retrieveDriver(Driver[] driver, String category){
		Driver[] driverlist = new Driver[driver.length];
		int ind =0;
		for(Driver d: driver) {
			if(d.getCategory().equalsIgnoreCase(category)) {
				driverlist[ind]= d;
				ind++;
				}
			}
		Driver[] result = new Driver[ind];
		for(int i=0; i<ind;i++ ) {
			result[i] = driverlist[i];
			}
		return result;
		}

	
	public Driver retriveMaximumDistanceTravelledDriver(Driver[] driver) {
		Driver[] temp = new Driver[1];
		for(int i =0; i<driver.length ;i++) {
			for(int j = 1;j<driver.length-1; j++) {
			if(driver[i].getTotalDistance() >driver[j].getTotalDistance()) {
				temp[0]= driver[i];
			}
			else {
				temp[0]=driver[j];
				}
			}
		}
		return temp[0];
	}

}
