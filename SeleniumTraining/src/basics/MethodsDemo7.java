package basics;

public class MethodsDemo7 {
	
	
	
	int add(int a,int b){
		int sum=a+b;
		return sum;
	}
	
	static boolean isDisplayed(){
		MethodsDemo7 obj=new MethodsDemo7();
		obj.add(10, 20);
		
		return true;
	}
	
	public static void main(String[] args) {
		MethodsDemo7 obj=new MethodsDemo7();
		int result=obj.add(15, 20);
		
		System.out.println(result); //35
		
		boolean bl=MethodsDemo7.isDisplayed();
		System.out.println(bl); //true
		
		System.out.println(obj.add(15, 20));
		System.out.println(MethodsDemo7.isDisplayed());
		
		
		
		
	}
	
	

}
