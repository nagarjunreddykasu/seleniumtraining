package testng;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTest {
	
	
	@Parameters({"url","browser"})
	@BeforeClass
	public void beforeClass(String url,String browserName){
		System.out.println("URL is: "+url);
		System.out.println("Browser is: "+browserName);
	}
	
	@Test
	public void TC_Login_01(){
		System.out.println("TC_Login_01 method");
	}

}
