package com.lab;

public class Practical1 {

	public static void main(String[] args) {
		
		if(args.length == 0) {
			System.out.println("No number entered!!");
		}
		
		int number = Integer.parseInt(args[0]);
		
		boolean prime = true;
		
		for(int i=2;i<number;i++) {
			if(number%i==0) {
				prime = false;
				break;
			}
		}
		
		if(prime) {
			System.out.printf("The number %d is a prime number.",number);
		}else {
			System.out.printf("The number %d is not a prime number.",number);
		}
		
	}

}
