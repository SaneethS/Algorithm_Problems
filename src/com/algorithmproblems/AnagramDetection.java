package com.algorithmproblems;

import java.util.*;

/**this class is used to find anagrams between two string
 * @author saneeths
 *
 */
public class AnagramDetection {
	public static String string1, string2;
	public static void runAnagram() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String-1:");
		string1 = scanner.nextLine();
		string1.toLowerCase();
		System.out.println("Enter String-2:");
		string2 = scanner.nextLine();
		string2.toLowerCase();
		anagram();
		
	}
	
	/**
	 * method where two string are checked for anagrams or not with their length
	 * and char array
	 */
	public static void anagram() {
		int length1 = string1.length();
		int length2 = string2.length();
		int count = 0;
		
		if(length1 != length2) {
			System.out.println("Strings are not anagram");
			return;
		}
		
		char[] array1 = string1.toCharArray();
		char[] array2 = string2.toCharArray();
		
		for(int i=0 ; i<length1 ; i++) {
			for(int j=0 ; j<length2 ; j++) {
				if(array1[i] == array2[j]) {
					count++;
					array2[j] = ' ';
					break;
				}
			}
		}
		
		if(count == length1) {
			System.out.println("Strings are anagrams!!");
		}else
			System.out.println("Strings are not anagrams!!");
	}
}
