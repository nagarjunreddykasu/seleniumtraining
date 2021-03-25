package collections;

import java.util.ArrayList;

public class ArrayList5 {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("Vendor4");
		al.add("Vendor1");
		al.add("Vendor3");
		al.add("Vendor2");
		
		
		//al.set(1, "VENDOR-01");
		
		System.out.println(al);
		
		System.out.println("Index is "+al.indexOf("Vendor2"));
		
		
		System.out.println(al.get(2));
		
		System.out.println(al.contains("Vendor2"));//true
		
		ArrayList<String> al2=new ArrayList<>();
		al2.add("Vendor4");
		al2.add("Vendor1");
		al2.add("Vendor3");
		al2.add("Vendor2");
		
		System.out.println(al.containsAll(al2));
		
		
		
	}

}
