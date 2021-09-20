package com.algorithmproblems;

import java.util.Scanner;

/**
 * @author saneeths
 *class used to find the number
 */
public class FindYourNumber {
	static int number;
	static Scanner scanner = new Scanner(System.in);
	/**
	 * this method is used to get the input where n is taken from command line argument
	 * @param n
	 */
	public static void findYourNumber(int n) {
		 System.out.println("Enter the number between 0 and "+(n-1)+" :");
		 number = scanner.nextInt();
		 find(0,n-1);
	}
	/**
	 * this method is used to find user given number between 0 and n-1
	 * @param l represents the lowest number
	 * @param h represents the highest number
	 */
	private static void find(int l, int h) {
		if(l==h) {
			System.out.println("Your number is "+l);
			return;
		}
		int m = (l + h)/2;
		String choice;
		System.out.println("Is your number between " + l + " and " + m+" ?");
		choice = scanner.next();
		if (choice.equalsIgnoreCase("yes")) {
			find(l, m);
		} else {
			find(m + 1, h);
		}
	}
}
