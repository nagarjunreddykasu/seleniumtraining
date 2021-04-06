package collections;

import java.util.Hashtable;

public class Hashtable1 {
	
	public static void main(String[] args) {
		
		Hashtable<Integer,String> ht=new Hashtable<>();
		ht.put(1, "Element1");
		ht.put(2, "Element2");
		ht.put(3, "Element3");
		ht.put(4, "Element4");
		
		System.out.println(ht);
		
		ht.remove(1);
		System.out.println(ht.remove(2, "Element2"));
		System.out.println(ht);
		
		System.out.println(ht.get(3));
		System.out.println(ht.getOrDefault(5, "Key Not Found"));
		
		System.out.println(ht.contains("Element5"));//true  false
		System.out.println(ht.containsKey(5));//true
		
		System.out.println(ht.containsValue("Element5"));
	}

}
