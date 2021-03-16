package com.java.coding.test;

import java.util.Scanner;

public class Multiplication_Table {

	public static void main(String[] args) {
		// Write a program in Java to display the multiplication table of a given integer. 
		
		System.out.println("Enter a number to get multiplication table:");
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		for (int i=0; i<=10; i++) {
			int result = number * i;
			System.out.println(number +" X "+ i + " = "+ result);
		}
		sc.close();
	}

}
