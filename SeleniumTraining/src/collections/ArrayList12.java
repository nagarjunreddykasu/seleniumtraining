package collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayList12 {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("Vendor4");
		al.add("Vendor1");
		al.add("Vendor3");
		al.add("Vendor2");
		al.add("Vendor5");
		al.add("Vendor6");
		
		ListIterator<String> litr=al.listIterator();
		litr.add("Vendor7");
		while(litr.hasNext()){
			String str=litr.next();
			if(str.equals("Vendor3")){
				//litr.remove();
				litr.set("VENDOR-3");
			}
			System.out.println(str);
		}
		
		System.out.println(al);
		
		
		
	}

}
