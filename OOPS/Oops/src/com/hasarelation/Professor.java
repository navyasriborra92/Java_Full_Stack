package com.hasarelation;

public class Professor {
	
	private String name;
	private String subject;
	private int experience;

	public Professor(String name, String subject, int experience) {
		this.experience = experience;
		this.name = name;
		this.subject = subject;
	}
	
	public Professor() {
		
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setName(String n) {
		this.name = n;
	}
	
	public String getSubject() {
		return this.subject;
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public int getExperience() {
		return this.experience;
	}
	
	public void setExperience(int exp) {
		this.experience = exp;
	}

	@Override
	public String toString() {
		return "Professor [name=" + name + ", subject=" + subject + ", experience=" + experience + "]";
	}

}
