package com.amarjeet;

//An abstract class contains both abstract and non abstract methods
abstract class Parent1{
	
	public void message() {
		System.out.println("This is a method of parent class.");
	}
	
	abstract public void greeting();
	
}

//A class that extends an abstract class must define all the abstract methods of that class or else it should be also declared as abstract class
class Child1 extends Parent1{
	
	public void greeting() {
		System.out.println("Good Morning.");
	}
}

class Child2 extends Parent1{
	
	public void greeting() {
		System.out.println("Hello.");
	}
}



public class AbstractMethods {

	public static void main(String[] args) {

		//Parent1 p = new Parent1(); //Object of an abstract class can only be created if it implements all the abstract method of the extended class
		Child2 c = new Child2();
		Child1 c1 = new Child1();
		c.greeting();
		c1.greeting();
	}

}
