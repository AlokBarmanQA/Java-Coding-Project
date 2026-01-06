package numbers;

public class Factorial_Number {

	public static void main(String[] args) {
		check_factorial(7);
	}
	
	public static void check_factorial(int number) {
		int fact = 1;
		for(int i=1; i<=number; i++) {
			fact = fact * i;
		}
		System.out.println(fact);
	}
}
