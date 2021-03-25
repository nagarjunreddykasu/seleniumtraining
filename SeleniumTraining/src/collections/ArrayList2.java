package collections;
import java.util.ArrayList;

public class ArrayList2 {
	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<>();
		al.add("Vendor4");
		al.add("Vendor1");
		al.add("Vendor3");
		al.add("Vendor2");
		
		
		al.add(2, "Vendor5");
		
		System.out.println(al);
		
		
	}

}
