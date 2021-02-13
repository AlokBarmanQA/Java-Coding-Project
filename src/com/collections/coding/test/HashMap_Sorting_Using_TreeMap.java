package com.collections.coding.test;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMap_Sorting_Using_TreeMap {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(101, "Z");
		hashMap.put(505, "M");
		hashMap.put(302, "A");
		hashMap.put(104, "P");
		hashMap.put(203, "D");
		
		System.out.println("Before sorting: " + hashMap);
		
		Map <Integer, String> map = new TreeMap <Integer, String> (hashMap);
		
		System.out.println("After sorting: " + map);
	}

}
