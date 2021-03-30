package collections;

import java.util.HashSet;

public class HashSet2 {
	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<>();
		hs.add("Vendor1");
		hs.add("Vendor2");
		hs.add("Vendor3");
		
		//System.out.println(hs.remove("Vendor3"));//true
		
		
		HashSet<String> hs2=new HashSet<>();
		hs2.add("Vendor1");
		hs2.add("Vendor2");
		hs2.add("Vendor3");
		hs2.add("Vendor4");
		
		System.out.println(hs.contains("Vendor1"));//true
		
		hs2.removeAll(hs);
		System.out.println(hs2);
		//System.out.println(hs);
	}

}
