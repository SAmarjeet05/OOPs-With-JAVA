package com.amarjeet;


interface Bike{
	
	//In interfaces all the variable that are declared are final and cannot be changed
	int a = 45;
	void applyBrakes(int decrement);
	void applyAcceleration(int increment);
}

class Yamaha implements Bike{
	
	int speed = 90;
	
	void currentSpeed() {
		System.out.println("Current speed: "+speed);
	}
	
	//All the methods that were implemented needs to be declared public
	public void applyBrakes(int decrement) {
		System.out.println("Reducing speed by: "+decrement);
		speed-=decrement;
	}
	public void applyAcceleration(int increment) {
		System.out.println("Increasing speed by: "+increment);
		speed+=increment;
	}
	void blowHorn() {
		System.out.println("Blowing Horn.....");
	}
	
}


public class Interfaces {

	public static void main(String[] args) {

		Yamaha y = new Yamaha();
		//y.a = 56; -- cannot do this as it is a final variable
		y.currentSpeed();
		y.applyAcceleration(20);
		y.blowHorn();
		y.applyBrakes(30);
		y.currentSpeed();
		
	}

}
