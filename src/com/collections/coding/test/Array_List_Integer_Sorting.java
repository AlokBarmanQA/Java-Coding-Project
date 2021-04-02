package com.collections.coding.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Array_List_Integer_Sorting {

	public static void main(String[] args) {
		List<Integer> arrayIntegers = new ArrayList<>(Arrays.asList(1,2,3));

		arrayIntegers.get(1);
		Integer [] ia = {1,2,3,4};
		System.out.println("Array : "+Arrays.toString(ia));
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(ia));  // new ArrayList object is created , no connection between existing Array Object
		list1.add(5);
		list1.add(6);
		list1.remove(0);
		list1.remove(0);
		System.out.println("list1 : "+list1);
		System.out.println("Array : "+Arrays.toString(ia));
		ArrayList<String> arrayList=new ArrayList<String>(Arrays.asList("One","Two","Three"));
//		ArrayList<Integer>arrayList = Arrays.asList({6,9,7,8,10});
		System.out.println("Before sorting: "+ arrayList);
		Collections.sort(arrayList);
		System.out.println("After sorting: "+arrayList);
	}

}
