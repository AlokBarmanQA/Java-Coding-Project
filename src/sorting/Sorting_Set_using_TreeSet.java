package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sorting_Set_using_TreeSet {

	public static void main(String[] args) {
		Integer arr[] = {9,2,3,4,6,8,6,6,8,8,8};
		Set<Integer> set = new TreeSet<>(Arrays.asList(arr));
		System.out.println("Set in natural ascending order: " + set);
		
		ArrayList<Integer> list = new ArrayList<>(set);
		System.out.println(list);
		
		Collections.sort(list, Collections.reverseOrder());
		System.out.println("List in descending order: " + list);
		
		Set<Integer>treeset = new TreeSet<>(list);
		System.out.println(treeset);
		/// This is wrong
	}

}
