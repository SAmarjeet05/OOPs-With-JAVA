package com.amarjeet;
import java.util.Scanner;

/**
 * program to calculate Percentage of a student
 */

public class Exercise {
	
	public static void main(String args[]) {
		
	Scanner sc = new Scanner(System.in);
	
	
	System.out.println("Enter marks of Mathematics: ");
	int maths = sc.nextInt();
	System.out.println("Enter marks of Physics: ");
	int physics = sc.nextInt();
	System.out.println("Enter marks of Chemistry: ");
	int chem = sc.nextInt();
	System.out.println("Enter marks of English: ");
	int eng = sc.nextInt();
	System.out.println("Enter marks of Computer: ");
	int com = sc.nextInt();
	
	double sum = maths+eng+physics+chem+com;
	double percentage = (sum/500)*100;
	
	System.out.println("The percentage of student is: "+percentage);
	
	}
}
