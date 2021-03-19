package arrays;

public class SingleDimensional4 {
	
	public static void main(String[] args) {
		Employee arr[]=new Employee[3];
		
		arr[0]=new Employee(101,"Nagarjun");
		arr[1]=new Employee(102,"Subbu");
		arr[2]=new Employee(103,"Dhilip");
		
		
		//using for loop
		System.out.println("*** Using for loop ***");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i].empId+"\t"+arr[i].empName);
		}
		
		
		//using for each loop
		System.out.println("*** Using for each loop ***");
		for(Employee e:arr){
			System.out.println(e.empId+"\t"+e.empName);
		}
		
		
		
		
	}

}
