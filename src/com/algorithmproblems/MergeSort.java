package com.algorithmproblems;

import java.util.Scanner;

public class MergeSort {
	public static String[] words;
	public static int n;
	
	public static void runMergeSort() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of words in array");
		n = scanner.nextInt();
		words = new String[n];
		System.out.println("Enter the Elements");
		for(int i=0 ; i<n ; i++) {
			words[i] = scanner.next();
		}
		System.out.println("Sorted Array");
		mergeSort(words, 0, n-1);
		print();
		scanner.close();
	}
	
	public static void mergeSort(String[] array, int start, int end) {
		if(start == end ) {
			return;
		}
		if(start<end) {
			int mid = start+(end-start)/2;
			
			mergeSort(array,start,mid);
			mergeSort(array, mid+1, end);
			merge(array,start,mid,end);
		}
	}
	
	private static void merge(String[] array, int start, int mid, int end) {
		int n1 = mid - start + 1;
		int n2 = end - mid;
		
		String L[] = new String[n1];
		String R[] = new String[n2];
		
		for(int i=0 ; i<n1 ; ++i)
			L[i] = array[start+i];
		for(int j=0 ; j<n2 ; ++j)
			R[j] = array[mid + 1 + j];
		
		int i = 0 , j = 0;
		
		int k = start;
		
		while(i < n1 && j < n2) {
			if(L[i].compareTo(R[j]) <=0) {
				array[k] = L[i];
				i++;
			}else {
				array[k] = R[j];
				j++;
			}
			k++;
		}
		
		while(i < n1) {
			array[k] = L[i];
			i++;
			k++;
		}
		
		while(j < n2) {
			array[k] = R[j];
			j++;
			k++;
		}
	}

	public static void print() {
		for(String i: words) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
}
