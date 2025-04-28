package com.amarjeet;

class Phone{
	
	public void showTime() {
		System.out.println("Time is 11am");
	}
	
	public void on() {
		System.out.println("Turning on Phone....");
	}
	
}

class Smartphone extends Phone{
	
	public void music() {
		System.out.println("Playing music.....");
	}
	
	@Override
	public void on() {
		System.out.println("Turning on Phone....");
	}
	
}

public class DynMethDispatch {

	public static void main(String[] args) {
		
		Phone nokia = new Phone();//Using this we can only access the phone class
		
		nokia.showTime();
		nokia.on();
		
		Smartphone vivo = new Smartphone();//using this we can access both the phone and smartphone class
		
		vivo.on(); //  this will execute the on method of Smartphone class as it has been overrided
		vivo.showTime();
		vivo.music();
		
		Phone motorola = new Smartphone();//Using this we can access the phone class and the overrides methods from the smartphone class

		motorola.showTime();
		motorola.on();
		//motorola.music();  (We cannot access this method from a Phone reference object)
		
		//	Smartphone obj = new Phone(); (This is not allowed)
	}

}
