/**
 * 
 */
package collections;

import java.util.Arrays;

/**
 * @author alokb
 *
 */
public class Array_Integer_Sorting_As_List {

	public static void main(String[] args) {
		
		int array[] = {1, 5, 2, 4, 3};
		
		System.out.println("Before sorting: "+ Arrays.toString(array));

		Arrays.sort(array);
		
		System.out.println("After sorting: "+ Arrays.toString(array));
	}
}
