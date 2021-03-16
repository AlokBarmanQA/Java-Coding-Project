package com.java.coding.test;

public class Prime_Number {

	public static void main(String[] args) {
		for(int i=0; i<=100; i++) {
			checkPrime_number(i);
		}
	}

	public static void checkPrime_number(int number) {
		int flag = 0;
		if(number <= 1) {
			System.out.println(number + " is not a prime number");
		}
		else {
			for(int i=2; i<=number/2; i++) {
				if(number%i == 0) {
					System.out.println(number + " is not a prime number");
					flag = 1;
					break;
				}
			}
			if(flag == 0) {
				System.out.println(number + " is a Prime number");
			}
		}
	}
}
