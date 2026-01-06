package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Merge_Two_List {

	public static void main(String[] args) {
		Integer a[] = {1,3,5,7,9};
		Integer b[] = {2,4,6,8,10};
		List<Integer> list1 = Arrays.asList(a);
		List<Integer> list2 = Arrays.asList(b);
		List<Integer> list3 = new ArrayList<Integer>(list1);
		list3.addAll(list2);
		System.out.println(list3);
	}

}
