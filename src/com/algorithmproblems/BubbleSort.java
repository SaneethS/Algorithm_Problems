package com.algorithmproblems;

import java.util.*;

public class BubbleSort {
	public static List<Integer> list = new ArrayList<>();
	public static int n;
	
	public static void runBubbleSort() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of elements in list");
		n = scanner.nextInt();
		System.out.println("Enter the Elements");
		for(int i=0 ; i<n ; i++) {
			list.add(scanner.nextInt());
		}
		System.out.println("Elements in list are");
		System.out.println(list);
		System.out.println("Sorted List");
		bubbleSort();
		System.out.println(list);
		scanner.close();
	}
	
	public static void bubbleSort() {
		int temp;
		for(int i=0 ; i<n-1 ; i++) {
			for(int j=0 ; j<n-i-1 ; j++) {
				if(list.get(j) > list.get(j+1)) {
					temp = list.get(j);
					list.set(j,list.get(j+1));
					list.set(j+1, temp);
				}
			}
		}
	}
}
