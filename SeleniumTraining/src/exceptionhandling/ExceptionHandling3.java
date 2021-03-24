package exceptionhandling;

public class ExceptionHandling3 {
	public static void main(String[] args) {
		try{
			System.out.println("Welcome");
			System.out.println(10/0);
			System.out.println("try block is completed");
		}
		catch(ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException e){
			System.out.println("ArithmeticException catch block is executed");
			throw e;
		}
	}

}
