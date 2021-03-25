package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayList7 {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("Vendor4");
		al.add("Vendor1");
		al.add("Vendor3");
		al.add("Vendor2");
		al.add("Vendor5");
		al.add("Vendor6");
		
		
		List<String> list=al.subList(1, 4);
		System.out.println(list);
		
		
		ArrayList<String> al2=new ArrayList<>(al.subList(1, 4));
		System.out.println(al2);
		
		
		
	}

}
