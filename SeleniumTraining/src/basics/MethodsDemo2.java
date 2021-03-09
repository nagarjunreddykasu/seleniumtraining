package basics;

public class MethodsDemo2 {
	
	void instanceMethod(int a){
		System.out.println("instance method with int parameter "+a);
	}
	
	void instanceMethod2(int a, char ch){
		System.out.println("instance method2 with two parameters int and char: "+ a + "\t"+ch);
	}
	
	public static void main(String[] args) {
		MethodsDemo2 obj=new MethodsDemo2();
		obj.instanceMethod(200);
		
		obj.instanceMethod2(100,'K');
		
		
		
	}

}


//byte short char int long float double boolean