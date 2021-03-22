package arrays;

public class MultiDimensionalArray {
	public static void main(String[] args) {
		
		//int[][] a=new int[3][4];
		
		/*
		 		col1	col2	col3	col4
		row1	a[0][0] a[0][1]	a[0][2]	a[0][3]
		
		row2	a[1][0]	a[1][1]	a[1][2]	a[1][3]
		
		row3    a[2][0]	a[2][1]	a[2][2]	a[2][3]
		
		
		 */
		
		int[][] arr={{1,2,3,4},{4,5,6},{10,20,30,40}};
		
		System.out.println("Length of first element: "+arr[0].length);
		
		//To retrieve all elements of 2d array using for loop
		System.out.println("*** Using for loop ***");
		for(int row=0;row<arr.length;row++){
			for(int col=0;col<arr[row].length;col++){
				System.out.print(arr[row][col]+"\t");
			}
			System.out.println();
		}
		
		System.out.println("*** Using for each loop ***");
		for(int[] innerArray:arr){
			for(int data:innerArray){
				System.out.print(data+"\t");
			}
			System.out.println();
		}
		
		
		
	}

}

/*
1	2	3	4
4	5	6
10	20	30	40

*/
