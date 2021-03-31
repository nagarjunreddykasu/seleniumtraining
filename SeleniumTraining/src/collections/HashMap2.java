package collections;

import java.util.HashMap;

public class HashMap2 {
	public static void main(String[] args) {
		HashMap<String,String> hm=new HashMap<>();
		hm.put("username", "nagarjun.sdet@gmail.com");
		hm.put("password", "Test@321");
		
		System.out.println(hm.putIfAbsent("login", "login button"));
		
		System.out.println(hm.putIfAbsent("password", "Abc123$"));
		
		System.out.println(hm);
	}

}
