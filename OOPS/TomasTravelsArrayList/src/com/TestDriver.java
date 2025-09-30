package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestDriver {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Travel travel = new Travel();
		
		ArrayList<Driver> drivers = new ArrayList<Driver>();
		drivers.add(new Driver(1,"car","XXXX",4200));
		drivers.add(new Driver(2,"auto","XXXX",1200));
		drivers.add(new Driver(3,"Lorry","XXXX",4260));
		drivers.add(new Driver(4,"Car","XXXX",200));
		drivers.add(new Driver(5,"Auto","XXXX",5400));
		drivers.add(new Driver(6,"Car","XXXX",900));
		try {
			System.out.println("Enter te index of the objet to test : ");
			int a = sc.nextInt();
			System.out.println(travel.isCarDriver(drivers.get(a)));
		System.out.println("Enter the driver id : ");
		int driverid = sc.nextInt();
		String driverInfo = travel.retrieveByDriverId(drivers, driverid);
		System.out.println(driverInfo);
		System.out.println("Enter the category : Auto/Car/Lorry");
		String category = sc.next();
		long count =travel.retrieveCountOfDriver(drivers, category);
		System.out.println(count);
		List<Driver> driv= travel.retrieveDriver(drivers, category);
		System.out.println(driv);
		Driver driverdistance = travel.retriveMaximumDistanceTravelledDriver(drivers);
		System.out.println(driverdistance);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
		sc.close();
		}
	}

}
