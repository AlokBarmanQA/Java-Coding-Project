package com.collections.coding.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Array_List_Integer_Sorting {

	public static void main(String[] args) {
		ArrayList<Integer>arrayList = new ArrayList<Integer>(Arrays.asList(6,9,7,8,10));
		System.out.println("Before sorting: "+ arrayList);
		Collections.sort(arrayList);
		System.out.println("After sorting: "+arrayList);
	}

}
