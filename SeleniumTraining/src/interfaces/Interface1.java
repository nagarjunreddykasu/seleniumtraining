package interfaces;

public interface Interface1 {
	
	int a=20;//public static final
	public abstract void click(); //abstract method
	void sendKeys();
	void getText();
	
	
	default void getWebElement(){
		System.out.println("getWebElement method from interface");
	}
	
	static void getElements(){
		System.out.println("getElements method from interface");
	}

}


/*
By default methods in interface are public and abstract.
All the variables are public final and static
It is not possible to create object for interfaces. but we can hold object to interface reference variable.
A class can implement more than once interface.



*/