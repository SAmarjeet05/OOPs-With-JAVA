package com.lab;
import java.util.Scanner;

public class Practical7 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter your 2nd name: ");
		String name2 = sc.nextLine();
		
		System.out.println("The len of the entered String is: "+name.length());
		System.out.println("The string after concatinating is: "+name.concat(", how are you?"));
		System.out.println("The character at the 3th index is: "+name.charAt(3));
		System.out.println("Comparing using using equals : "+name.equals(name2));
		
		System.out.println("Seaching A and modifying with Vi: "+name2.replace("A", "Vi"));
		
		StringBuffer st = new StringBuffer("This is a string made with StringBuffer!! ");
		st.append("and it is mutable.");
		System.out.println("StringBuffer: "+st);
		
		StringBuilder st1 = new StringBuilder("This is a string made with StringBuilder!! ");
		st1.append("and it is mutable.");
		System.out.println("StringBuilder: "+st1);
		

	}

}

/*Output----
Enter your name: Nitesh Kumar
Enter your 2nd name: Ajay
The len of the entered String is: 12
The string after concatinating is: Nitesh Kumar, how are you?
The character at the 3th index is: e
Comparing using using equals : false
Seaching A and modifying with Vi: Vijay
StringBuffer: This is a string made with StringBuffer!! and it is mutable.
StringBuilder: This is a string made with StringBuilder!! and it is mutable.
*/


