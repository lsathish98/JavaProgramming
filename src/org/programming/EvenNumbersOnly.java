package org.programming;

import java.util.Scanner;

//Find even numbers form a given set of values
public class EvenNumbersOnly {
	public static void main(String[] args) {
		Scanner input  = new Scanner(System.in);
		
		System.out.println("Enter the range - ");
		int valueRange = input.nextInt();
		System.out.println("Even numbers from 0 to " + valueRange + " are:");
		
		for (int i = 0; i <= valueRange; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
}
