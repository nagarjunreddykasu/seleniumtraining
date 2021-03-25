package collections;

import java.util.ArrayList;

public class ArrayList8 {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("Vendor4");
		al.add("Vendor1");
		al.add("Vendor3");
		al.add("Vendor2");
		al.add("Vendor5");
		al.add("Vendor6");
		
		/*String value=al.remove(1);
		System.out.println("Removed element: "+value);
		System.out.println("After removing element: "+al);
		
		System.out.println(al.remove("Vendor2"));//true
		System.out.println(al);*/
		ArrayList<String> al2=new ArrayList<>();
		al2.add("Vendor4");
		al2.add("Vendor1");
		al.removeAll(al2);
		
		System.out.println(al);
	}

}


/*
for loop
for each loop
cursors (Iterator and ListIterator)


*/