package com.coll;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapOperations {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("Social", 90);
		map.put("Science", 99);
		map.put("maths", 100);
		map.put("Social", 94);
		System.out.println(map);
		
		HashMap<String,Integer> map1 = new HashMap<String,Integer>();
		map1.put("Social", 90);
		map1.put("Science", 99);
		map1.put("maths", 100);
		map1.put("Maths", 100);
		map1.put("Science", 100);
		map1.put("Hindi", null);
		map1.put("comp", null);
		map1.put(null, 10);
		map1.put(null, null);
		
		System.out.println(map1);
		
		TreeMap<String,Integer> map2 = new TreeMap<String,Integer>();
		map2.put("Social", 90);
		map2.put("Science", 99);
		map2.put("maths", 100);
		map2.put("Maths", 100);
		map2.put("Science", 100);
		map2.put("Hindi", null);
		map2.put("comp", null);
//		map2.put(null, 10);
//		map2.put(null, null);
		
		System.out.println(map2);
		
		LinkedHashMap<String,Integer> map3 = new LinkedHashMap<String,Integer>();
		map3.put("Social", 90);
		map3.put("Science", 99);
		map3.put("maths", 100);
		map3.put("Maths", 100);
		map3.put("Science", 100);
		map3.put("Hindi", null);
		map3.put("comp", null);
		map3.put(null, 10);
		map3.put(null, null);
		
		System.out.println(map3);
		
		System.out.println(map1.get("Social"));
		System.out.println(map1.containsKey("Science"));
		System.out.println(map1.remove("Science"));
		System.out.println(map1);
		
		System.out.println(map1.keySet());
		Collection<Integer> values = map1.values();
		System.out.println(values);
		
		Set<String> subjects = map1.keySet();
		System.out.println(subjects);
		
		for(Entry<String, Integer> entry : map1.entrySet()){
			System.out.println(entry);
		}
		System.out.println("--------------------");

		for(Entry<String, Integer> entry : map1.entrySet()){
			System.out.println(entry.getKey() + " :" + entry.getValue());
		}
		System.out.println("-------KeySet----------");
		for(String key : map1.keySet()) {
			System.out.println(key +":" + map.get(key));
		}
		
		
		Driver d1 = new Driver(1, "xxxx", 890.8);
		Driver d2 = new Driver(2, "yyyy", 790.8);
		Driver d3 = new Driver(3, "zzzz", 850.8);
		Driver d4 = new Driver(1, "xxxx", 890.8);
		
		HashMap<Integer, Driver> drivers = new HashMap<Integer, Driver>();
		drivers.put(d1.getId(), d1);
		drivers.put(d2.getId(),d2);
		drivers.put(d3.getId(), d3);
		drivers.put(d4.getId(), d4);
		//Hashcode and equals is overriden and therefore the hashcode of the object is equal so duplicates are not printed
		HashMap<Driver, Integer> drivers1 = new HashMap<Driver,Integer>();
		drivers1.put(d1, d1.getId());
		drivers1.put(d2, d2.getId());
		drivers1.put(d3, d3.getId());
		drivers1.put(d4, d4.getId());
		System.out.println(drivers);
		System.out.println(drivers);
	}
}

class Driver{
	int id;
	String name;
	double distanceTravelled;
	public Driver() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Driver(int id, String name, double distanceTravelled) {
		super();
		this.id = id;
		this.name = name;
		this.distanceTravelled = distanceTravelled;
	}
	@Override
	public String toString() {
		return "Driver [id=" + id + ", name=" + name + ", distanceTravelled=" + distanceTravelled + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getDistanceTravelled() {
		return distanceTravelled;
	}
	public void setDistanceTravelled(double distanceTravelled) {
		this.distanceTravelled = distanceTravelled;
	}
}
