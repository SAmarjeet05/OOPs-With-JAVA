package com.lab;

class Person{
	int age;
	String name;
	Person(String n, int a){
		name = n;
		age = a;
	}
}

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




public class Practical3 {

	public static void main(String[] args) {

		Person p1 = new Person("Nitesh",23);
		System.out.printf("Name: %s, Age: %d\n",p1.name,p1.age );

		Person2 p2 = new Person2();
		p2.setter("Nitesh", 34, "India");
		p2.getter();
	}

}
