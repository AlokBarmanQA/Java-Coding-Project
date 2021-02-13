package com.collections.coding.test;

import java.util.Arrays;

/**
 * @author alokb
 *
 */
public class Array_String_Sorting_As_List {

	public static void main(String[] args) {

		String str[] = {"Alok", "Kumar", "Barman", "Java", "Python", "Javascript", "Groovy"};
		
		System.out.println("Before sorting: "+ Arrays.toString(str));

		Arrays.sort(str);
		
		System.out.println("After sorting: " + Arrays.toString(str));
	}

}
