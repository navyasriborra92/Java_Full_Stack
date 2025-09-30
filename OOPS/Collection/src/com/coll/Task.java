package com.coll;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Task {
	public static void main(String[] args) {
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
		
		
		for(int i = 0; i<chars.size();i++) {
			int count =1;
			for(int j =i+1; j<chars.size();j++) {			
				if(chars.get(i).equals(chars.get(j))) {				
					chars.remove(j);
					count++;
					
				}
			}
			System.out.println(chars.get(i)+ "-" + count);
		}

	}

}
