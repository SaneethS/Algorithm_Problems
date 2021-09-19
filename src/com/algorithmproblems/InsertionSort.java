package com.algorithmproblems;

import java.util.Scanner;

public class InsertionSort {
	public static String[] words;
	public static int n;
	
	public static void runInsertionSort() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of words in array");
		n = scanner.nextInt();
		words = new String[n];
		System.out.println("Enter the Elements");
		for(int i=0 ; i<n ; i++) {
			words[i] = scanner.next();
		}
		System.out.println("Words in Array are");
		print();
		System.out.println("Sorted Array");
		insertionSort();
		print();
		scanner.close();
	}
	
	private static void insertionSort() {
		for(int i=0 ; i<n ; i++) {
			String word = words[i];
			int k = i-1;
			
			while(k>0 && words[k].compareTo(word)>0) {
				words[k+1] = words[k];
				k--;
			}
			words[k+1] = word;
		}
	}

	public static void print() {
		for(String i: words) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
}
