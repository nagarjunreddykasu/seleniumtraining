package collections;

import java.util.LinkedList;

public class LinkedList2 {
	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<>();
		ll.add("Vendor4");
		ll.add("Vendor1");
		ll.add("Vendor3");
		ll.add("Vendor2");
		ll.add("Vendor5");
		ll.add("Vendor6");
		ll.add("Vendor6");
		
		LinkedList<String> ll2=new LinkedList<>(ll);
		//ll2.addAll(ll);
		System.out.println(ll2);
	}

}
