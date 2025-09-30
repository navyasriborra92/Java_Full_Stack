package com.bubblesort;

public class Test {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Address a = new Address("3456788");
		Employee emp = new Employee(1, "dghscjd",a);
		System.out.println(emp);
		Employee clone = (Employee) emp.clone();
		System.out.println(clone);
		emp.name = "XYZ";
		emp.address.pincode ="45678";
		System.out.println(emp);
		System.out.println(clone);
		
	}

}
