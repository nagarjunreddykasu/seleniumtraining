package testng;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsTest {
	
	@Test
	public void TC_Login_01(){
		System.out.println("TC_Login_01 test case code");
	}
	
	@Test
	public void TC_Login_02(){
		System.out.println("TC_Login_02 test case code");
	}
	
	@Test
	public void TC_Login_03(){
		System.out.println("TC_Login_03 test case code");
	}
	
	
	@BeforeSuite
	public void beforeSuite(){
		System.out.println("Before suite method");
	}
	
	@AfterSuite
	public void AfterSuite(){
		System.out.println("After suite method");
	}
	
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("Before method");
	}
	
	@AfterMethod
	public void afterMethod(){
		System.out.println("After method");
	}
	
	@BeforeClass
	public void beforeClass(){
		System.out.println("Before Class method");
	}
	
	@AfterClass
	public void afterClass(){
		System.out.println("After class method");
	}
	
	@BeforeTest
	public void beforeTest(){
		System.out.println("Before Test method");
	}
	
	@AfterTest
	public void afterTest(){
		System.out.println("After Test method");
	}

}


/*
Before suite method
Before Test method
Before Class method
Before method
TC_Login_01 test case code
After method
Before method
TC_Login_02 test case code
After method
Before method
TC_Login_03 test case code
After method
After class method
After Test method

Before Test method
Before Class method
Before method
TC_Login_01 test case code
After method
Before method
TC_Login_02 test case code
After method
Before method
TC_Login_03 test case code
After method
After class method
After Test method

After suite method
 
 
 */







