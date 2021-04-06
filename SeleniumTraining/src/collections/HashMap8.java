package collections;

import java.util.HashMap;
import java.util.HashSet;

public class HashMap8 {
	public static void main(String[] args) {
		
		HashMap<Integer,String> hm1=new HashMap<>();
		hm1.put(1, "Vendor1");
		hm1.put(2, "Vendor2");
		hm1.put(3, "Vendor3");
		hm1.put(4, "Vendor4");
		hm1.put(5, "Vendor5");
		
		
		HashMap<Integer,String> hm2=new HashMap<>();
		hm2.put(4, "Vendor4");
		hm2.put(1, "Vendor1");
		hm2.put(2, "Vendor2");
		hm2.put(5, "Vendor5");
		hm2.put(3, "Vendor3");
		
		//To verify two HashMaps are equal or not
		System.out.println(hm1.equals(hm2));
		
		//To verify whether all the keys from both HashMaps are equal or not.
		System.out.println(hm1.keySet().equals(hm2.keySet()));
		
		//To retrieve unmatched keys from first HashMap after comparing with second HashMap
		HashSet<Integer> hs=new HashSet<>();
		hs.addAll(hm1.keySet());//12345
		hs.addAll(hm2.keySet()); //41256
		
		//hs contains 123456
		//hs.removeAll(hm2.keySet()); //removing hm2 keys 41256
		//System.out.println("Unmatched Key from hm1: "+hs);
		
		
		//To retrieve unmatched keys from second HashMap after comparing with first HashMap
		hs.removeAll(hm1.keySet()); // removing hm1 keys 12345
		System.out.println("Unmatched Key from hm2: "+hs);
		
		
		//To verify whether all the entries from both HashMaps are equal or not
		System.out.println(hm1.entrySet().equals(hm2.entrySet()));
		
		
		System.out.println(hm1.values().containsAll(hm2.values()));
		System.out.println(hm2.values().containsAll(hm1.values()));
		
		
		
	}

}
