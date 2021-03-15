package constructors;

public class Constructor2 {
	
	Constructor2(){
		this("TestUser","Abc@321");//calling 2-arg constructor
		//this("address1");
		System.out.println("User defined 0-arg constructor");
	}
	
	Constructor2(String username, String password){
		System.out.println("2-arg constructor");
	}
	Constructor2(String address){
		System.out.println("1-arg string constructor");
	}
	

	public static void main(String[] args) {
		Constructor2 obj=new Constructor2();
		
	}

}

/*
Constructor call must be the first statement inside another constructor.

*/