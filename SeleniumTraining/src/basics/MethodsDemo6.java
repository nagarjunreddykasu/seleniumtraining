package basics;

public class MethodsDemo6 {
	
	String username,password;
	
	//instance method
	void credentials(String username,String password){
		this.username=username;
		this.password=password;

	}
	
	void display(){
		System.out.println(username+"\t"+password);
	}
	
	public static void main(String[] args) {
		MethodsDemo6 obj=new MethodsDemo6();
		obj.credentials("Test User", "Test@321");
		
		obj.display();
		
		
	}

}
