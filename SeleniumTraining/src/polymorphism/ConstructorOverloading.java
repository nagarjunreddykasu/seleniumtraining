package polymorphism;

public class ConstructorOverloading {
	
	ConstructorOverloading(){
		System.out.println("Constructor without parameter");
	}
	
	ConstructorOverloading(String username){
		System.out.println("Constructor with one string parameter");
	}
	
	ConstructorOverloading(String username, String password){
		System.out.println("Constructor with two string parameters");
	}

	public static void main(String[] args) {
		ConstructorOverloading obj1=new ConstructorOverloading();
		
		ConstructorOverloading obj2=new ConstructorOverloading("TestUser");
		ConstructorOverloading obj3=new ConstructorOverloading("TestUser2","Abc@321");
	}

}
