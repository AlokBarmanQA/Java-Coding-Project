package arrays;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Reverse_a_LinkedList {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>();
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println(list);
//		Collections.sort(list);
//		list.sort(Collections.reverseOrder());
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
	}

}
