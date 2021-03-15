package constructors;

public class Constructor3 {
	//instance variables
	String username,password;
	
	Constructor3(String username,String password){
	/*	username=user;
		password=pwd;*/
		this.username=username;
		this.password=password;
		
	}
	
	//instance method
	void display(){
		System.out.println(username+"---"+password);
	}
	
	
	
	
	public static void main(String[] args) {
		
		Constructor3 obj=new Constructor3("TestUser","Abc@123");
		
		obj.display();
		
	}

}
