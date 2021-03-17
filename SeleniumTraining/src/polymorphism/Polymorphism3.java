package polymorphism;

public class Polymorphism3 {
	
	public void getInfo(String username, int age){
		System.out.println("getInfo method with two parameters string and int");
	}
	
	public void getInfo(int age, String username){
		System.out.println("getInfo method with two parameters int and String");
	}

	public static void main(String[] args) {
		Polymorphism3 obj=new Polymorphism3();
		obj.getInfo("TestUser", 30);
		obj.getInfo(32, "TestUser2");
		
	}

}
