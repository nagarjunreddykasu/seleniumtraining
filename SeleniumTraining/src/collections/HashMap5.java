package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap5 {
	public static void main(String[] args) {
		HashMap<String,String> hm=new HashMap<>();
		hm.put("username", "nagarjun.sdet@gmail.com");
		hm.put("password", "Test@321");
		hm.put("login", "Login Button");
		hm.put("signup", "Sign Up Link");
		
		
		//To get all the Keys
		System.out.println("*** All the Keys ***");
		Set<String> keys=hm.keySet();
		for(String key:keys){
			System.out.println(key);
		}
		
		//To get all the values
		System.out.println("*** All the Values ***");
		Collection<String> values=hm.values();
		for(String value:values){
			System.out.println(value);
		}
		
		//To get all the entries
		System.out.println("*** All the Entries ***");
		Set<Entry<String, String>> entries=hm.entrySet();
		for(Entry<String, String> entry:entries){
			System.out.println(entry);
		}
		
	}

}
