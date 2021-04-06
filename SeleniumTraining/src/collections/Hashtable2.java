package collections;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Hashtable2 {
	public static void main(String[] args) {
		Hashtable<Integer,String> ht=new Hashtable<>();
		ht.put(1, "Element1");
		ht.put(2, "Element2");
		ht.put(3, "Element3");
		ht.put(4, "Element4");
		
		System.out.println(ht.keySet());
		
		System.out.println("*** Keys using Enumeration *** ");
		Enumeration<Integer> keys=ht.keys();
		while(keys.hasMoreElements()){
			System.out.println(keys.nextElement());
		}
		
		System.out.println(ht.values());
		System.out.println("*** Values using Enumeration ***");
		Enumeration<String> el=ht.elements();
		while(el.hasMoreElements()){
			System.out.println(el.nextElement());
		}
		
		System.out.println("*** Keys and Values using Iterator ***");
		Set<Entry<Integer, String>>  entries=ht.entrySet();
		Iterator<Entry<Integer, String>>  itr=entries.iterator();
		while(itr.hasNext()){
			Entry<Integer, String> entry=itr.next();
			//System.out.println(entry);
			System.out.println(entry.getKey()+"\t"+entry.getValue());
			
		}
		System.out.println("*** Keys and Values using for each loop ***");
		for(Entry<Integer,String> ent:entries){
			System.out.println(ent.getKey()+"\t"+ent.getValue());
		}
		
		
	}

}
