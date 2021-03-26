package collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList14 {
	public static void main(String[] args) {
		
		String expectedData="element1,element2,element4,element3";
		
		String[] arr=expectedData.split(",");
		
		//String[] arr={"element1","element2","element4","element3"};
		
		//To convert String array to ArrayList
	
		ArrayList<String> al=new ArrayList<>(Arrays.asList(arr));
		System.out.println(al);
		
		
	}

}
