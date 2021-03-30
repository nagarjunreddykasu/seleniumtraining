package collections;

import java.util.LinkedHashSet;

public class LinkedHashSet2 {
	public static void main(String[] args) {
		LinkedHashSet<String> lhs=new LinkedHashSet<>();
		lhs.add("Vendor1");
		lhs.add("Vendor2");
		lhs.add("Vendor3");
		lhs.add("Vendor4");
		lhs.add("Vendor5");
		lhs.add("Vendor6");
		
		LinkedHashSet<String> lhs2=new LinkedHashSet<>(lhs);
		//lhs2.addAll(lhs);
		
		
		System.out.println(lhs2);
		
	}

}
