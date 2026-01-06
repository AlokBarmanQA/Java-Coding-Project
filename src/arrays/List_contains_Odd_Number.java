package arrays;

import java.util.Arrays;
import java.util.List;

public class List_contains_Odd_Number {

	public static void main(String[] args) {
		int numbers[] = {12,2,4,6,8};
		Integer number[] = {2,4,6,8, 9};
		List<Integer> list = Arrays.asList(number);
		System.out.println(check_odd_number(numbers));
		System.out.println(only_odd_number(list));
	}
	public static boolean check_odd_number(int numbers[]) {
		for(Integer num : numbers) {
			if(num%2 !=0) {
				System.out.println("Contains Odd number");
				return true;
			}
		}
		System.out.println("Contains even number");
		return false;
	}
	
	public static boolean only_odd_number(List<Integer> list) {
		return list.parallelStream().anyMatch(x -> x%2 !=0);
	}
}
