package collections;

import java.util.HashSet;

public class HashSet1 {
	public static void main(String[] args) {
		
		HashSet<String> hs=new HashSet<>();
		hs.add("Vendor1");
		hs.add("Vendor2");
		hs.add("Vendor3");
		
		System.out.println(hs.add("Vendor1"));//false
		
		System.out.println(hs.add("Vendor4"));//true
		
		System.out.println(hs);
		
		
		
		
	}

}
