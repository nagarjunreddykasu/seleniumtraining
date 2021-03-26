package collections;

import java.util.ArrayList;

public class ArrayList15 {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("Vendor4");
		al.add("Vendor1");
		al.add("Vendor3");
		al.add("Vendor2");
		al.add("Vendor5");
		al.add("Vendor6");
		
		//To convert ArrayList to String array
		String[] arr=new String[al.size()];
		al.toArray(arr);
		
		for(String str:arr){
			System.out.println(str);
		}
		
	}

}
