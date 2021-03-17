package polymorphism;

public class Overriding extends OverideParent{
	//overriding
	public void login(){
		System.out.println("login method from child class");
	}
	
	public void display(){
		System.out.println("display method from child class");
	}
	
	/*void click(){
		System.out.println("click method from child class");
	}*/
	
	public static void main(String[] args) {
		Overriding obj=new Overriding();
		obj.login();
		
		OverideParent parent=new Overriding();
		parent.login();
		
		obj.display();
		
		
	}

}


/*
1. Overridden method signature and overriding method signature must be same.
2. Return type of overridden method and overriding method must be same.
3. Both parent and child class methods should be instance methods.
4. Access level can not be more restrictive than overridden method.
5. A method declared as private can not be overridden
6. A method declared as final can not be overridden
7. A method declared as static can not be overridden
8. Constructors can not be overridden.

private < default < protected < public

*/