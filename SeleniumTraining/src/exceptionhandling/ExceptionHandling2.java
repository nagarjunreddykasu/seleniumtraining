package exceptionhandling;

public class ExceptionHandling2 {
	public static void main(String[] args) {
		try{
			System.out.println("Welcome");
			System.out.println(10/0);
			System.out.println("try block is completed");
		}
		catch(ArithmeticException ae){
			System.out.println("ArithmeticException catch block is executed");
			throw ae;
		}
		catch(NullPointerException np){
			System.out.println("NullPointerException catch block is executed");
			throw np;
		}
		catch(ArrayIndexOutOfBoundsException a){
			System.out.println("ArrayIndexOutOfBoundsException catch block is executed");
			throw a;
		}
	}

}
