package inheritance;


class Parent{
	int i;
	
	Parent(int i){
		System.out.println("The value of i is: "+i);
	}
	
	void display(){
		System.out.println("This is the parent class");
	}
}



class Child extends Parent{
	
	String name;
	int i;
	
	Child(String name,int i){
		super(i); //accessing parent class first
		System.out.println(name+""+" is the child of parent "+i);
	}

	void cDisplay() {
		System.out.println("This is child class");
	}
	
}

public class SingleLevel{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child s1 = new Child("Ram",3); 
		s1.display();
		s1.cDisplay();

	}

}
