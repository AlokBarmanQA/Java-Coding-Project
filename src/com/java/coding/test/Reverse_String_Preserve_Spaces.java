package com.java.coding.test;

public class Reverse_String_Preserve_Spaces {

	public static void main(String[] args) {
		String str = "Alok Kumar Barman";
		char character[] = str.toCharArray();
		int length = character.length;
		int start = 0;
		int end = length-1;
		while (end > start) {
			if(character[start] == ' ') {
				start++;
			}
			else if (character[end] == ' ') {
				end--;
			}
			else {
				char temp = character[start];
				character[start] = character[end];
				character[end] = temp;
				start++;
				end--;
			}
		}
		System.out.println(character);
	}
}
