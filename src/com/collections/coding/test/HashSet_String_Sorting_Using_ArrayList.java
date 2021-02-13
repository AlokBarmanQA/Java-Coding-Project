package com.collections.coding.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class HashSet_String_Sorting_Using_ArrayList {

	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("Java");
		hashSet.add("Selenium");
		hashSet.add("Cucumber");
		hashSet.add("Webservice");
		System.out.println("Before sorting: " + hashSet);
		List <String> arrayList = new ArrayList<String>(hashSet);
		Collections.sort(arrayList);
		System.out.println("After sort using ArrayList: " + arrayList);
	}

}
