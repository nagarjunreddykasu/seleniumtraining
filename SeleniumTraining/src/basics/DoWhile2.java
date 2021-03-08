package basics;

public class DoWhile2 {
	public static void main(String[] args) {
		int i=1,max=30;
		
		do{
			if(i%2!=0){
				System.out.println(i); //2 4 .......30
			}
			i++;
		}while(i<=max);
	}

}
