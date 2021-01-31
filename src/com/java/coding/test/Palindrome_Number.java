package com.java.coding.test;

public class Palindrome_Number {

	public static void main(String[] args) {
		int number = 313;
		int reverse = 0;
		int temp_Number = number;
		System.out.println("Given number is: "+temp_Number);
		while (number != 0) {
			int reminder = number % 10;
			reverse = reverse * 10 + reminder;
			number = number / 10;
		}
		System.out.println("Reverse number is: "+reverse);
		if (reverse == temp_Number) {
			System.out.println(temp_Number+" is a Palindrome number");
		}
		else {
			System.out.println(temp_Number+" is NOT a Palindrome number");
		}
	}

}
