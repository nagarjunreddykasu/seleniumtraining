package collections;

import java.util.Hashtable;

public class Hashtable3 {
	public static void main(String[] args) {
		Hashtable<Integer,String> ht1=new Hashtable<>();
		ht1.put(1, "Element1");
		ht1.put(2, "Element2");
		ht1.put(3, "Element3");
		ht1.put(4, "Element4");
		
		
		Hashtable<Integer,String> ht2=new Hashtable<>(ht1);
		//ht2.putAll(ht1);
		
		System.out.println(ht2);
		
		
	}

}
