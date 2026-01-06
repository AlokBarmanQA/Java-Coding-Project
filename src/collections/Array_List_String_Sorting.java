package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Array_List_String_Sorting {

	public static void main(String[] args) {
		
		ArrayList<String>arrayList = new ArrayList<String>(Arrays.asList("Qtp","Selenium","Java","Alok","Kumar","Barman"));
		System.out.println("Before sorting: "+ arrayList);
		Collections.sort(arrayList);
		System.out.println("After sorting: "+arrayList);
	}

}
