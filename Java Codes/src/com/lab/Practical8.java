package com.lab;

import java.util.Scanner;

class NegativeValue extends Exception{
	
	public NegativeValue() {
		super("Entered a Negative Value!!");
	}
	
}


public class Practical8 {

	public static void main(String[] args) throws NegativeValue{
		
		Scanner sc = new Scanner(System.in);
		try {
			
			System.out.println("Enter a positive number: ");
			int n = sc.nextInt();
			if(n<0) {
				throw new NegativeValue();
			}else {
				System.out.println("You entered a postive number!");
			}
			
		}catch(NegativeValue e){
			System.err.println("Exception: "+e.getMessage());
		}
		finally {
			System.out.println("Program executed successfully");
		}
		
	}

}
