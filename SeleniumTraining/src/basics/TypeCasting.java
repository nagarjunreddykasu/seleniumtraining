package basics;

public class TypeCasting {
	public static void main(String[] args) {
		
		//Widening Type casting
		byte b=10;
		int i=b;
		
		char ch='A';  //65
		long l=ch;
		
		System.out.println("byte value: "+b);
		System.out.println("int value: "+i);
		System.out.println("long value: "+l);
			
		//Narrowing type casting
		double d=10.75;
		
		int in=(int)d;
		
		long ln=(long)d;
		
		System.out.println("int value: "+in);
		
		System.out.println("long value: "+ln);
		

	}

}


/*
Type Casting:
--------------
There are 2 types of type casting

1. Widening Type casting/ Implicit Type casting
Converting a lower data type into higher data type.

byte->short->char->int->long->float->double


2. Narrowing Type casting/ Explicit Type casting
Converting a higher data type into lower data type.

double->float->long->int->char->short->byte


*/