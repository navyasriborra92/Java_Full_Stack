package com.coll;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class hashSetOperation {
	public static void main(String[] args) {
		Set<Students> emp = new HashSet();
		emp.add(new Students(1,"a"));
		emp.add(new Students(1,"b"));
		emp.add(new Students(7,"c"));
		emp.add(new Students(9,"d"));
		emp.add(new Students(5,"e"));
		emp.add(new Students(7,"f"));
		System.out.println(emp);
		
		Set<Students> emps = new HashSet();
		Students s1 = new Students(1,"a");
		Students s2 = new Students(2,"n");
		Students s3 = new Students(3,"a");
		Students s4 = new Students(12,"i");
		Students s5 = new Students(12,"i");
		Students s6 = new Students(12,"i");
		emps.add(s1);
		emps.add(s2);
		emps.add(s3);
		emps.add(s4);
		emps.add(s5);
		emps.add(s6);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(emps);
		
		
		//Treeset does not sort custom class to overcome we use comparable & comparator
//		Set<Students> emp1 = new TreeSet();
//		emp1.add(new Students(1,"a"));
//		emp1.add(new Students(1,"b"));
//		emp1.add(new Students(7,"c"));
//		emp1.add(new Students(9,"d"));
//		emp1.add(new Students(5,"e"));
//		emp1.add(new Students(7,"f"));
//		System.out.println(emp1);
	}

}

 class Students {
	 int id;
	 String name;
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Students other = (Students) obj;
		return id == other.id;
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
	public Students(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	 
 }
