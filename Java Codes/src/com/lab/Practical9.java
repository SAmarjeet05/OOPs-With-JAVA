package com.lab;
import com.mathematics.*;
import java.util.Scanner;

public class Practical9 {

	public static void main(String[] args) {
		
		int row = 2;
		int col = 2;
		Matrix mat = new Matrix();
		Scanner sc = new Scanner(System.in);
		
		int a[][] = new int[row][col];
		int b[][] = new int[row][col];
		
		int c[][] = new int[row][col];
		int d[][] = new int[row][col];
		
		System.out.println("Enter the values of matrix a:");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.println("Enter the values of a["+i+"]["+j+"]: ");
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter the values of matrix b:");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.println("Enter the values of b["+i+"]["+j+"]: ");
				b[i][j] = sc.nextInt();
			}
		}
		
		c = mat.addMat(a,b);
		d = mat.subMat(a,b);
		
		System.out.println("Printing the value of A + B");
		for(int i=0;i<c.length;i++) {
			for(int j=0;j<c[i].length;j++) {
				System.out.printf("%d\t",c[i][j]);
			}
			System.out.println("");
		}
		System.out.println("Printing the value of A - B");
		for(int i=0;i<d.length;i++) {
			for(int j=0;j<d[i].length;j++) {
				System.out.printf("%d\t",d[i][j]);
			}
			System.out.println("");
		}
		
		
	}

}

/*Output-----
Enter the values of matrix a:
Enter the values of a[0][0]: 2
Enter the values of a[0][1]: 3
Enter the values of a[1][0]: 4
Enter the values of a[1][1]: 5
Enter the values of matrix b:
Enter the values of b[0][0]: 13
Enter the values of b[0][1]: 16
Enter the values of b[1][0]: 17
Enter the values of b[1][1]: 10
Printing the value of A + B
15	19	
21	15	
Printing the value of A - B
-11	-13	
-13	-5
 */