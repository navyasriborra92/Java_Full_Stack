package com.coll;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class treeSet {

	public static void main(String[] args) {
		
		//set removes duplicates
		TreeSet<Integer> nums = new TreeSet<Integer>();
		nums.add(10);
		nums.add(2);
		nums.add(7);
		nums.add(10);
		nums.add(3);
		System.out.println(nums);
		
		Set<Integer> nums1 = new HashSet<Integer>();
		nums1.add(10);
		nums1.add(2);
		nums1.add(7);
		nums1.add(10);
		nums1.add(3);
		System.out.println(nums1);
		
		//sorts the values in ascending order
		Set<Integer> nums2 = new TreeSet<Integer>();
		nums2.add(10);
		nums2.add(2);
		nums2.add(7);
		nums2.add(10);
		nums2.add(3);
		System.out.println(nums2);
		
		//preserves insertion order
		Set<Integer> nums3 = new LinkedHashSet<Integer>();
		nums3.add(10);
		nums3.add(2);
		nums3.add(7);
		nums3.add(10);
		nums3.add(3);
		System.out.println(nums3);
		}
}
