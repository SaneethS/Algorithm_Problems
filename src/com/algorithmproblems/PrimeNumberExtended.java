package com.algorithmproblems;

/**
 * @author saneeths
 *this class is used to display all the prime numebers that are palindrome
 */
public class PrimeNumberExtended {
	public static int start = 0;
	public static int end = 1000;
	
	public static void runPrimeNumberExtended() {
		
		System.out.println("Prime Numbers between "+start+" & "+end+" are");
		primeNumber();
	}

	/**
	 * this method is used check and display the prime numbers between 
	 * 0 and 1000
	 */
	public static void primeNumber() {
		if(start < 2) {
			start = 2;
		}
		
		for(int i= start; i < end ; i++) {
			boolean primeNo = true;
			for(int j = 2; j < i/2 ; j++) {
				if(i % j == 0) {
					primeNo = false;
					break;
				}
			}
			if(primeNo) {
				palindrome(i);
			}
		}
	}
	
	/**this method is used to display all the prime numbers that are palindrome
	 * @param n
	 */
	public static void palindrome(int n) {
		int num = n;
		int rev = 0;
		
		while(n != 0) {
			int digit = n % 10;
			rev = (rev * 10) + digit;
			n = n/10;
		}
		
		if(num == rev) {
			System.out.println(num+" ");
		}
	}
}
