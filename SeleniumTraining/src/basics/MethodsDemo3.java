package basics;

public class MethodsDemo3 {
	
	
	void add(int a){
		System.out.println("add method with one parameter");
	}
	
	void add(int a,int b){
		System.out.println("add method with two parameters");
	}
	
	public static void main(String[] args) {
		MethodsDemo3 obj=new MethodsDemo3();
		
		obj.add(15);
		
		obj.add(20, 30);
		
		
		
	}

}
