package com.coll;

import java.util.HashSet;

public class SetOperation1 {
	
	public static void main(String[] args) {
		HashSet<Integer> id = new HashSet<Integer>();
		id.add(1);
		id.add(5);
		id.add(6);
		id.add(7);
		id.add(7);
		System.out.println(id);
		
		for(Integer i : id)
		{
			System.out.println(i);
		}

	}
}
