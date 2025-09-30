package com.coll;

import java.util.ArrayList;

public class RemoveDuplicates {
	
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(1);
		arr.add(3);
		arr.add(4);
		arr.add(4);
		arr.add(5);
		
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		
		for(int i =0; i<=arr.size(); i++) {
			for(int j =i+1; j<arr.size(); j++)
			if(arr.get(i) ==arr.get(j)) {
				arr.remove(j);
			}
		}
		System.out.println(arr);
		
		for(Integer a: arr) {
			if(!arr1.contains(a)) {
				arr1.add(a);
			}
		}
		System.out.println(arr1);
		
	}

}
