package com.amarjeet;

public class PracticeSet3 {

	static void pattern1(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
	}
	
	static void pattern2(int n) {
		for(int i=n;i>=0;i--) {
			for(int j=0;j<=i;j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
	}
	
	//using recursion
	static void recPattern(int n) {
		if(n>0) {
			for(int i=0;i<n;i++) {
				System.out.printf("*");
			}
			System.out.println();
			recPattern(n-1);
			
		}
	}
	
	static int recursiveSum(int n) {
		if(n==0) {
			return 0;
		}
		else {
			return n+recursiveSum(n-1);
		}
	}
	
	public static void main(String[] args) {
		
		pattern1(2);
		System.out.printf("The sum of all natural numbers from 1000 is: %d",recursiveSum(1000));
		pattern2(3);
		System.out.println();
		recPattern(6);

	}

}
