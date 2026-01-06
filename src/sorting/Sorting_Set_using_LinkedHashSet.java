package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Sorting_Set_using_LinkedHashSet {

	public static void main(String[] args) {
		Integer arr[] = {9,2,3,4,6,8,6,6,8,8,8};
		HashSet<Integer> set = new HashSet<>(Arrays.asList(arr));
		System.out.println("Set in natural ascending order: " + set);
		
		ArrayList<Integer> list = new ArrayList<>(set);
		System.out.println(list);
		
		Collections.sort(list, Collections.reverseOrder());
		System.out.println("List in descending order: " + list);
		
		Set<Integer>hashset = new LinkedHashSet<>(list);
		System.out.println(hashset);
	}

}
