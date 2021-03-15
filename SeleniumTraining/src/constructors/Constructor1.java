package constructors;

public class Constructor1 {
	//0-arg constructor
	Constructor1(){
		System.out.println("0-arg constructor");
	}
	
	//parameterized constructor
	Constructor1(int a){
		System.out.println("1-arg constructor with int parameter "+a);
	}
	
	Constructor1(String str){
		System.out.println("1-arg constructor with String parameter "+str);
	}
	
	Constructor1(boolean b, double d){
		System.out.println("2-arg constructor with boolean and double parameters "+b+"\t"+d);
	}
	
	public static void main(String[] args) {
		Constructor1 obj=new Constructor1();
		
		Constructor1 obj2=new Constructor1(25);
		Constructor1 obj3=new Constructor1(true,13.75);
		
	}

}

/*
Constructors:
1. Default constructors
2. User defined constructors
	i. 0-arg constructor
	ii. parameterized constructors

Constructor name and classname must be same.
It is possible to provide parameters.
Return type concept is not applicable for constructors.
public, private, protected, default modifiers are applicable for constructor.

 
 */
