package arrays;

public class SingleDimensional3 {
	
	
	static int[] getArray(){
		
		//int arr[]={10,20,30,40,50};
		
		return new int[]{10,20,30,40,50,60};
		//return arr;
	}
	
	public static void main(String[] args) {
		
		int[] arr=getArray();
		
		
		System.out.println("*** Using for each loop ***");
		for(int i:arr){
			System.out.println(i);
		}
		
	}

}
