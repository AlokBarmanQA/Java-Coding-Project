package arrays;

public class Highest_and_Lowest_Number {

	public static void main(String[] args) {
		int numbers[] = {1,2,3,4,5,6,7,8,9};
		
		int max = numbers[0];
		int min = numbers[0];
		// using for loop
//		for(int i=0; i<numbers.length; i++) {
//			if(numbers[i]>max) {
//				max = numbers[i];
//			}
//			else if(numbers[i]<min) {
//				min = numbers[i];
//			}
//		}
		// using for each loop
		for(Integer number:numbers) {
			if(number>max) {
				max = number;
			}
			else if(number<min) {
				min = number;
			}
		}
		System.out.println("Highest number is: " + max);
		System.out.println("Lowest number is: " + min);
	}

}
