package com.java.coding.test;

public class Palindrom_String {

	public static void main(String[] args) {
		String str = "Madam";
		System.out.println(str.toLowerCase());
		char character[] = str.toLowerCase().toCharArray();
		int length = character.length;
		String reverse = "";
		for (int i = length-1; i>=0; i--) {
			reverse = reverse + character[i];
		}
		System.out.println(reverse);
		if (str.equalsIgnoreCase(reverse)) {
			System.out.println(str + " is a Palindrome string");
		}
		else {
			System.out.println(str + " is NOT a Palindrom string");
		}
	}

}
