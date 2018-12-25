package org.programming;

import java.util.Scanner;

//Find the count of even numbers from the given range
public class FindCountOfEvenNumbers {
	public static void main(String[] args) {
		int count = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the range - ");
		int valueRange = input.nextInt();
		
		 for (int i = 0; i < valueRange; i++) {
			if (i % 2 == 0) {
				count++;
			}
		}
		 
		System.out.println("Total number of even numbers in given range(0 - " + valueRange + ") is - " + count);
	}
}
