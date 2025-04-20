package com.amarjeet;
import java.util.Scanner;

public class PracticeSet {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		//program to sum 3 numbers
		
		/*System.out.println("Enter the 1st number: ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter the 2nd number: ");
		int num2 = sc.nextInt();
		
		System.out.println("Enter the 3rd number: ");
		int num3 = sc.nextInt();
		
		int sum = num1+num2+num3;
		System.out.println("The sum of these numbers are: "+sum);*/
		
		
		//program to calculate CGPA of 3 subjects
		
		/*System.out.println("Enter the marks of 1st subject: ");
		float num1 = sc.nextFloat();
		
		System.out.println("Enter the marks of 2nd subject: ");
		float num2 = sc.nextFloat();
		
		System.out.println("Enter the marks of 3rd subject: ");
		float num3 = sc.nextFloat();
		
		float cgpa = (num1+num2+num3)/30;
		System.out.println("The cgpa of these subjects is: "+cgpa);*/
		
		//program to take an input of name and print a mssg
		
		/*System.out.println("Enter your name: ");
		String name = sc.next();
		System.out.println("Hello "+name+", have a good day!");*/
		
		//program to convert kilometer to miles
		
		/*System.out.println("Enter The value in kilometers: ");
		float kilo = sc.nextFloat();
		
		float miles = kilo/1.609f;
		System.out.println("The value in miles is: "+miles);*/
		
		//check if the number entered by the user is integer or not
		
		System.out.println("Enter the value of the integer: ");
		boolean b = sc.hasNextInt();
		System.out.println("The value is integer: "+b);
		
		
	}
}
