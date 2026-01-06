package numbers;

public class Armstrong_Number {

	public static void main(String[] args) {
		int number = 153;
		int reminder;
		int cube = 0;
		while(number>0) {
			reminder = number%10;
			cube = cube + (reminder * reminder * reminder);
			number = number/10;
		}
		System.out.println(cube);
	}

}
