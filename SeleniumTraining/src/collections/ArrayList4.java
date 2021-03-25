package collections;

import java.util.ArrayList;

public class ArrayList4 {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("Vendor4");
		al.add("Vendor1");
		al.add("Vendor3");
		al.add("Vendor2");
		
		System.out.println(al.isEmpty());//false
		
		System.out.println("Before clearing: "+al.size());
		
		al.clear();
		
		System.out.println("After clearing: "+al.size());
		
		System.out.println(al.isEmpty());//true
		
		System.out.println(al);
		
		
	}

}
