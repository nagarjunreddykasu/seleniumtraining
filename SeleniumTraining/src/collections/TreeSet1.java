package collections;

import java.util.TreeSet;

public class TreeSet1 {
	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<>();
		ts.add("Vendor4");
		ts.add("Vendor1");
		ts.add("Vendor3");
		ts.add("Vendor2");
		ts.add("Vendor6");
		ts.add("Vendor5");
		ts.add("Vendor5");
		
		System.out.println(ts);
		
		TreeSet<String> ts2=new TreeSet<>(ts);
		//ts2.addAll(ts);
		
		System.out.println(ts2);
		
	}

}
