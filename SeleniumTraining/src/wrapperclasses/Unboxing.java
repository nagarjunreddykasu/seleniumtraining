package wrapperclasses;

public class Unboxing {
	public static void main(String[] args) {
		
		Integer in=new Integer(3);
		
		int intValue=in.intValue(); //converting Integer to int explicitly
		
		int j=in; //Unboxing: Converting Integer to int automatically.
		
		System.out.println(in+"\t"+intValue+"\t"+j);
		
		
		
		byte b=10;
		
		Byte byteObj=b;//autoboxing
		
		byte byteValue=byteObj;//Unboxing
		
		System.out.println(b+"\t"+byteObj+"\t"+byteValue);
		
		
	}

}
