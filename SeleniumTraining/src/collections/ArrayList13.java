package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList13 {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("Vendor4");
		al.add("Vendor1");
		al.add("Vendor3");
		al.add("Vendor2");
		al.add("Vendor5");
		al.add("Vendor6");
		
		
		
		System.out.println("ArrayList data before sorting: ");
		for(String str:al){
			System.out.println(str);
		}
		
		
		//To sort object in ascending order
		Collections.sort(al);
		System.out.println("ArrayList data After sorting: ");
		for(String str:al){
			System.out.println(str);
		}
		
		//To sort objects in descending order
		//approach-1
		/*Collections.sort(al, Collections.reverseOrder());
		System.out.println("ArrayList data After sorting in descending order using sort method");
		for(String str:al){
			System.out.println(str);
		}*/
		
		//approach-2
		Collections.reverse(al);
		System.out.println("ArrayList data After sorting in descending order using reverse method");
		for(String str:al){
			System.out.println(str);
		}
		
		
		
	}

}
