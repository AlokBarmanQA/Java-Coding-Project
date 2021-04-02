package com.java.coding.test;

import java.util.Scanner;

public class Cube_Of_Same_Number {
	// Cube of a same number
	public static void main(String[] args) {
		//Write a program in Java to display the cube of the number upto given an integer.
		
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int cube_of_number = num * num * num;
		System.out.println(cube_of_number);
		sc.close();
	}

}
