package com.amarjeet;

public class StringMethods {
	public static void main(String args[]) {
		
		//String is a class and can be declared in 2 ways
		
		String name = " HeLLo "; //1st way
		// String name1 = new String("Hi"); //2nd way
		
		System.out.println(name.length()); //used to return length of string
		
		System.out.println(name.toLowerCase()); //used to return a string in lowercase
		
		System.out.println(name.toUpperCase()); //used to return a string in uppercase
		
		System.out.println(name.trim()); //used to remove whitespace from both starting and ending 
		
		System.out.println(name.substring(2)); //used to return a substring starting from the given initial index
		
		System.out.println(name.substring(2, 7));//used to return a substring starting from the given initial index to the given end index ()does not include end index
		
		System.out.println(name.replace('H', 'F')); //(takes both char and string)used to replace all the occurrence of the oldchar with newchar
	
		System.out.println(name.startsWith("He")); //used to return (True or False) if it starts with the given string
	
		System.out.println(name.endsWith("LLo ")); //used to return (True or False) if it ends with the given string
	
		System.out.println(name.charAt(5)); //used to return the character at the given index
	
		System.out.println(name.indexOf("e")); //used to return the first occurrence of the given char or string from the given index (return -1 if not found)
	
		System.out.println(name.indexOf("e",3)); //used to return the first occurrence of the given char or string from the given index (return -1 if not found)
	
		System.out.println(name.lastIndexOf("L")); //used to return the last occurrence of the given char or string from the given index (return -1 if not found)
	
		System.out.println(name.indexOf("L",3)); //used to return the last occurrence of the given char or string from the given index (return -1 if not found)
	
		System.out.println(name.equals(" HelLo ")); //used to check if the string is equal to the given string (case sensitive)
	
		System.out.println(name.equalsIgnoreCase(" hello ")); //used to check if the string is equal to the given string ignores string case
		
	}

}
