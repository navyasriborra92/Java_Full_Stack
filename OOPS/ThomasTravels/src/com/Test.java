	package com;

	import java.util.Arrays;
import java.util.Scanner;

	public class Test {
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			Travel travel = new Travel();
			
			Driver driver1 = new Driver(1,"car","XXXX",4200);
			Driver driver2 = new Driver(2,"auto","XXXX",1200);
			Driver driver3 = new Driver(3,"Lorry","XXXX",4260);
			Driver driver4 = new Driver(4,"Car","XXXX",200);
			Driver driver5 = new Driver(5,"Auto","XXXX",5400);
			Driver driver6 = new Driver(6,"Car","XXXX",900);
			
			Driver[] drivers = new Driver[6];
			drivers[0] = driver1;
			drivers[1] = driver2;
			drivers[2] = driver3;
			drivers[3] = driver4;
			drivers[4] = driver5;
			drivers[5] = driver6;
			
			System.out.println(travel.isCarDriver(driver1));
			System.out.println("Enter the driver id : ");
			int driverid = sc.nextInt();
			String driverInfo = travel.retrievevyDriverId(drivers, driverid);
			System.out.println(driverInfo);
			System.out.println("Enter the category : Auto/Car/Lorry");
			String category = sc.next();
			int count =travel.retrieveCountOfDriver(drivers, category);
			System.out.println(count);
			Driver[] driv= travel.retrieveDriver(drivers, category);
			System.out.println(Arrays.toString(driv));
//			travel.retriveMaximumDistanceTravelledDriver(drivers);
			sc.close();
			}

	}

