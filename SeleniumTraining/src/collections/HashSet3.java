package collections;

import java.util.HashSet;

public class HashSet3 {
	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<>();
		hs.add("Vendor1");
		hs.add("Vendor2");
		hs.add("Vendor3");
		
		HashSet<String> hs2=new HashSet<>(hs);
		//hs2.addAll(hs);
		System.out.println(hs2);
	}

}
