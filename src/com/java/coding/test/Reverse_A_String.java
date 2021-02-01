package com.java.coding.test;

public class Reverse_A_String {

	public static void main(String[] args) {
		
		String str = "Alok Kumar Barman";
		char character[] = str.toCharArray();
		int length = character.length;
		String reverse = "";
		for (int i = length-1; i >= 0; i--) {
			reverse = reverse + character[i];
		}
		System.out.println(reverse);
	}
}
