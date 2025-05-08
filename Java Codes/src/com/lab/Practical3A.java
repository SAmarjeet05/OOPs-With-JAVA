package com.lab;

class Person{
	int age;
	String name;
	Person(String n, int a){
		name = n;
		age = a;
	}
}


public class Practical3A {

	public static void main(String[] args) {

		Person p1 = new Person("Nitesh",23);
		Person p2 = new Person("Ajay",30);
		System.out.printf("Name: %s, Age: %d\n",p1.name,p1.age );
		System.out.printf("Name: %s, Age: %d\n",p2.name,p2.age );

	}

}
