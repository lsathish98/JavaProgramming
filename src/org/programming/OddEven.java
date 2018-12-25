//To find the given number is Even or Odd

package org.programming;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		int count = 2;
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < count; i++) {
			
			System.out.println("Enter the number:");
			int a = input.nextInt();
			if (!((a % 2) == 1)) {
				System.out.println(a + " " + "is even");
			} else {
				System.out.println(a + " " + "is odd");
			}
		}
	}
}
