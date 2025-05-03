package com.amarjeet;


class Circle{
	public int radius;
	
	Circle(int radius){
		this.radius = radius;
	}
	
	public double area() {
		return Math.PI*this.radius*this.radius;
	}
}

class Cylinder1 extends Circle{
	public int height;
	
	Cylinder1(int radius, int height){
		super(radius);
		this.height = height;
	}
	public double volume() {
		return Math.PI*this.radius*this.radius*this.height;
	}
}

public class PracticeSet4 {

	public static void main(String[] args) {
		
		Cylinder1 c = new Cylinder1(34,60);
		System.out.println("The area of the circle is: "+c.area());
		System.out.println("The volume of the circle is: "+c.volume());
	}

}
