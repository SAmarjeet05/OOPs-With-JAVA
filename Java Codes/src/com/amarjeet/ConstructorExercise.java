package com.amarjeet;



class Cylinder{
	private int radius;
	private int height;
	
//	public int getRadius() {
//		return radius;
//	}
//	public void setRadius(int radius) {
//		this.radius = radius;
//	}
//	public int getHeight() {
//		return height;
//	}
//	public void setHeight(int height) {
//		this.height = height;
//	}
	
	
	public Cylinder(int radius, int height) {
		this.radius = radius;
		this.height = height;
	}
	
	public double surfaceArea() {
		return 2*3.14*radius*height+2*3.24*radius*radius;
	}
	

	public double volume() {
		return 2*3.14*radius*radius*height;
	}
	
}

class Rectangle{
	
	private int length;
	private int breadth;
	
	public Rectangle() {
		length = 4;
		breadth = 5;
	}
	
	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	public int getLength() {
		return length;
	}

	public int getBreadth() {
		return breadth;
	}
	
}

public class ConstructorExercise {

	public static void main(String[] args) {
		Cylinder c = new Cylinder(13,45);
//		c.setHeight(34);
//		c.setRadius(12);
//		System.out.printf("The height of the cylinder is: %d\n",c.getHeight());
//		System.out.printf("The height of the cylinder is: %d\n",c.getRadius());
		System.out.printf("The Volume of the cylinder is: %f\n",c.volume());
		System.out.printf("The Surface Area of the cylinder is: %f\n",c.surfaceArea());
		
		Rectangle r = new Rectangle();
		Rectangle r1 = new Rectangle(45,67);
		System.out.printf("The length of the rectangle r is: %d\n",r.getLength());
		System.out.printf("The breadth of the rectangle r is: %d\n",r.getBreadth());
		System.out.printf("The length of the rectangle r1 is: %d\n",r1.getLength());
		System.out.printf("The breadth of the rectangle r1 is: %d\n",r1.getBreadth());
	}

}
