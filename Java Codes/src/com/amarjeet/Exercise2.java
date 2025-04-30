package com.amarjeet;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Implementing a simple online library With the features of adding books, showing books, issuing and returning books
 */

class Library{
	
	
	Scanner sc = new Scanner(System.in);
	
	ArrayList<String> available_books = new ArrayList<>();
	ArrayList<String> issued_books = new ArrayList<>();
	
	public void addBook() {
		boolean present = false;
		System.out.println("Enter the name of the book: ");
		String name = sc.nextLine();
		for(int i=0;i<available_books.size();i++) {
			if(name.equalsIgnoreCase(available_books.get(i))) {
				present = true;
			}
		}
		if(present) {
			System.out.println("This book is already added!!!!");			
		}else {
			available_books.add(name);			
			System.out.println("Book Entered!!");
		}
	}
	
	
	public void deleteBook() {
		boolean present = false;
		System.out.println("Enter the name of the book to be deleted: ");
		String name = sc.nextLine();
		for(int i=0;i<available_books.size();i++) {
			if(name.equalsIgnoreCase(available_books.get(i))) {
				present = true;
			}
		}
		if(present) {
			System.out.println("Are you sure(y/n): ");
			String check = sc.next();
			if(check.equalsIgnoreCase("y")) {
				available_books.remove(name);
			}else {
				System.out.println("Failed to delete!!");
			}			
		}else {			
			System.out.println("Book Not Found!!");
		}
	}
	
	
	public void issueBook() {
		boolean present = false;
		System.out.println("Enter the name of the book to be issued: ");
		String name = sc.nextLine();
		for(int i=0;i<available_books.size();i++) {
			if(name.equalsIgnoreCase(available_books.get(i))) {
				present = true;
			}
		}
		if(present) {
			issued_books.add(name);
			available_books.remove(name);
			System.out.println("Book issued successfully");			
		}else {
			System.out.println("Book Not Found!!");			
		}
	}
	
	public void returnBook() {
		boolean present = false;
		System.out.println("Enter the name of the book to be returned: ");
		String name = sc.nextLine();
		for(int i=0;i<issued_books.size();i++) {
			if(name.equalsIgnoreCase(issued_books.get(i))) {
				present = true;
			}
		}
		if(present) {
			issued_books.remove(name);
			available_books.add(name);
			System.out.println("Book returned successfully");					
		}else {
			System.out.println("Book Not Found!!");			
		}
		
	}
	
	public void showAvailableBook() {
		System.out.println("The Books that are available are: "+available_books);
		System.out.println("The Books that are issued are: "+issued_books);
	}
}

public class Exercise2 {

	public static void main(String[] args) {
		
		int choice;
		
		Library l = new Library();
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("---- Library Menu ----");
			System.out.println("1. Add Book");
			System.out.println("2. Delete Book");
			System.out.println("3. Issue Book");
			System.out.println("4. Return Book");
			System.out.println("5. Show Available Book");
			System.out.println("6. Exit");
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			switch(choice) {
			
				case 1:
					l.addBook();
					break;
				case 2:
					l.deleteBook();
					break;
				case 3:
					l.issueBook();
					break;
				case 4:
					l.returnBook();
					break;
				case 5:
					l.showAvailableBook();
					break;
				default:System.out.println("Enter a valid option!!");
			
			}
		}while(choice!=6);
		System.out.println("Exiting......");
	}

}
