package com.collections.coding.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class HashSet_String_Sorting_Using_SortedSet {

	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList("J", "S", "C","B" ));
		
		Set<String> hashSet = new HashSet<String>(arrayList);
		
		System.out.println("Before sorting HashSet: " + hashSet);
		
		SortedSet<String> sortedSet = new TreeSet<String>(arrayList);
		System.out.println("After sorting using SortedSet: " + sortedSet);
		
		Set<String> treeSet = new TreeSet<String>(arrayList);
		System.out.println("After sorting using TreeSet: " + treeSet);
	}

}
