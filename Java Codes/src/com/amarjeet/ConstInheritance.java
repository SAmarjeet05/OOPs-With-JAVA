package com.amarjeet;


class Base{
	Base(){
			System.out.println("This is the default constructor of Base class");
	}
	Base(int a){
		System.out.printf("The value of a is: %d\n",a);
	}
}

class Derived extends Base{
	Derived(){
		System.out.println("This is the default constructor of Derived class");
	}
	Derived(int a, int b){
		super(a);
		System.out.printf("The value of b is: %d\n",b);
	}
}

class GrandChild extends Derived{
	GrandChild(){
		System.out.println("This is the default constructor of grandchild class");
	}
	GrandChild(int a, int b, int c){
		super(a,b);
		System.out.printf("The value of c is: %d\n",c);
	}
}

public class ConstInheritance {

	public static void main(String[] args) {
		
		GrandChild g = new GrandChild(12,13,14);
		
	}

}
