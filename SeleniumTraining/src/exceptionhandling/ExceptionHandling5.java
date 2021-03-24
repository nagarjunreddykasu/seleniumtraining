package exceptionhandling;

public class ExceptionHandling5 {
	public static void main(String[] args) {
		try{
			System.out.println("Welcome");
			System.out.println(10/0);
			System.out.println("try block is completed");
		}
		catch(Exception e){
			System.out.println("ArithmeticException catch block is executed");
			
			System.out.println(e.toString());
			System.out.println(e.getMessage());
			e.printStackTrace();
			
			//throw e;
		}
		finally{
			System.out.println("finally block is executed..");
		}
	}

}
