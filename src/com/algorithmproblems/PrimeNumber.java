package com.algorithmproblems;

/**this class is used to get the prime number between 1 and 1000
 * @author saneeths
 *
 */
public class PrimeNumber {
	public static int start = 0;
	public static int end = 1000;
	
	public static void runPrimeNumber() {
		
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
				System.out.print(i+" ");
			}
		}
	}
}
