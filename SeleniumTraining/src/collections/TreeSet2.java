package collections;

import java.util.TreeSet;

public class TreeSet2 {
	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<>();
		ts.add("Vendor4");
		ts.add("Vendor1");
		ts.add("Vendor3");
		ts.add("Vendor2");
		ts.add("Vendor6");
		ts.add("Vendor5");
		
		//ts.clear();
		
		System.out.println(ts.contains("Vendor2"));
		
		//System.out.println(ts);
		
		System.out.println(ts.first()); //Vendor1
		System.out.println(ts.last());//Vendor6
		
		System.out.println(ts.lower("Vendor3"));//Vendor2
		System.out.println(ts.higher("Vendor3"));//Vendor4
		
		System.out.println(ts.headSet("Vendor4"));
		
		System.out.println(ts.subSet("Vendor1", "Vendor4"));
		
		System.out.println(ts.tailSet("Vendor3"));
		
		//ts.remove("Vendor1");
		
		System.out.println(ts);
		//[Vendor1, Vendor2, Vendor3, Vendor4, Vendor5, Vendor6]
		
		System.out.println(ts.pollFirst());
		System.out.println(ts.pollLast());
		System.out.println(ts);
		
		System.out.println(ts.size());//4
	}

}


/*
Methods in TreeSet class:
1. add(Object o): Adds the specified element to this set if it is not already present.
2.  addAll(Collection c):Adds all of the elements in the specified collection to this set.
3. clear(): Removes all of the elements from this set.
4. contains(Object o): Returns true if this set contains the specified element.
5. first(): Returns the first (lowest) element currently in this sorted set.
6. last(): Returns the last (highest) element currently in this sorted set.
7. lower(E): it prints lower object of specified object
8. higher(E): it prints higher object of specified object
9. headSet(Object toElement): Returns a view of the portion of this set whose elements are strictly less than toElement.
10. subSet(Object fromElement, Object toElement): Returns a view of the portion of this set whose elements range from fromElement, inclusive, to toElement, exclusive.
11. tailSet(Object fromElement): Returns a view of the portion of this set whose elements are greater than or equal to fromElement.
12. remove(Object o): Removes the specified element from this set if it is present.
13. pollFirst(): Returns the first element and remove it.
14. pollLast(): Returns the last element and remove it.
15. size(): Returns the number of elements in this set.

*/