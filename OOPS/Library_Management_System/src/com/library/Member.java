package com.library;

import java.util.ArrayList;

public class Member {
	
	private int memberId;
	
	private ArrayList<Integer> borrowedbooks = new ArrayList<>();

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public ArrayList<Integer> getBorrowedbooks() {
		return borrowedbooks;
	}

	public void setBorrowedbooks(ArrayList<Integer> borrowedbooks) {
		this.borrowedbooks = borrowedbooks;
	}

}
