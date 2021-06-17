package testng;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsTest {
	@BeforeGroups("sanity")
	public void beforeGroups(){
		System.out.println("Before Groups code");
	}
	
	@Test(groups={"sanity"})
	public void TC_Search_01(){
		System.out.println("TC_Search_01 method");
	}
	@Test(groups={"sanity","regression"})
	public void TC_Search_02(){
		System.out.println("TC_Search_02 method");
	}
	@Test(groups={"regression"})
	public void TC_Search_03(){
		System.out.println("TC_Search_03 method");
	}
	@Test(groups={"regression"})
	public void TC_Search_04(){
		System.out.println("TC_Search_04 method");
	}
	@Test(groups={"regression"})
	public void TC_Search_05(){
		System.out.println("TC_Search_05 method");
	}
	@Test(groups={"regression"})
	public void TC_Search_06(){
		System.out.println("TC_Search_06 method");
	}
	@Test(groups={"endtoend"})
	public void TC_Search_07(){
		System.out.println("TC_Search_07 method");
	}
	
	@Test(dependsOnGroups={"sanity"})
	public void TC_Search_08(){
		System.out.println("TC_Search_08 method");
	}

	@AfterGroups("sanity")
	public void afterGroup(){
		System.out.println("After group code");
	}
}
