package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList3 {
	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<>();
		ll.add("Vendor4");
		ll.add("Vendor1");
		ll.add("Vendor3");
		ll.add("Vendor2");
		ll.add("Vendor5");
		ll.add("Vendor6");
		
		System.out.println("*** Using for each loop ***");
		for(String str:ll){
			System.out.println(str);
		}
		
		
		System.out.println("*** Using for loop ***");
		for(int i=0;i<ll.size();i++){
			System.out.println(ll.get(i));
		}
		
		System.out.println("*** Using Iterator ***");
		Iterator<String> itr=ll.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		System.out.println("*** Using ListIterator ***");
		Iterator<String> litr=ll.listIterator();
		while(litr.hasNext()){
			System.out.println(litr.next());
		}
		
		
	}

}
