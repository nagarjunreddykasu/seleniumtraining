package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList11 {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("Vendor4");
		al.add("Vendor1");
		al.add("Vendor3");
		al.add("Vendor2");
		al.add("Vendor5");
		al.add("Vendor6");
		
		
		Iterator<String> itr=al.iterator();
		while(itr.hasNext()){
			String str=itr.next();
			if(str.equals("Vendor5")){
				itr.remove();
			}
			System.out.println(str);
		}
		
		System.out.println("After removing object: "+al);
		
		
	}

}
