package inheritance;

public class MultilevelInheritance extends Parent2{
	
	void method5(){
		System.out.println("method5 from MultilevelInheritance class");
	}
	
	void method6(){
		System.out.println("method6 from MultilevelInheritance class");
	}
	
	public static void main(String[] args) {
		
		MultilevelInheritance child=new MultilevelInheritance();
		child.method1();
		child.method2();
		child.method3();
		child.method4();
		child.method5();
		child.method6();
		
		
		Parent2 parent=new Parent2();
		parent.method1();
		parent.method2();
		parent.method3();
		parent.method4();
		
		
		Parent2 p=new MultilevelInheritance();
		p.method1();
		p.method2();
		p.method3();
		p.method4();
		
		//MultilevelInheritance ch=new Parent2();
		
		
		
	}

}


/*


*/