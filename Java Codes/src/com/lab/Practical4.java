package com.lab;


class GrandParent{
	String property = "This is the property of GrandParent's class";
	void grandParentProperty() {
		System.out.println(property);
	}
}


class Parent extends GrandParent{
	String property = "This is the property of Parent's class";
	void parentProperty() {
		System.out.println(property);
	}
}

class Child extends Parent{
	String property = "This is the property of Child's class";
	void childProperty() {
		System.out.println(property);
	}
}


public class Practical4 {

	public static void main(String[] args) {
		
		//SINGLE INHERITANCE
		Parent p = new Parent(); //this object has the access to both the grandparent and its own property
		
		System.out.println("Showing Single Inheritance");
		p.grandParentProperty();
		p.parentProperty();
		

		
		//MULTIPLE INHERITANCE
		Child c = new Child(); //this object has the access to the grandparent, parent and its own property
		
		System.out.println("Showing Multiple Inheritance");
		c.grandParentProperty();
		c.parentProperty();
		c.childProperty();
		

	}

}
