package collections;

import java.util.ArrayList;
import java.util.Iterator;

import basics.Reusable;

public class ArrayListComparision {
	public static void main(String[] args) throws Exception {
		ArrayList<String> al1=new ArrayList<>();
		al1.add("Vendor4");
		al1.add("Vendor1");
		al1.add("Vendor3");
		al1.add("Vendor2");
		al1.add("Vendor5");
		al1.add("Vendor6");
		//al1.add("Vendor7");
		
		
		ArrayList<String> al2=new ArrayList<>();
		al2.add("Vendor4");
		al2.add("Vendor1");
		al2.add("Vendor3");
		al2.add("Vendor2");
		al2.add("Vendor5");
		al2.add("Vendor6");
		//al2.add("Vendor8");
		
		
		/*Iterator<String> itr=al1.iterator();
		while(itr.hasNext()){
			String str=itr.next();
			if(al2.remove(str)){
				itr.remove();
			}
		}
		
		ArrayList<String> unmatched=new ArrayList<>();
		unmatched.addAll(al1);
		unmatched.addAll(al2);*/
		
		
		ArrayList<String> unmatched=Reusable.compareArrayLists(al1, al2);
		
		System.out.println("Unmatched Elements: "+unmatched);
		
		if(unmatched.size()>0){
			System.out.println("Both ArrayLists are NOT equal..."+unmatched);
			throw new Exception("Both ArrayLists are NOT equal..."+unmatched);
		}
		else{
			System.out.println("Both ArrayLists are equal...");
		}

	}

}
