package inheritance;


class parent{
	int i;
	
	parent(int i){
		System.out.println("The value of i is: "+i);
	}
	
	void display(){
		System.out.println("This is the parent class");
	}
}



class child extends parent{
	
	String name;
	int i;
	
	child(String name,int i){
		super(i); //accessing parent class first
		System.out.println(name+""+" is the child of parent "+i);
	}

	void cdisplay() {
		System.out.println("This is child class");
	}
	
}

public class singleLevel{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child s1 = new child("Ram",3); 
		s1.display();
		s1.cdisplay();

	}

}
