package basics;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Map.Entry;

public class LinkedHashMap1 {
	public static void main(String[] args) {
		LinkedHashMap<Integer,String> hm=new LinkedHashMap<>();
		hm.put(1, "Vendor1");
		hm.put(2, "Vendor2");
		hm.put(3, "Vendor3");
		hm.put(4, "Vendor4");
		hm.put(5, "Vendor5");


		System.out.println(hm);

		//To get all the Keys
		System.out.println("*** All the Keys ***");
		Set<Integer> keys=hm.keySet();
		for(Integer key:keys){
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
		Set<Entry<Integer, String>> entries=hm.entrySet();
		for(Entry<Integer, String> entry:entries){
			System.out.println(entry);
		}

	}

}
