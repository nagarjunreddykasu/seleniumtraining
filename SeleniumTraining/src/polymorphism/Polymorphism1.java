package polymorphism;

public class Polymorphism1 {
	//instance methods
	void click(){
		System.out.println("click method without parameters");
	}
	
	void click(String str){
		System.out.println("click method with one string parameter: "+str);
	}
	
	void click(String str1, String str2){
		System.out.println("click method with two string parameters: "+str1+"\t"+str2);
	}
	
	
	public static void main(String[] args) {
		Polymorphism1 obj=new Polymorphism1();
		obj.click();
		obj.click("username");
		obj.click("nagarjun.sdet@gmail.com", "Test@123");
		
		
	}

}
