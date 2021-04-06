package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import basics.Reusable;

public class HashMap9 {
	public static void main(String[] args) throws Exception {
		ConcurrentHashMap<Integer,String> hm1=new ConcurrentHashMap<>();
		hm1.put(1, "Vendor1");
		hm1.put(2, "Vendor2");
		hm1.put(3, "Vendor3");
		hm1.put(4, "Vendor4");
		hm1.put(5, "Vendor5");
		
		
		ConcurrentHashMap<Integer,String> hm2=new ConcurrentHashMap<>();
		hm2.put(4, "Vendor4");
		hm2.put(1, "Vendor1");
		hm2.put(2, "Vendor2");
		hm2.put(5, "Vendor5");
		hm2.put(3, "Vendor3");
		
		
		/*Set<Entry<Integer, String>>  entries=hm1.entrySet();
		Iterator<Entry<Integer, String>> itr=entries.iterator();
		while(itr.hasNext()){
			Entry<Integer, String> entry=itr.next();
			if(hm2.remove(entry.getKey(),entry.getValue())){
				hm1.remove(entry.getKey());
			}
		}
		
		
		HashMap<Integer,String> unmatched=new HashMap<>();
		unmatched.putAll(hm1);
		unmatched.putAll(hm2);*/
		
		HashMap<Integer, String> unmatched=Reusable.comparsMaps(hm1, hm2);
		if(unmatched.size()>0){
			System.out.println("There are unmatched entries.."+unmatched);
			throw new Exception("There are unmatched entries.."+unmatched);
		}
		else{
			System.out.println("Both HashMaps are Equal...");
		}
		
		System.out.println(unmatched);
		System.out.println(hm1);
		System.out.println(hm2);
		
		
	}

}
