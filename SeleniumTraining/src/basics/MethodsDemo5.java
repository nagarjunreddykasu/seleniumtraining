package basics;

public class MethodsDemo5 {
	
	int a=100,b=200;
	
	void add(int a,int b){
		System.out.println(a+b); //7
		
		System.out.println(this.a+this.b);//300
	}
	
	static void multiply(int a,int b){
		System.out.println(a*b); //7
		
		//System.out.println(this.a*this.b);
	}
	
	
	public static void main(String[] args) {
		MethodsDemo5 obj=new MethodsDemo5();
		obj.add(2, 5);
		
		
	}

}
