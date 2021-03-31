package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap6 {
	public static void main(String[] args) {
		HashMap<String,String> hm=new HashMap<>();
		hm.put("username", "nagarjun.sdet@gmail.com");
		hm.put("password", "Test@321");
		hm.put("login", "Login Button");
		hm.put("signup", "Sign Up Link");
		
		Set<Entry<String, String>>  entries=hm.entrySet();
		Iterator<Entry<String, String>> itr=entries.iterator();
		
		System.out.println("*** Retrieving Key values using Iterator ***");
		while(itr.hasNext()){
			Entry<String, String> entry=itr.next();
			//System.out.println(entry); //key=value
			System.out.println(entry.getKey()+"\t"+entry.getValue());
			//key value
		}
		
		
		System.out.println("*** Retrieving Key values using for each loop ***");
		for(Entry<String, String> entry: hm.entrySet()){
			System.out.println(entry.getKey()+"\t"+entry.getValue());
			
		}
		
	}

}
