package org.programming;

import java.util.Scanner;

public class SwapNumbersWithoutThirdVariable {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the first number - ");
		int firstNumber = input.nextInt();
		System.out.println("Enter the second number");
		int secondNumber = input.nextInt();
		
		firstNumber = firstNumber + secondNumber;
		secondNumber = firstNumber - secondNumber;
		firstNumber = firstNumber - secondNumber;
		
		System.out.println("Interchanged value of first number is - " + firstNumber);
		System.out.println("Interchanged value of second number is - " + secondNumber);
	}
}
