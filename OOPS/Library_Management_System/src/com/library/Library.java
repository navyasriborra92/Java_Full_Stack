package com.library;

import java.util.ArrayList;

public class Library {
	
	Book book;
	
	Member member;
	
	ArrayList<String> booklist = new ArrayList<>();
	ArrayList<String> members = new ArrayList<>();
	
	public void books() {
		booklist.add("Science");
		booklist.add("Maths");
		booklist.add("Social");
	}
	
	public void addMember() {
		members.add("xxxx");
		members.add("yyyy");
	}

}
