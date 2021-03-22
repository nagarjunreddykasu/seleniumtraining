package strings;

public class StringsTest {
	public static void main(String[] args) {
		
		String username="TestUser";
		
		String password="Test@123";
		
		String first=new String("Selenium");
		
		System.out.println(username);
		System.out.println(password);
		System.out.println(first);
		
		
		String newvalue=username.concat(password);
		
		System.out.println(username);
		System.out.println(newvalue);
		
		
		
		
	}

}


/*

String is a sequence of characters enclosed within "".

String username="TestUser";


String is immutable class: (Not changeable)



*/