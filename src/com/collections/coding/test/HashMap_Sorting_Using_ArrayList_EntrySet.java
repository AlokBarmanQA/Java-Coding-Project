package com.collections.coding.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap_Sorting_Using_ArrayList_EntrySet {

	public static void main(String[] args) {

		HashMap<String, String> hashMap = new HashMap<String, String>();
		hashMap.put("Egg", "X");
		hashMap.put("Apple", "Z");
		hashMap.put("Doll", "Q");
		hashMap.put("Baby", "P");
		hashMap.put("Cat", "Y");

		System.out.println("Before sorting: " + hashMap);

		for (Map.Entry<String, String> entry : hashMap.entrySet()) {
			System.out.println(entry.getKey() + "\t" + entry.getValue());
		}
		System.out.println("Map sorted based on key: ");
		Set <Entry <String, String>> entryset = hashMap.entrySet();

		List <Entry <String, String>> list = new ArrayList<>(entryset);

		Collections.sort(list, new Comparator<Entry <String, String>>(){
			@Override
			public int compare(Entry<String,String> o1, Entry<String,String> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
		}		
				);
		System.out.println("Sorted map: " + list);
		for (Map.Entry<String, String> entry : list) {
			System.out.println(entry.getKey() + "\t" + entry.getValue());
		}
	}

}
