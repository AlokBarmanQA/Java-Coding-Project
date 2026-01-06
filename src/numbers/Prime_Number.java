package numbers;

public class Prime_Number {

	public static void main(String[] args) {
	check_prime(7);
	check_prime(9);
		for(int i=0; i<=100; i++) {
			check_prime(i);
		}
	}
	public static void check_prime(int number) {
		int isPrime = 0;
		if(number < 2) {
			System.out.println(number + " is not Prime");
		}
		else {
			for(int i=2; i<number/2; i++) {
				if(number%i==0) {
					System.out.println(number + " is not a Prime number");
					isPrime = 1;
					break;
				}
			}
			if(isPrime==0) {
				System.out.println(number + " is a Prime Number");
			}
		}
	}
}
