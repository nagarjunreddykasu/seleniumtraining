package collections;

import java.util.Collection;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class TreeMap2 {
	public static void main(String[] args) {
		TreeMap<Integer,String> tm1=new TreeMap<>();
		tm1.put(3, "Vendor3");
		tm1.put(1, "Vendor1");
		tm1.put(2, "Vendor2");
		tm1.put(5, "Vendor5");
		tm1.put(4, "Vendor4");

		TreeMap<Integer,String> tm2=new TreeMap<>(tm1);
		//tm2.putAll(tm1);

		System.out.println(tm2);

		//To get all the Keys
		System.out.println("*** All the Keys ***");
		Set<Integer> keys=tm1.keySet();
		for(Integer key:keys){
			System.out.println(key);
		}

		//To get all the values
		System.out.println("*** All the Values ***");
		Collection<String> values=tm1.values();
		for(String value:values){
			System.out.println(value);
		}

		//To get all the entries
		System.out.println("*** All the Entries ***");
		Set<Entry<Integer, String>> entries=tm1.entrySet();
		for(Entry<Integer, String> entry:entries){
			System.out.println(entry);
		}

	}

}
