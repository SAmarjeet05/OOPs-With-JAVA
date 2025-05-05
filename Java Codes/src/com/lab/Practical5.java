package com.lab;

abstract class MyAbstract{
	
	//It contains both abstract and non abstract methods.
	public void message() {
		System.out.println("This is a method from Abstract class.");
	}
	
	abstract void add(int a,int b);
	
	
}

interface MyInterface{
	
	//It contains only abstract methods -- [abstract keyword is not necessary as it contains only abstract methods]
	void message2();
}


class MyClass extends MyAbstract implements MyInterface{

	//Both add and message2 methods are implemented by this class by inheriting these both classes
	//To inherit interface we use the keyword implements
	
	void add(int a, int b) {
		System.out.println("The sum of "+a+" and "+b+" is: "+(a+b));
	}
	
	public void message2() {
		System.out.println("This is method from Interface class.");
	}

	
}

public class Practical5 {

	public static void main(String[] args) {
		
		MyClass m = new MyClass();
		m.message();
		m.add(3, 50);
		m.message2();
		

	}

}
