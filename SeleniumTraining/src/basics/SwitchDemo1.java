package basics;

public class SwitchDemo1 {
	public static void main(String[] args) {
		int a=10;
		
		switch(a){
		case 1:
			System.out.println("value 1");
			break;
		case 2:
			System.out.println("value 2");
			break;
		case 3:
			System.out.println("value 3");
			break;
		case 4:
			System.out.println("value 4");
			break;
		case 5:
			System.out.println("value 5");
			break;
		default:
				System.out.println("default case");
		}
		
		
	}

}


/*

switch(value2){

case value1:
---
---
break;

case value2:
----
--
break;


}

if(cond){
}
else if(cond2){
}
else if(cond3){
}
else if(cond4){
}



*/