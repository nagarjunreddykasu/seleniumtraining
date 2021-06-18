package testng;

import org.testng.annotations.DataProvider;

public class DataProviders {
	
	@DataProvider
    public static Object[][] getData() {
        return new Object[][]{{"nkasu@frontier.com","xeno@123$","invpwd"}, {"nkasu@gmail.com","Test@123","invuser"},
        	{"nagarjun","Abc@1234","invEmail"},{"","","blank"}};
    }
	
	@DataProvider
	public static Object[][] getBrowser(){
		return new Object[][]{{"Chrome"},{"Edge"}};
	}

}
