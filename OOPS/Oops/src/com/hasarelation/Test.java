package com.hasarelation;

public class Test {
	
	public static void main(String[] args) {
		Professor p = new Professor();
		Department d = new Department();
		
		p.setName("xfghi");
		p.setExperience(10);
		p.setSubject("Java");
		
		d.setCountOfStudents(1000);
		d.setName("CSE");
		d.setProfessor(p);
		
		Department d2 = new Department();
		d2.setCountOfStudents(1000);
		d2.setName("IT");
		d2.setProfessor(new Professor("vbebfe","Python", 10));
		
		Department d3 = new Department("MECH",1000, new Professor("hjsbfhe", "Mechanics",23));
		
		System.out.println(d);
		System.out.println(d2);
		System.out.println(d3);
		
	}

}
