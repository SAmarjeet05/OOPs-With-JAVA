package com.amarjeet;
import java.util.Random;
import java.util.Scanner;

class Game{
	private int number;
	private int guessnum;
	private int no_of_guesses=1;
	
	public Game() {
		Random randomiser = new Random();
		number = randomiser.nextInt(100, 201);
	}
	
	public void takeUserInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your guess(100-200): ");
		guessnum = sc.nextInt();
	}
	
	public void setter(int a) {
		no_of_guesses = a;
	}
	
	public int getter() {
		return no_of_guesses;
	}
	
	public void isCorrectNumber() {
		
		while(true) {
		
			if(guessnum == number) {
				System.out.printf("Correct!! The number is: %d \n",number);
				System.out.printf("It took a total of %d guesses.", getter());
				break;
			}
			
			else if(guessnum-number>=15 || number-guessnum>=15) {
				if(guessnum-number>=15) {
					System.out.println("The number you picked is very big!! Try again");
					setter(no_of_guesses+1);
				}
				else{
					System.out.println("The number you picked is very small!! Try again");
					setter(no_of_guesses+1);
				}
				takeUserInput();
				
			}
			else if(guessnum-number>=8 || number-guessnum>=8) {
				if(guessnum-number>=8) {
					System.out.println("Getting some progress but still very big!! Try again");
					setter(no_of_guesses+1);
				}
				else{
					System.out.println("Getting some progress but still very small!! Try again");
					setter(no_of_guesses+1);
				}
				takeUserInput();
			}
			else {
				if(guessnum-number>=4) {
					System.out.println("Very close!! Try again");
					setter(no_of_guesses+1);
				}
				else if(guessnum-number<=4) {
					System.out.println("Very close!! Try again");
					setter(no_of_guesses+1);
				}
				else{
					System.out.println("Enter a number between 100 to 200");
					setter(no_of_guesses+1);
					
				}
				takeUserInput();
			}
			
		}
	}
	
	
}

public class GuessTheNumber {

	public static void main(String[] args) {

		Game g1 = new Game();
		g1.takeUserInput();
		g1.isCorrectNumber();

	}

}
