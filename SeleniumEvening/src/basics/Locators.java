package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://qa.circulus.io/login.aspx");
		driver.manage().window().maximize();
		/*driver.findElement(By.id("TxtEmail")).sendKeys("testuser@gmail.com");
		driver.findElement(By.name("TxtPassword")).sendKeys("Test@123");*/
		///driver.findElement(By.className("form-control")).sendKeys("abcdefgh");
		
		driver.findElements(By.className("form-control")).get(1).sendKeys("Test@123");
		
		driver.findElement(By.tagName("input"));
		
		//driver.findElement(By.linkText("Forgot Password?")).click();
		driver.findElement(By.partialLinkText("Forgot")).click();
		
		
		//spicejet.com
		//https://the-internet.herokuapp.com/
		
		
	}

}


/*
Locators:
----------
findElement(By.id(""))


locators supported by selenium:

id
name
className
cssSelector
xpath
tagName
linkText
partialLinkText

static methods implemented in By class

id
name
cssSelector
xpath
className
tagName
linkText
partialLinkText




*/