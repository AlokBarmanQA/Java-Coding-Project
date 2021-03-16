package com.java.coding.test;

import java.util.Scanner;

public class Odd_Natural_Numbers {

	public static void main(String[] args) {
		// Write a program in Java to display the n terms of odd natural number and their sum.
		
		System.out.println("Enter a number:");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if (num > 0) {
			if (num % 2 != 0) {
				System.out.println(num+" is a ODD number");
			}
			else {
				System.out.println(num+" is an even number");
			}
		}
		else if (num < 0){
			System.out.println(num+" is not a natural number, it is a negative number");
		}
		else {
			System.out.println(num+" is ZERO. it is not a natural number");
		}
		sc.close();
	}

}
