package basics;

public class MethodsDemo9 {
	
	//instance method
	void login(Dashboard db){
		System.out.println("login method");
		System.out.println(db.a);
		db.dashboard();
	}
	
	public static void main(String[] args) {
		MethodsDemo9 obj=new MethodsDemo9();
		//Dashboard d=new Dashboard();
		obj.login(new Dashboard());
		
		
	}

}
