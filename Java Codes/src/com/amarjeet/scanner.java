package com.amarjeet;
import java.util.Scanner;

public class scanner {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in); // used to create a object of scanner class to take user input
		
		int a = sc.nextInt(); //used to take integer input
		System.out.println(a);
		
		sc.nextLine();
		
		float c = sc.nextFloat(); //used to take float input
		System.out.println(c);
		
		sc.nextLine();

		String str = sc.next(); //used to take string input (does not include character after whitespace)
		System.out.println(str);
		
		sc.nextLine();
		
		boolean b1 = sc.hasNextInt(); //used to check if the entered value is integer or not
		System.out.println(b1);
		
		sc.nextLine();
		
		String str1 = sc.nextLine(); //used to take string input
		System.out.println(str1);
	}
}
