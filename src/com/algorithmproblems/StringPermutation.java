package com.algorithmproblems;

import java.util.Scanner;

public class StringPermutation {
	
	public static void stringPermutation() {
		StringPermutation str = new StringPermutation();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String of which permutation is required");
		String string = scanner.nextLine();
		int n = string.length();
		str.permutation(string, 0, n-1);
	}
	
	public void permutation(String str, int l, int r) {
		if(l == r) {
			System.out.println(str);
		}else {
			for(int i = l ; i < r ; i++) {
				str = swap(str,l,i);
				permutation(str,l+1,r);
				str = swap(str,l,i);
			}
		}
	}

	private String swap(String str, int l, int r) {
		char temp;
		char[] arr = str.toCharArray();
		temp = arr[l];
		arr[l] = arr[r];
		arr[r] = temp;
		return String.valueOf(arr);
	}
}
