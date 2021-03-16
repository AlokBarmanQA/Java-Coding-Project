package com.java.coding.test;

public class Reverse_String_Keep_Space {

	public static void main(String[] args) {
		String str = "alok kumar barman";
		char chr[] = str.toCharArray();
		int start = 0;
		int end = chr.length-1;
		while(end > start) {
			if(chr[start] == ' ') {
				start++;
			}
			else if(chr[end] == ' ') {
				end--;
			}
			else {
				char temp = chr[start];
				chr[start] = chr[end];
				chr[end] = temp;
				start++;
				end--;
			}
		}
		System.out.println(chr);
	}
}
