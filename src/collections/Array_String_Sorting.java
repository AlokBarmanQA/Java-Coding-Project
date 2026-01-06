package collections;

import java.util.Arrays;

/**
 * @author alokb
 *
 */
public class Array_String_Sorting {

	public static void main(String[] args) {

		String str[] = {"Alok", "Kumar", "Barman", "Java", "Python", "Javascript", "Groovy"};
		System.out.println("Before sorting: ");
		for (String word : str) {
			System.out.print(word + " ,");
		}
		System.out.println();
		Arrays.sort(str);
		System.out.println("After sorting: ");
		for (String word : str) {
			System.out.print(word + " ,");
		}
	}

}
