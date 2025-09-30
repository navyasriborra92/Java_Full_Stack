package com.coll;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class NullSetOperation {

	public static void main(String[] args) {
		Set<Integer> nums = new HashSet<>();
		nums.add(null);
		nums.add(null);
		nums.add(null);
		System.out.println(nums);
		
		Set<Integer> nums1 = new LinkedHashSet<>();
		nums1.add(null);
		nums1.add(null);
		nums1.add(null);
		System.out.println(nums1);
		
		
		//how many nulls are accepted
		Set<Integer> nums2 = new TreeSet<>();
		nums2.add(null);
		nums2.add(null);
		nums2.add(null);
		System.out.println(nums2);
	
	}
	
}
