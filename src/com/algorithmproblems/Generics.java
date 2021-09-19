package com.algorithmproblems;

public class Generics<T> {
	public static Integer[] arrInt = {56, 45, 78, 12, 90};
	public static String[] arrStr = {"Rock", "Sand", "Crocodile", "Sword", "Zebra"};
	
	public static void runGenerics() {
		
	}
	
	public static<T extends Comparable<T>> void bubbleSort(T[] array) {
		T temp;
		for(int i=0 ; i<array.length-1 ; i++) {
			for(int j=0 ; j<array.length-i-1 ; j++) {
				if(array[j].compareTo(array[j+1]) > 0) {
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		for(T i: array) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	public static<T extends Comparable<T>> void binarySearch(T[] array, T key) {
		bubbleSort(array);
		
		int left = 0;
		int right = array.length-1;
		int mid;
		
		while(left <= right) {
			mid = (left + right)/2;
			
			if(array[mid].compareTo(key) == 0) {
				System.out.println(key+" found at position "+(mid+1));
				return;
			}else if(array[mid].compareTo(key) > 0) {
				right = mid - 1;
			}else {
				left = mid + 1;
			}
		}
		
		System.out.println("Key not found");
	}
	
	public static<T extends Comparable<T>> void insertionSort(T[] array) {
		for(int i=0 ; i<array.length ; i++) {
			T a = array[i];
			int k = i-1;
			
			while(k>0 && array[k].compareTo(a)>0) {
				array[k+1] = array[k];
				k--;
			}
			array[k+1] = a;
		}
		for(T i: array) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
}	
