package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMap_Sorting_Using_TreeMap_02 {

	public static void main(String[] args) {
		
		HashMap<String, String> hashMap = new HashMap<String, String>();
		hashMap.put("Egg", "X");
		hashMap.put("Apple", "Z");
		hashMap.put("Doll", "Q");
		hashMap.put("Baby", "P");
		hashMap.put("Cat", "Y");
		
		System.out.println("Before sorting: " + hashMap);
		
		Map <String, String> map = new TreeMap <String, String> (hashMap);
		
		System.out.println("After sorting: " + map);
	}

}
