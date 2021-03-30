package collections;

import java.util.LinkedHashSet;

public class LinkedHashSet1 {
	public static void main(String[] args) {
		LinkedHashSet<String> lhs=new LinkedHashSet<>();
		lhs.add("Vendor1");
		lhs.add("Vendor2");
		lhs.add("Vendor3");
		lhs.add("Vendor4");
		lhs.add("Vendor5");
		lhs.add("Vendor6");
		lhs.add(null);
		lhs.add(null);
		
		
		System.out.println(lhs);
		
	}

}
