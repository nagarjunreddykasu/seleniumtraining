package basics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class Reusable {
	
	public static ArrayList<String> compareArrayLists(ArrayList<String> al1,ArrayList<String> al2){
		Iterator<String> itr=al1.iterator();
		while(itr.hasNext()){
			String str=itr.next();
			if(al2.remove(str)){
				itr.remove();
			}
		}
		ArrayList<String> unmatched=new ArrayList<>();
		unmatched.addAll(al1);
		unmatched.addAll(al2);
		
		return unmatched;
	}
	
	public static HashMap<Integer,String> comparsMaps(ConcurrentHashMap<Integer,String> hm1,ConcurrentHashMap<Integer,String> hm2){
		Set<Entry<Integer, String>>  entries=hm1.entrySet();
		Iterator<Entry<Integer, String>> itr=entries.iterator();
		while(itr.hasNext()){
			Entry<Integer, String> entry=itr.next();
			if(hm2.remove(entry.getKey(),entry.getValue())){
				hm1.remove(entry.getKey());
			}
		}
		HashMap<Integer,String> unmatched=new HashMap<>();
		unmatched.putAll(hm1);
		unmatched.putAll(hm2);
		return unmatched;
	}

}
