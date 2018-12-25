package org.programming;

import java.util.Scanner;

//Swap two variables using third variable
public class SwapNumbersWithThirdVariable {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the first number - ");
		int firstNum = input.nextInt();

		System.out.println("Enter the second number - ");
		int secondNum = input.nextInt();

		int tempNum = 0;

		tempNum = firstNum;
		firstNum = secondNum;
		secondNum = tempNum;

		System.out.println("Interchanged value of first number is - " + firstNum);
		System.out.println("Interchanged value of second number is - " + secondNum);
	}
}
