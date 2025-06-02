package com.lab;
import java.io.*;
import java.util.Scanner;

public class Practical11 {

	    public static void main(String[] args) throws IOException {
	        // 1. Command Line Arguments
	        if (args.length > 0) {
	            System.out.println("Command Line Argument: " + args[0]);
	        } else {
	            System.out.println("No Command Line Argument provided.");
	        }

	        DataInputStream dis = new DataInputStream(System.in);
	        System.out.print("Enter a string using DataInputStream: ");
	        String disInput = dis.readLine();
	        System.out.println("You entered (DataInputStream): " + disInput);

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
