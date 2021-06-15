package testng;

import org.testng.annotations.Test;

public class AnnotationsTest2 {
	
	
	
	@Test(priority=0)
	public void login(){
		System.out.println("login method");
	}
	
	@Test(priority=1)
	public void dashboard(){
		System.out.println("dashboard method");
	}
	
	@Test(priority=3,enabled=false)
	public void search(){
		System.out.println("search method");
	}

}

/*
login method
dashboard method
search method

*/