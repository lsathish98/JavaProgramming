package org.programming;

import java.util.Scanner;

//Find the count of odd numbers from the given range
public class FindCountOfOddNumbers {
	public static void main(String[] args) {
		int count = 0;

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the range - ");
		int valueRange = input.nextInt();

		for (int i = 0; i < valueRange; i++) {
			if (i % 2 == 1) {
				count++;
			}
		}

		System.out.println("Total number of odd numbers in given range(0 - " + valueRange + ") is - " + count);
	}
}
