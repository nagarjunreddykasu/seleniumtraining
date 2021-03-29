package basics;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedList1 {
	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<>();
		ll.add("Vendor4");
		ll.add("Vendor1");
		ll.add("Vendor3");
		ll.add("Vendor2");
		ll.add("Vendor5");
		ll.add("Vendor6");
		ll.add("Vendor6");
		ll.add(null);
		
		//System.out.println(ll);
		
		ll.addFirst("Vendor7");
		ll.addLast("Vendor8");
		
		ll.add(1, "Vendor9");
		
		
		System.out.println(ll);
		
		ll.removeFirst();
		ll.removeLast();
		
		ll.remove("Vendor2");
		ll.remove(1);
		System.out.println(ll);
		
		System.out.println(ll.get(2));
		
		ll.set(2, "VENDOR");
		System.out.println(ll);
		
	}

}
