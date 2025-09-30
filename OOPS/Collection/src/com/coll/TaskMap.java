package com.coll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TaskMap {
	public static void main(String[] args) {
		HashMap<Character, Integer> result = new HashMap<Character,Integer>();
		ArrayList<Character> chars = new ArrayList<Character>();
		chars.add('A');
		chars.add('B');
		chars.add('C');
		chars.add('D');
		chars.add('A');
		chars.add('E');
		chars.add('F');
		chars.add('E');
		chars.add('A');
		chars.add('G');

		for(Character c : chars) {
		
		if(!result.containsKey(c)) {
			result.put(c, 1);
			}
		else {
			int count = result.get(c);
			result.put(c, count+1);			
			}
		}
		System.out.println(result);
	}
}
