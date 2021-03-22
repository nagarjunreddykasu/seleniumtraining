package arrays;

import java.util.Arrays;

public class ArraysComparison {
	public static void main(String[] args) {
		
		int[] arr1={5,10,15,20,25};
		int[] arr2={5,10,15,20,25};
		
		if(Arrays.equals(arr1,arr2)){
			System.out.println("Both Arrays are Equal.");
		}
		else{
			System.out.println("Both Arrays are NOT equal.");
		}
		
		Object[] obj1={arr1};	
		Object[] obj2={arr2};
		if(Arrays.equals(obj1,obj2)){
			System.out.println("Both Arrays are Equal.");
		}
		else{
			System.out.println("Both Arrays are NOT equal.");
		}
		
		if(Arrays.deepEquals(obj1,obj2)){
			System.out.println("Both Arrays are Equal.");
		}
		else{
			System.out.println("Both Arrays are NOT equal.");
		}
		
		
		
		
		
		
	}

}


/*
Arrays:
equals()
deepEquals()

elements should be of same type
should be equal number of elements
Order of elements must be same

*/