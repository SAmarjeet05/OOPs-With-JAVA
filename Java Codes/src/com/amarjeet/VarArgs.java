package com.amarjeet;

public class VarArgs {
	
	
	//This method contains (int ...arr) which tells that we can pass zero or more arguments during the function call
	static int sum(int ...arr) {
		int result = 0;
		for(int i:arr) {
			result += i;
		}
		return result;
	}
	
	//it is the same as above but in this we have made one variable(x) compulsory 
	//so during the function call we must atleast have 1 argument
	static int sum1(int x, int ...arr) {
		int result = 0;
		for(int i:arr) {
			result += i;
		}
		return result;
	}
	
	
	public static void main(String args[]) {
		System.out.printf("The sum nothing: %d\n",sum());//will not throw any error
		System.out.printf("The sum of 1 and 2: %d\n",sum(1,2));
		System.out.printf("The sum of 1, 6 and 2: %d\n",sum(1,2,6));
		System.out.printf("The sum of 1, 6, 14, 80 and 2: %d\n",sum(1,2,6,80,14));
		//this will throw error
		//System.out.printf("The sum of 1 and 2: %d",sum1());
		System.out.printf("The sum of 1 and 2: %d",sum1(3,1,2)); //here x=3, and arr = {1,2}
		
	}
}
