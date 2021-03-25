package collections;

import java.util.ArrayList;

public class ArrayList3 {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("Vendor4");
		al.add("Vendor1");
		al.add("Vendor3");
		al.add("Vendor2");
		
		ArrayList<String> al2=new ArrayList<>();
		
		//al2.addAll(al);
		al2.add("Vendor6");
		
		al2.addAll(0, al);
		
		System.out.println(al2);
		
	}

}
