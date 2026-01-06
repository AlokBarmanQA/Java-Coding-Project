package sorting;

import java.util.Arrays;
import java.util.Collections;

public class Sorting_Array {

	public static void main(String[] args) {
		Object arr[] = {2,4,6,8,6,6,8,8,8};
		System.out.println("Un-sorted array: "+Arrays.asList(arr));
		Arrays.sort(arr);
		System.out.println("Sorted array in ascending order : "+Arrays.asList(arr));
		
		Arrays.sort(arr, Collections.reverseOrder());
		
		System.out.println("Sorted array in descending order : "+Arrays.asList(arr));
		
	}

}
