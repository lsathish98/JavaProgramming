package org.programming;

import java.util.Scanner;

public class Ascending {
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Input: ");
		int n = s.nextInt();
		int i=1;
		while (i<=n) {
			System.out.println("Value: "+i);
			i++;
		}
	}

}
