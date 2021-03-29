package basics;

import java.util.ArrayList;
import java.util.Iterator;

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

}
