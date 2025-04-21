package com.amarjeet;
import java.util.Scanner;

public class PracticeSet2 {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		//convert string to lower case
		String city = "San Francisco";
		System.out.println(city.toLowerCase());
		
		//replace spaces with underscore
		String sentence = "This is a sentence";
		System.out.println(sentence.replace(" ", "_"));
		
		//replace the name in the template
		String template = "Dear <|name|>, thanks a lot!";
		System.out.println(template.replace("<|name|>", "Sam"));
		
		//Program to detect double and triple space in a text
		String space = "This  is a sentence with   lots of spaces";
		System.out.println(space.indexOf("  "));
		System.out.println(space.indexOf("   "));
		
		// program to check if a student is pass or fail, it requires a total of 40% and 33% in each subject to pass
		
		/*System.out.println("Enter the marks of maths: ");
		float maths = sc.nextFloat();
		System.out.println("Enter the marks of science: ");
		float science = sc.nextFloat();
		System.out.println("Enter the marks of sst: ");
		float sst = sc.nextFloat();
		
		float percentage = (maths+science+sst)/3f;
		
		if(maths>=33 && science>=33 && sst>=33 && percentage>=40) {
			System.out.println("The student has passed");
		}else {
			System.out.println("The student has failed");
		}*/
		
		
		//program to calculate income tax
		/*float tax = 0;
		System.out.println("Enter your salary: ");
		int income = sc.nextInt();
		if(income<250000) {
			tax = 0f;
		}
		if(income>250000 && income<500000) {
			tax = tax + 0.05f*(income-250000);
		}else if(income>500000 && income<1000000){
			tax = tax + 0.05f*(500000-250000);
			tax = tax + 0.2f*(income-500000);
		}else {
			tax = tax + 0.05f*(500000-250000);
			tax = tax + 0.2f*(1000000-500000);
			tax = tax + 0.3f*(income-1000000);
		}
		System.out.printf("Tax: %f",tax);*/
		
		
		//program to print the day of the week corresponding the number
		System.out.println("enter a number (1,7): ");
		int number = sc.nextInt();
		switch(number) {
		case 1 -> System.out.println("Monday");
		case 2 -> System.out.println("Tuesday");
		case 3 -> System.out.println("Wednesday");
		case 4 -> System.out.println("Thursday");
		case 5 -> System.out.println("Friday");
		case 6 -> System.out.println("Saturday");
		case 7 -> System.out.println("Sunday");
		default -> System.out.println("Enter a number between 1-7");
		}
	}
}
