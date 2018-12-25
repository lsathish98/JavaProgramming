package org.programming;

import java.util.Scanner;

public class FactorialOfANumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double fact = 1;

		System.out.println("Enter the number - ");
		int num = input.nextInt();

		for (int i = 1; i <= num; i++) {
			fact = fact * i;
			System.out.println(fact);
		}
		System.out.println("Factorial of " + num + " is " + fact);
	}
}