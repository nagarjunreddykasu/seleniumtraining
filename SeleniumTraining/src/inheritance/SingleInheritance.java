package inheritance;

public class SingleInheritance extends SingleParent{
	
	void method3(){
		System.out.println("method3 from child class");
	}
	void method4(){
		System.out.println("method4 from child class");
	}
	
	public static void main(String[] args) {
		
		SingleInheritance child=new SingleInheritance();
		child.method1();
		child.method2();
		child.method3();
		child.method4();
		
		
		SingleParent parent=new SingleParent();
		parent.method1();
		parent.method2();
		
		
		SingleParent p=new SingleInheritance();
		p.method1();
		p.method2();
		
		//SingleInheritance ch=new SingleParent();
		
		
	}

}
