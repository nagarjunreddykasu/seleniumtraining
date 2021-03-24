package exceptionhandling;

public class ExceptionHandling7 {
	public void verifyRecords(int dbCount) throws Exception{
		int appCount=50;
		if(appCount==dbCount){
			System.out.println("Count of records from application and db are equal.");
		}
		else{
			throw new InvalidCountException("Records are NOT equal");
		}
	}
	
	public static void main(String[] args) throws Exception {
		ExceptionHandling6 obj=new ExceptionHandling6();
		obj.verifyRecords(60);
	}

}
