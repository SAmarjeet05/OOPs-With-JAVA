package com.lab;
import java.util.Scanner;

public class Practical2 {

	public static void main(String[] args) {
		int i,j,k;
		
		System.out.println("How many rows do you want: ");
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int jaggedarr[][] = new int[row][];
		
		for(i=0;i<row;i++) {
			System.out.printf("Enter the size of column for %d row: ",i);
			jaggedarr[i] = new int[sc.nextInt()];
		}
		System.out.println("Enter the elements of the jagged array: ");
		for(j=0;j<jaggedarr.length;j++) {
			for(k=0;k<jaggedarr[j].length;k++) {
				System.out.printf("Enter the value of jaggedarr[%d][%d]: ",j,k);
				jaggedarr[j][k] = sc.nextInt();
			}
		}
		System.out.println("Printing the elements of the array: ");
		for(j=0;j<jaggedarr.length;j++) {
			for(k=0;k<jaggedarr[j].length;k++) {
				System.out.printf("%d ",jaggedarr[j][k]);
			}
			System.out.println();
		}

	}

}
