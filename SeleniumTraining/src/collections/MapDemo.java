package collections;

public class MapDemo {

}


/*

The main objective of Map interface is to represent group of objects as key value pairs.
key=value
Map contains values based on the key.
Each Key and value pair is called 'Entry'
Duplicate keys are NOT allowed.
Map is useful if you want to search, update, delete elements based on the key.



						Map(i)

HashMap(c)				ConcurrentHashMap(c)		SortedMap(i)			Hashtable(c)

LinkedHashMap(c)									NavigableMap(i)			Properties(c)

													TreeMap(c)



HashMap(c):
-----------
HashMap contains values based on the key.
HashMap does not allow duplicate keys but allows duplicate values.
HashMap allows only one null key but allows multiple null values.
Insertion order is not preserved.
Data structure is Hashtable.

LinkedHashMap(C):
------------------
HashMap contains values based on the key.
HashMap does not allow duplicate keys but allows duplicate values.
HashMap allows only one null key but allows multiple null values.
Insertion order is preserved.
Data structure is Hashtable and LinkedList.

TreeMap(c):
----------
It is same as HashMap except below two points.
Insertion is NOT preserved but it sorts the entries in ascending order based on key.
null key is not allowed


Hashtable(C):
--------------
It does not allow null key and null value
It does not accept duplicate keys
Data structure is Hashtable
Insertion order is not preserved.

Properties(c):
--------------
Properties class is child class of Hashtable
Properties object contains key and value pair as String.













*/