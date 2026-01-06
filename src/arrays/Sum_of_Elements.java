package arrays;

public class Sum_of_Elements {

	public static void main(String[] args) {
		Integer[] numbers = {1,2,3,4,5};
		int sum = 0;
		for(Integer number : numbers) {
			sum = sum + number;
		}
		System.out.println(sum);
	}

}
