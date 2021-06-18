package testng;

import org.testng.annotations.Test;

public class StaticDataProvider1 {

	@Test(dataProvider="getBrowser",dataProviderClass=DataProviders.class)
	public void openApp(String browser){
		System.out.println("Browser Name: "+browser);
	}
}

