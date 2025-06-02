package com.lab;
import java.io.*;
import java.util.Scanner;

public class Practical11 {

	    public static void main(String[] args) throws IOException {
	        if (args.length > 0) {
	            System.out.println("Command Line Argument: " + args[0]);
	        } else {
	            System.out.println("No Command Line Argument provided.");
	        }

	        DataInputStream dis = new DataInputStream(System.in);
	        System.out.print("Enter an integer using DataInputStream: ");
	        int number = Integer.parseInt(new BufferedReader(new InputStreamReader(dis)).readLine());
	        System.out.println("You entered (DataInputStream): " + number);

	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        System.out.print("Enter a string using BufferedReader: ");
	        String brInput = br.readLine();
	        System.out.println("You entered (BufferedReader): " + brInput);

	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a string using Scanner: ");
	        String scInput = sc.nextLine();
	        System.out.println("You entered (Scanner): " + scInput);

	        Console console = System.console();
	        if (console != null) {
	            String consoleInput = console.readLine("Enter a string using Console: ");
	            System.out.println("You entered (Console): " + consoleInput);
	        } else {
	            System.out.println("Console is not available (e.g., running inside IDE).");
	        }

	        sc.close();
	    
	}


}

/*Output---
 Command Line Argument: Hi
Enter an integer using DataInputStream: 34
You entered (DataInputStream): 34
Enter a string using BufferedReader: String using bufferedReader
You entered (BufferedReader): String using bufferedReader
Enter a string using Scanner: String using scanner
You entered (Scanner): String using scanner
Enter a string using Console: String using console
You entered (Console): String using console
*/
