package arrays;

import java.util.Arrays;

public class Second_Largest_Number {

	public static void main(String[] args) {
		int arr[] = {2,4,6,8,6,6,8,8,8};
		second_largest_number(arr);
	}
	
	public static void second_largest_number(int arr[]) {
		int arr_len = arr.length;
		if(arr_len<2) {
			System.out.println("Invalid input");
			return;
		}
		Arrays.sort(arr);
		for(int i=arr_len-1; i>=0; i--) {
			if(arr[i] != arr[arr_len-1]) {
				System.out.println("Second largest number: " + arr[i]);
				break;
			}
		}
		System.out.println("There is no second largest number");
	}
}
