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
		
		//These classes are used to create a mutable string
		// StringBuffer can be used in multiThreading
		StringBuffer st = new StringBuffer("This is a string made with StringBuffer!! ");
		st.append("and it is mutable.");
		System.out.println("StringBuffer: "+st);
		
		
		// StringBuilder can not be used in multiThreading
		StringBuilder st1 = new StringBuilder("This is a string made with StringBuilder!! ");
		st1.append("and it is mutable.");
		System.out.println("StringBuilder: "+st1);
		
		
		

	}

}
