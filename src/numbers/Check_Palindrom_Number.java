package numbers;

public class Check_Palindrom_Number {

	public static void main(String[] args) {
		check_palindrom_number(313);
		check_palindrom_number(123);
	}
	public static void check_palindrom_number(int number) {
		int reminder;
		int reverse = 0;
		int temp = number;
		while(number>0) {
			reminder = number%10;
			reverse = reverse*10 + reminder;
			number = number/10;
		}
		if(reverse == temp) {
			System.out.println(temp + " is a Palindrom number");
		}
		else {
			System.out.println(temp + " is not a Palindrom number");
		}
	}
}
