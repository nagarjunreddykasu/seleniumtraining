package arrays;


//Passing array to methods
public class SingleDimensional2 {
	
	static void getArray(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		int arr[]={10,20,30,40,50};
		
		getArray(arr);
		
		
		
	}

}
