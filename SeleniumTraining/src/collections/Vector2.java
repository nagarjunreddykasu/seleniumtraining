package collections;

import java.util.ArrayList;
import java.util.Vector;

public class Vector2 {
	public static void main(String[] args) {
		ArrayList<String> v1=new ArrayList<>();
		v1.add("Vendor4");
		v1.add("Vendor1");
		v1.add("Vendor3");
		v1.add("Vendor2");
		v1.add("Vendor5");
		v1.add("Vendor6");
		
		Vector<String> v2=new Vector<>(v1);
		//v2.addAll(v1);
		System.out.println(v2);
		
		
		ArrayList<String> al2=new ArrayList<>(v2);
		System.out.println(al2);
		
	}

}
