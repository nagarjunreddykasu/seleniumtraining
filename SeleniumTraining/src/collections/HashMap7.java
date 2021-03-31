package collections;

import java.util.HashMap;

public class HashMap7 {
	public static void main(String[] args) {
		HashMap<String,String> hm=new HashMap<>();
		hm.put("username", "nagarjun.sdet@gmail.com");
		hm.put("password", "Test@321");
		hm.put("login", "Login Button");
		hm.put("signup", "Sign Up Link");
		
		HashMap<String,String> hm2=new HashMap<>(hm);
		//hm2.putAll(hm);
		
		System.out.println(hm2);
		
	}

}
