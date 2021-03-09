package basics;

public class MethodsDemo4 {
	
	static void staticMethod1(boolean bl){
		System.out.println("static method with one boolean parameter: "+bl);
	}
	
	
	static void staticMethod2(double d, int a){
		System.out.println("static method with two parameters double and int: "+d+"\t"+a);
	}
	
	
	
	public static void main(String[] args) {
		
		MethodsDemo4.staticMethod1(true);
		
		MethodsDemo4.staticMethod2(10.75, 25);
		
	}

}
