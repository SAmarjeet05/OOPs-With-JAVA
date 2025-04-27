package com.amarjeet;

class Animal{
	
	private String name;
	private String type;
	
	public String getName() {
		return name;
	}
	public String getType() {
		return type;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
}

class Dog extends Animal{
	
	public void bark() {
		System.out.println("The dog is barking.");
	}
	
}

public class Inheritance {

	public static void main(String[] args) {
		Dog d = new Dog();
		Animal a = new Animal();
		
		a.setName("Labrador");
		a.setType("Dog");
		System.out.println("Assigning values from parent class---");
		System.out.printf("Name: %s\n",a.getName());
		System.out.printf("Type: %s\n",a.getType());
		
		//This cannot be used as animal class is the parent class and cannot use their childs class
		//a.bark();
		
		//Where as child can use methods and fields of the parent class
		d.setName("Labrador");
		d.setType("Dog");
		System.out.println("Assigning values from child class---");
		System.out.printf("Name: %s\n",d.getName());
		System.out.printf("Type: %s\n",d.getType());
		d.bark();
		
	}

}
