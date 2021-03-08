package basics;

public class NestedIf {
	public static void main(String[] args) {
		int a=30,b=200,c=1000;
		if(a>b){
			if(a>c){
				System.out.println("a is Largest");
			}
			else{
				System.out.println("c is Largest");
			}
		}
		else{
			if(b>c){
				System.out.println("b is Largest");
			}
			else{
				System.out.println("c is Largest");
			}
		}
	}

}
