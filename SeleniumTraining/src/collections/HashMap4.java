package collections;

import java.util.HashMap;

public class HashMap4 {
	public static void main(String[] args) {
		HashMap<String,String> hm=new HashMap<>();
		hm.put("username", "nagarjun.sdet@gmail.com");
		hm.put("password", "Test@321");
		
		System.out.println(hm.remove("username11"));
		
		
		System.out.println(hm.replace("password10", "ABC123$"));
		
		System.out.println(hm.containsKey("username1"));//true
		
		System.out.println(hm.containsValue("nagarjun.sdet@gmail.com"));//true
		
		System.out.println(hm.size());//2
		
		System.out.println(hm);
		
		
	}

}
