package basics;

public class MethodsDemo {
	int age=30;//instance variable
	
	//instance method
	void instanceMethod(){
		//instance area
		System.out.println("Instance method...");	
	}
	
	void instanceMethod2(){
		//instance area
		instanceMethod();
		System.out.println("Second instance method...");
		System.out.println("Value of age: "+age);
	}
	
	//static method
	static void staticMethod(){
		System.out.println("static method...");
	}
	
	//instance method
	void display(){
		MethodsDemo.staticMethod();
	}
	
	
	public static void main(String[] args) {
		//static area
		MethodsDemo obj=new MethodsDemo();
		//obj.instanceMethod();
		obj.instanceMethod2();
		System.out.println(obj.age);
		
		
		staticMethod();
		MethodsDemo.staticMethod();//recommended way
		
		obj.display();
		
		
		
	}

}



/*
Methods:
--------
2 types of methods

syntax:
[modifier] returntype methodname(paramlist) throws exception

1. Instance Methods



2. Static Methods



*/
