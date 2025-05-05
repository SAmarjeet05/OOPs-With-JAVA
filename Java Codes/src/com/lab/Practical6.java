package com.lab;

class ArithmaticOp{
	
	//Method overloading [2 function of same name but different parameters]
	public double add(double a,double b) {
		return a+b;
	}
	public double add(double a,double b,double c) {
		return a+b+c;
	}
	public double sub(double a,double b) {
		return a-b;
	}
	public double mul(double a,double b) {
		return a*b;
	}
}

class MethodOverride extends ArithmaticOp{
	
	int c = 10;
	
	//Method Overriding [Overwriting a method with same name, parameters and return type of its parent class]
	@Override
	public double add(double a,double b) {
		return a+b+c;
	}
	
}

public class Practical6 {

	public static void main(String[] args) {
		
		ArithmaticOp a = new ArithmaticOp();
		System.out.println("Adding 34 and 67.7: "+a.add(34,67.7));
		System.out.println("Subtracting 56.34 from 89: "+a.sub(89,56.34));
		System.out.println("Multiplying 34 with 67.7: "+a.mul(34,67.7));
		
		MethodOverride m = new MethodOverride();
		System.out.println("Adding 34 and 67.7 to 10: "+m.add(34,67.7));
	}

}
