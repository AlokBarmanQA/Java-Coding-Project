package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sorting_List {

	public static void main(String[] args) {
		Integer arr[] = {2,4,6,8,6,6,8,8,8};
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(arr));
		System.out.println("Un-sorted list: " + list);
		
		Collections.sort(list);
		System.out.println("Sorted list: " + list);
		
		Collections.reverse(list);
//		Collections.sort(list, Collections.reverseOrder());
		System.out.println("Sorted in descending order: " + list);
	}

}
