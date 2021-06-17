package testng;

import org.testng.annotations.Test;

public class AnnotationsTest3 {
	
	@Test
	public void TC_Search_01(){
		System.out.println("TC_Search_01 method");
		System.out.println(10/0);
	}
	@Test
	public void TC_Search_02(){
		System.out.println("TC_Search_02 method");
	}
	@Test(dependsOnMethods={"TC_Search_01","TC_Search_02"})
	public void TC_Search_03(){
		System.out.println("TC_Search_03 method");
	}

}


/*
@Test attributes
------------------

priority

enabled

dependsOnMethods

*/