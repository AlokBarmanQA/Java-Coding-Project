package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSet_String_Sorting_Using_TreeSet {

	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("Java");
		hashSet.add("Selenium");
		hashSet.add("Cucumber");
		hashSet.add("Webservice");
		System.out.println("Before sorting: " + hashSet);
		Set<String> treeSet = new TreeSet<String>(hashSet);
		System.out.println("After sorting: " + treeSet);
	}

}
