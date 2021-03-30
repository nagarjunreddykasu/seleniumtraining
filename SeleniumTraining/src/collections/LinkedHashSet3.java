package collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet3 {
	public static void main(String[] args) {
		LinkedHashSet<String> lhs=new LinkedHashSet<>();
		lhs.add("Vendor1");
		lhs.add("Vendor2");
		lhs.add("Vendor3");
		lhs.add("Vendor4");
		lhs.add("Vendor5");
		lhs.add("Vendor6");
		
		
		System.out.println("*** Using Iterator ***");
		Iterator<String> itr=lhs.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		System.out.println("*** Using for each ***");
		for(String str:lhs){
			System.out.println(str);
		}
		
		
	}

}
