package basics;

// Method with user defined class object as return type
public class MethodsDemo8 {
	
	//instance method
	Dashboard login(){
		int a=25;
		return new Dashboard();
	}
	
	public static void main(String[] args) {
		MethodsDemo8 obj=new MethodsDemo8();
		
		Dashboard d=obj.login();
		
		System.out.println(d.a); //10
		d.dashboard();//method from dashboard class
		
		
		
	}

}
