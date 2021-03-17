package polymorphism;

public class Polymorphism4 {
	
	public void getAmount(double d){
		System.out.println("getAmount method with double parameter");
	}
	
	public void getAmount(float f){
		System.out.println("getAmount method with float parameter");
	}
	
	public void getAmount(short s){
		System.out.println("getAmount method with short parameter");
	}
	
	
	public static void main(String[] args) {
		Polymorphism4 obj=new Polymorphism4();
		obj.getAmount(10);//float
		obj.getAmount(10.25);//double
		obj.getAmount((byte)15);//short
		obj.getAmount((short)25);//short
		obj.getAmount(11.55f);//float
		
	}

}


// byte->short->char->int->long->float->double