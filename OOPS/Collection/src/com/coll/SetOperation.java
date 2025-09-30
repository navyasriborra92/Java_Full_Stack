package com.coll;

import java.util.HashSet;
import java.util.Iterator;

public class SetOperation {
	
	public static void main(String[] args) {
		HashSet<Integer> nums = new HashSet<Integer>();
		nums.add(10);
		nums.add(15);
		nums.add(20);
		nums.add(20);
		System.out.println(nums);
		
		for(Integer num : nums) {
			System.out.println(num);
		}
		
		Iterator<Integer> iterator = nums.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
