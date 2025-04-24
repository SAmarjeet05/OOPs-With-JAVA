package com.amarjeet;


//creating class and examining how it functions
class Employee {
	int id;
	String name;
	public void display() {
		System.out.printf("Id: %d\n",id);
		System.out.printf("Name: %s",name);
	}
	
}

public class CustomClass {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.id = 34;
		e1.name = "Nitesh";
		e1.display();
	}
}
