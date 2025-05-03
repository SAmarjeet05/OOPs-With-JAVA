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
		System.out.println(a.add(34,67.7));
		System.out.println(a.sub(89,56.34));
		System.out.println(a.mul(34,67.7));
		
		MethodOverride m = new MethodOverride();
		System.out.println(m.add(34,67.7));
	}

}
