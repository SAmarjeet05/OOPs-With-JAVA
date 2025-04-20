package com.amarjeet;

public class TypeCasting {
	public static void main(String args[]) {
		
		//program to encrypt a grade
		char orig_grade = 'A';
		char encrypted_grade = (char)(orig_grade+8);
		System.out.println("Grade: "+encrypted_grade);
		
		//program to decrypt a grade
		char decrypted_grade = (char)(encrypted_grade-8);
		System.out.println("Grade: "+decrypted_grade);
	}
}
