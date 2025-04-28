package com.amarjeet;

class A{
	
	public int meth1() {
		return 1;
	}
	
	public void meth2() {
		System.out.println("This is a method of A");
	}
}

class B extends A{
	//This overrides the method defines in the parent class 
	//Note-- The return type, access modifier and the name of the methods should be same as the parent class
	@Override
	public void meth2() {
		System.out.println("This is a method of B");
	}
	
	public void meth3() {
		System.out.println("This is a method");
	}

}

public class MethodOverriding {

	public static void main(String[] args) {
		
		A a = new A();
		B b = new B();
		a.meth2();
		b.meth2();
		
	}

}
