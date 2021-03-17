package polymorphism;

public class Polymorphism2 {

	public void getAmount(int a){
		System.out.println("getAmount method with one int parameter: "+a);
	}
	public void getAmount(float f){
		System.out.println("getAmount method with one float parameter: "+f);
	}
	public void getAmount(double d){
		System.out.println("getAmount method with double parameter: "+d);
	}


	public static void main(String[] args) {
		
		Polymorphism2 obj=new Polymorphism2();
		obj.getAmount(200);
		obj.getAmount(10.85f);
		obj.getAmount(9.75);

	}

}
