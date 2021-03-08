package basics;

public class Variables {
	
	int b=20;//instance variable
	
	static double db=11.75;//static variable
	
	public static void main(String[] args) {
		int a=10; //local variable
		System.out.println(a);
		
		//calling instance variable
		Variables obj=new Variables();
		System.out.println(obj.b);
		
		
		//calling static variable
		System.out.println(db); //0.0
		System.out.println(Variables.db);  //recommended way of calling static members
		
		
		
		
		
		
		
		
	}
}

/*
Variables:
----------

1. Local Variables

2. Instance Variables

3. Static Variables


Object Creation:
----------------
1. named object
classname refvar=new classname();

2. nameless object:
new classname();



*/
