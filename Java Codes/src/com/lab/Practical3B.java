package com.lab;


class Person2{
	private int age;
	private String name;
	private String country;
	
	public void getter() {
		System.out.printf("Name: %s, Age: %d, Country: %s",name,age,country);
	}
	public void setter(String n, int a, String c) {
		name = n;
		age = a;
		country = c;
	}
}


public class Practical3B {

	public static void main(String[] args) {

		Person2 p2 = new Person2();
		p2.setter("Nitesh", 34, "India");
		p2.getter();

	}

}
