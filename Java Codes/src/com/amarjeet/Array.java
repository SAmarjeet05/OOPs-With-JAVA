package com.amarjeet;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks[] = new int[5]; //only allocating the memory here
		int marks2[] = {23,41,79,61};//initialization of array
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values of array: ");
		for(int i=0;i<marks.length;i++) {
			marks[i] = sc.nextInt();
		}
		
		System.out.println("Printing the marks array in reverse order: ");
		for(int j=(marks.length-1);j>=0;j--) {
			System.out.println(marks[j]);
		}

	}

}
