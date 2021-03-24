package exceptionhandling;

public class ExceptionHandling1 {
	public static void main(String[] args) {
		try{
			System.out.println("Welcome");
			System.out.println(10/0);
			System.out.println("try block is completed");
		}
		catch(ArithmeticException ae){
			System.out.println("catch block is executed");
			throw ae;
		}
		
		
	}

}
