package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Compare_Two_Array {

	public static void main(String[] args) {
		Object arr1[] = {2,4,6,8,6,6,8,8,8};
		Object arr2[] = {2,4,6,8,6,6};
		Object arr3[] = {2,4,7,9,6,7,8,9,6};
		System.out.println(compare_two_array(arr1, arr2));
		System.out.println(compare_two_array(arr1, arr3));
	}

	public static boolean compare_two_array(Object a[], Object b[]) {
		List<Object> list1 = new ArrayList<>(Arrays.asList(a));
		List<Object> list2 = new ArrayList<>(Arrays.asList(b));
		System.out.println(list1);
		System.out.println(list2);
		if(a.length != b.length) {
			System.out.println("NOT Same--Length mismatch");
			return false;
		}
		else {
			for(Object ob : list1) {
				if(!list2.contains(ob)) {
					System.out.println("NOT same");
					return false;
				}
			}
		}
		System.out.println("Both array are same");
		return true;
		/*
		 * [2, 4, 6, 8, 6, 6, 8, 8, 8]
[2, 4, 7, 9, 6, 7, 8, 9, 6]
Both array are same
true
		 */
	}
}
