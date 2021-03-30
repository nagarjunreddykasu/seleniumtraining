package collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet4 {
	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<>();
		hs.add("Vendor1");
		hs.add("Vendor2");
		hs.add("Vendor3");
		hs.add("Vendor4");
		hs.add("Vendor5");
		hs.add("Vendor6");
		
		System.out.println("*** Using Iterator ***");
		Iterator<String> itr=hs.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
	}

}
