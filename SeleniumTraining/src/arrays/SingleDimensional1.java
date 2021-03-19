package arrays;

public class SingleDimensional1 {
	public static void main(String[] args) {
		//datatype[] refvar=new datatype[size];
		int arr[]=new int[3];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		
		
		//using for loop
		System.out.println("*** Using for loop ***");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		
		//using for each loop
		System.out.println("*** Using for each loop ***");
		for(int i:arr){
			System.out.println(i);
		}
		
		
		
		
	}

}
