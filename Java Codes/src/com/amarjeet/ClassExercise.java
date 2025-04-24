package com.amarjeet;


class Employee{
	int salary;
	String name;
	public int getSalary() {
		return salary;
	}
	public String getName() {
		return name;
	}
	public void setSalary(int a){
		salary = a;
	}
	public void setName(String a){
		name = a;
	}
	
}

class Cellphone{
	
	public void ring() {
		System.out.println("Phone is ringing...");
	}
	public void vibrate() {
		System.out.println("Phone is vibrate...");
	}
}


class Square{
	int side;
	public void setSide(int a) {
		side = a;
	}
	
	public int area() {
		return side*side; 
	}
	
	public int perimeter() {
		return 4*side; 
	}
}

public class ClassExercise {

	public static void main(String[] args) {

		Employee e1 = new Employee();
		e1.setName("Harish");
		e1.setSalary(50000);
		System.out.println(e1.getName());
		System.out.println(e1.getSalary());
		
		
		Cellphone m1 = new Cellphone();
		m1.ring();
		m1.vibrate();
		
		
		Square s1 = new Square();
		s1.setSide(45);
		System.out.printf("The area of the square is: %d\n",s1.area());
		System.out.printf("The perimeter of the square is: %d",s1.perimeter());
	}

}
