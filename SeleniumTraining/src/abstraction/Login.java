package abstraction;

public class Login {
	public static void main(String[] args) {
		Encapsulation obj=new Encapsulation();
		obj.setUserName("TestUser1");
		obj.setPassword("Test@321");
		
		System.out.println(obj.getUserName());
		System.out.println(obj.getPassword());
	}

}
