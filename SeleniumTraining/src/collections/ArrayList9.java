package collections;

import java.util.ArrayList;

public class ArrayList9 {
	public static void main(String[] args) {
		
		/*ArrayList<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(15);
		al.add(20);
		System.out.println(al);*/
		
		Vendor v1=new Vendor(101,"Vendor1");
		Vendor v2=new Vendor(102,"Vendor2");
		Vendor v3=new Vendor(103,"Vendor3");
		
		ArrayList<Vendor> al=new ArrayList<>();
		al.add(v1);
		al.add(v2);
		al.add(v3);
		
		ArrayList<Vendor> al2=new ArrayList<>(al);
		//al2.addAll(al);
		System.out.println(al2.size());
		
		System.out.println(al2.contains(v1));//true
		
		System.out.println(al2.containsAll(al));//true
		
		System.out.println("Before removing object"+ al2.size());//3
		al2.remove(v1);
		System.out.println("After removing object"+ al2.size());//2
		System.out.println(al.size());
		
		System.out.println(al2.removeAll(al));
		
	}

}


class Vendor{
	int vendorId;
	String vendorName;
	Vendor(int vendorId,String vendorName){
		this.vendorId=vendorId;
		this.vendorName=vendorName;
	}
}