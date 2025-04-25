package com.amarjeet;

class St{
		
	private int id;
	private String name;
	private int salary;
	
	public St(){
		id = 0;
		name = " ";
		salary = 0;
	}
	
	public St(String n, int i) {
		id = i;
		name = n;
	}
	public St(String n, int i, int s) {
		id = i;
		name = n;
		salary = s;
	}
	
	public void display() {
		System.out.printf("Id: %d, Name: %s, Salary: %d.\n",id,name,salary);
	}
	
}

public class Constructor {

	public static void main(String[] args) {
		
		St s1 = new St();
		St s2 = new St("Nitesh",45);
		St s3 = new St("Nitesh",36,60000);
		s1.display();
		s2.display();
		s3.display();
		
	}

}
