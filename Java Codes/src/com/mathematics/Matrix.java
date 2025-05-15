package com.mathematics;

public class Matrix {
	
	
	public int[][] addMat(int a[][], int b[][]) {
		int c[][] = new int[2][2];
		for(int i=0;i<c.length;i++) {
			for(int j=0;j<c[i].length;j++) {
				c[i][j] = a[i][j]+b[i][j];
			}
		}
		return c;
	}
	
	public int[][] subMat(int a[][], int b[][]) {
		int c[][] = new int[2][2];
		for(int i=0;i<c.length;i++) {
			for(int j=0;j<c[i].length;j++) {
				c[i][j] = a[i][j]-b[i][j];
			}
		}
		return c;
	}

}
