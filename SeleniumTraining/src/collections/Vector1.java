package collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Vector1 {
	public static void main(String[] args) {
		Vector<String> v=new Vector<>();
		v.add("Vendor4");
		v.add("Vendor1");
		v.add("Vendor3");
		v.add("Vendor2");
		v.add("Vendor5");
		v.add("Vendor6");
		
		System.out.println(v);
		
		System.out.println("*** Using Enumeration ***");
		Enumeration<String> en=v.elements();
		while(en.hasMoreElements()){
			System.out.println(en.nextElement());
		}
		
		System.out.println("*** Using for each loop ***");
		for(String str:v){
			System.out.println(str);
		}
		
		System.out.println("*** Using for loop ***");
		for(int i=0;i<v.size();i++){
			System.out.println(v.get(i));
		}
		
		System.out.println("*** Using Iterator ***");
		Iterator<String> itr=v.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		System.out.println("*** Using ListIterator ***");
		Iterator<String> litr=v.listIterator();
		while(litr.hasNext()){
			System.out.println(litr.next());
		}
		
		
	}

}
