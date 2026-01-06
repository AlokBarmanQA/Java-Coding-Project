/**
 * 
 */
package collections;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author alokb
 *
 */
public class Array_Object_Sorting_As_List_Descending {

	public static void main(String[] args) {
		
		String array[] = {"Alok", "Kumar", "Barman", "Java", "Python", "Javascript", "Groovy"};
		
		System.out.println("Before sorting: "+ Arrays.toString(array));
		
		Arrays.sort(array);
		
		System.out.println("After sorting: "+ Arrays.toString(array));

		Arrays.sort(array, Comparator.reverseOrder());
		
		System.out.println("Descending Order: "+ Arrays.toString(array));
	}
}
