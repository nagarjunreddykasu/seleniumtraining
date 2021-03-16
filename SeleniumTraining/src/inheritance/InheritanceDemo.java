package inheritance;

public class InheritanceDemo extends InheritanceParent{
	
	//instance variables
	String username="InstanceUser",password="InstancePassword";
	
	//overriding
	void display(){
		System.out.println("child class display method");
		
	}
	
	void login(String username,String password){ //local variables
		System.out.println(username+"\t"+password);
		System.out.println(this.username+"\t"+this.password);
		System.out.println(super.username+"\t"+super.password);
		
		display();
		super.display();
	}
	
	public static void main(String[] args) {
		InheritanceDemo obj=new InheritanceDemo();
		obj.login("LocalUser", "LocalPassword");
		
		
	}
	
	

}
