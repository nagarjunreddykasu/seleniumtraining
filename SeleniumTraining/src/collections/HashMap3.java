package collections;

import java.util.HashMap;

public class HashMap3 {
	public static void main(String[] args) {
		HashMap<String,String> hm=new HashMap<>();
		hm.put("username", "nagarjun.sdet@gmail.com");
		hm.put("password", "Test@321");
		
		
		System.out.println(hm.get("username"));
		
		System.out.println(hm.getOrDefault("username11","key not found"));
		
		
		
		
	}

}
