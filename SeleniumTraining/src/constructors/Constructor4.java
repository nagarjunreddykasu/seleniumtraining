package constructors;

public class Constructor4 {
	
	
	Constructor4(double l){
		System.out.println("1-arg constructor with long type");
	}
	
	Constructor4(int i){
		System.out.println("1-arg constructor with int type");
	}
	
	
	Constructor4(float f){
		System.out.println("1-arg constructor with float type");
	}
	
	public static void main(String[] args) {
		Constructor4 obj=new Constructor4(25.75f);
		
	}

}


// byte short int long
//int is default type for numerics

// byte->short->int->long->float->double