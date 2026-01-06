/**
 * 
 */
package collections;

import java.util.Arrays;

/**
 * @author alokb
 *
 */
public class Array_Integer_Sorting {

	public static void main(String[] args) {
		int array[] = {1, 5, 2, 4, 3};
		System.out.println("Before sorting: ");
		for (int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ,");
		}
		System.out.println();
		Arrays.sort(array);
		System.out.println("After sorting: ");
		for (int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ,");
		}
	}
}
