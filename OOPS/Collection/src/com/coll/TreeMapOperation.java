package com.coll;

import java.util.TreeMap;

public class TreeMapOperation {
	
	public static void main(String[] args) {
		TreeMap<String, Integer> marks = new TreeMap<String, Integer>();
		marks.put("Maths", 100);
		marks.put("Science", 100);
		marks.put("Social", 100);
		marks.put("English", 100);
		marks.put("Telugu", null);
		System.out.println(marks);
	}

}
