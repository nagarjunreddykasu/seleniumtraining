package collections;

public class CollectionDemo {

}


/*

Collection:

Collections are grow-able in nature. i.e, we can increase or decrease based on our requirement.
Collections can hold both homogeneous and heterogeneous data type elements
Collections can hold only objects but not primitives.
Every collection class is implemented based on some standard data structures, so
predefine method support available for every requirement.

 			Collection(i)
 						
 List(i)															Set(i)
 
 
List(i)

ArrayList(c)	LinkedList(c) 	Vector(c)
								
								Stack(c)
								
								
ArrayList(c):
-------------
Heterogeneous objects are allowed (different types of data)
It is possible to insert NULL objects.
Duplicate objects are allowed.
Insertion order is preserved. i.e, we can retrieve the objects in the same order which we inserted.
data structure is grow-able array.
We can retrieve the data from ArrayList by using cursors: Iterator and ListIterator.

LinkedList(c):
--------------
Heterogeneous objects are allowed (different types of data)
It is possible to insert NULL objects.
Duplicate objects are allowed.
Insertion order is preserved. i.e, we can retrieve the objects in the same order which we inserted.
data structure is double Linked list.
We can retrieve the data from LinkedList by using cursors: Iterator and ListIterator.


Vector(c):
-----------
Vector class is implemented in java 1.0 version
Heterogeneous objects are allowed (different types of data)
It is possible to insert NULL objects.
Duplicate objects are allowed.
Insertion order is preserved. i.e, we can retrieve the objects in the same order which we inserted.
data structure is resizable array.
We can retrieve the data from LinkedList by using cursors: Enumeration, Iterator and ListIterator.



					Set(i)
					
HashSet(c)						SortedSet(i)

LinkedHashSet(c)				NavigableSet(i)

								TreeSet(c)


HashSet(c):
------------
Heterogeneous objects are allowed.
Duplicate objects are NOT allowed.
NULL insertion is possible. (we can insert only one NULL object because duplicate objects are not allowed)
Data structure us HashTable
Insertion order is not preserved.
It supports only Iterator cursor to retrieve the data.

LinkedHashSet(c):
LinkedHashSet is child class of HashSet
Heterogeneous objects are allowed.
Duplicate objects are NOT allowed.
NULL insertion is possible. (we can insert only one NULL object because duplicate objects are not allowed)
Data structure is LinkedList and HashTable
Insertion order is preserved.
It supports only Iterator cursor to retrieve the data.

TreeSet(c):
------------
Heterogeneous objects are NOT allowed.
Duplicate objects are NOT allowed.
Data structure is LinkedList  and HashTable
NULL insertion is NOT possible.
Insertion order is NOT preserved but it sorts the elements in ascending order.
It supports only Iterator cursor to retrieve the data.








*/