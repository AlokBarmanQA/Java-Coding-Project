package com.collections.coding.test;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMap_Sorting_Using_TreeMap_EntrySet_02 {

	public static void main(String[] args) {
		
		HashMap<String, String> hashMap = new HashMap<String, String>();
		hashMap.put("Egg", "X");
		hashMap.put("Apple", "Z");
		hashMap.put("Doll", "Q");
		hashMap.put("Baby", "P");
		hashMap.put("Cat", "Y");
		
		System.out.println("Before sorting: " + hashMap);
		
		for (Map.Entry<String, String> entry : hashMap.entrySet()) {
			System.out.print(entry.getKey() + " ,");
		}
		System.out.println();
		Map <String, String> map = new TreeMap <String, String> (hashMap);
		
		System.out.println("After sorting: " + map);
		
		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.print(entry.getKey() + " ,");
		}
	}

}
