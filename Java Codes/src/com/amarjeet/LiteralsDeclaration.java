package com.amarjeet;

public class LiteralsDeclaration {
	
	public static void main(String args[]) {	
		
		byte age = 67; // can store upto -128 to 127
		short length = 12; // can store a big number then byte
		int num = 401; //This data type can automatically select the type of integer (byte,short,int)
		long path = 34567890876l; //it can store very large integers (It requires L or l at last of integer)
		char ch = 'A'; //Used for storing single character
		String str = "This is a string"; //used to store string
		float a = 6.77f; // used to store floating point integer (It requires F or f at last of number)
		double b = 12.90; // used to store floating point integer (It requires D or d at last of number)(not necessary)
		boolean val = true; // it store either true or false
		System.out.println(age);
		System.out.println(length);
		System.out.println(num);
		System.out.println(path);
		System.out.println(ch);
		System.out.println(str);
		System.out.println(a);
		System.out.println(b);
		System.out.println(val);
		
	}
}
