package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList10 {
	public static void main(String[] args) {
		
		
		ArrayList<String> al=new ArrayList<>();
		al.add("Vendor4");
		al.add("Vendor1");
		al.add("Vendor3");
		al.add("Vendor2");
		al.add("Vendor5");
		al.add("Vendor6");
		
		
		//Retrieving objects Using for loop
		System.out.println("*** Using for loop ***");
		for(int i=0;i<al.size();i++){
			System.out.println(al.get(i));
		}
		
		System.out.println("*** Using for each loop ***");
		for(String str:al){
			System.out.println(str);
		}
		
		System.out.println("*** Using Iterator ***");
		
		Iterator<String> itr=al.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		System.out.println("*** Using ListIterator ***");
		ListIterator<String> litr=al.listIterator();
		while(litr.hasNext()){
			System.out.println(litr.next());
		}
		
	}

}


/*

Cursors:
1. Enumeration: it is applicable for only legacy classes like Vector and Stack

2. Iterator: We can get the objects for any collection implemented classes. it is also called as Universal Cursor
We can perform read and remove operations while iterating objects using Iterator.
We cannot perform addition and updation of objects using Iterator.

3. ListIterator:
We can perform read, remove, update and add operations while iterating objects using ListIterator.
It is applicable for only List implemented classes

retrieving objects from ArrayList:
 
for loop
for each loop
Cursors -> Iterator and ListIterator




*/