package polymorphism;

public class MethodsChild extends MethodsParent{
	//overriding method
	void login(){
		System.out.println("login method from child class");
	}
	
	void click(){
		login();//calling current/child class login method
		super.login();//calling parent class login method
	}
	
	
	public static void main(String[] args) {
		
		new MethodsChild().click();
		
	}

}


//this and super keywords can be used in instance methods only.