package com.comparable;

import java.util.Comparator;

public class IdComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee emp1, Employee emp2) {
		// TODO Auto-generated method stub
		return Integer.compare(emp1.empid, emp2.empid);
	}
	
	

}
