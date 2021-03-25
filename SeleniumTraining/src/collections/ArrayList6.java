package collections;

import java.util.ArrayList;

public class ArrayList6 {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("Vendor4");
		al.add("Vendor1");
		al.add("Vendor3");
		al.add("Vendor2");
		
		
		ArrayList<String> al2=new ArrayList<>();
		al2.add("Vendor4");
		al2.add("Vendor1");
		
		al.retainAll(al2);
		// It is used to remove all the elements that are NOT contained in specified collection/arraylist.
		
		System.out.println(al);

	}

}
