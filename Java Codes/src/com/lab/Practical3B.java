package com.lab;


class Person2{
	private String name;
	private int age;
	private String country;
	
	//Getter and setter for name
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	//Getter and setter for name
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
		
	//Getter and setter for name
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCountry() {
		return country;
	}
}


public class Practical3B {

	public static void main(String[] args) {

		Person2 p = new Person2();
		p.setName("Nitesh");
		p.setAge(23);
		p.setCountry("India");
		
		System.out.println("Name: "+p.getName());
		System.out.println("Age: "+p.getAge());
		System.out.println("Country: "+p.getCountry());
	}

}
