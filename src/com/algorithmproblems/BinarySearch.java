package com.algorithmproblems;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class BinarySearch {
	public static String[] words;
	public static String fileName = "data/binary_search.txt"; 
	
	public static void run() {
		Scanner scanner = new Scanner(System.in);
		read();
		sort();
		System.out.println("\nEnter the word to search");
		String key = scanner.nextLine();
		scanner.close();
		binarySearch(key);
		
	}
	
	public static void read() {
		try {
			Scanner file = new Scanner(new File(fileName));
			String word = "";
			
			while(file.hasNext()) {
				word = word+file.next();
			}
			words = word.split(",");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void sort() {
		int n = words.length;
		String temp;
		
		for(int i=0 ; i < n-1 ; i++) {
			for(int j=0 ; j < n-i-1 ; j++) {
				if(words[j].compareTo(words[j+1])>0) {
					temp = words[j];
					words[j] = words[j+1];
					words[j+1] = temp;
				}
			}
		}
		
		System.out.println("Words from the file are");
		
		for (String word : words) {
			System.out.print(word + " ");
		}
	}
	
	public static void binarySearch(String key) {
		int left = 0;
		int right = words.length-1;
		int mid;
		
		while(left <= right) {
			mid = (left + right)/2;
			
			if(words[mid].compareTo(key) == 0) {
				System.out.println(key+" found at position "+(mid+1));
				return;
			}else if(words[mid].compareTo(key) > 0) {
				right = mid - 1;
			}else {
				left = mid + 1;
			}
		}
		
		System.out.println("Key not found");
	}
}
