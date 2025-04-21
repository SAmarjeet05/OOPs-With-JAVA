package com.amarjeet;
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissor {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter (rock,paper,scissor): ");
		String choice = sc.next();
		
		String stack[] = {"rock","paper","scissor"};
		Random randomiser = new Random();
		int index = randomiser.nextInt(stack.length);
		
		String bot_value = stack[index];
		System.out.println("Bot chose: "+bot_value);
		
		if(bot_value.equals(choice)) {
			System.out.println("Draw.");
		}else if(bot_value.equals("rock")) {
			if(choice.equals("paper")) {
				System.out.println("User wins");
			}else {
				System.out.println("Bot wins");
			}
		}else if(bot_value.equals("paper")) {
			if(choice.equals("rock")) {
				System.out.println("Bot wins");
			}else {
				System.out.println("User wins");
			}
		}else {
			if(choice.equals("rock")) {
				System.out.println("User wins");
			}else {
				System.out.println("Bot wins");
			}
		}
		
		
	}
}
