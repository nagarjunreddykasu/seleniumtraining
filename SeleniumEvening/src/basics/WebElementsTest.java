package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsTest {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://qa.circulus.io/login.aspx");
		driver.manage().window().maximize();
		
		
		//isDisplayed()
		System.out.println(driver.findElement(By.id("BtnLogin")).isDisplayed());  //true false
		
		System.out.println(driver.findElement(By.id("BtnLogin")).isEnabled());
		
		//check boxes and radio buttons
		
		/*driver.findElement(By.linkText("Sign Up")).click();
		driver.findElement(By.xpath("//*[@id='pnlregister']/div[4]/div/div/div/label/span")).click();*/
		
		
		driver.findElement(By.id("BtnLogin")).click();
		
		String expectedUserNameMessage="Please enter Username / Email Address.";
		
		
		
		String actualUserNameMessage=driver.findElement(By.xpath("//*[@id='Div1']/div[2]/div")).getText();

		System.out.println(actualUserNameMessage);
		
		if(expectedUserNameMessage.equals(actualUserNameMessage)){
			System.out.println("Actual and Expected validation messages are equal");
		}
		else{
			System.out.println("Actual and Expected validation messages are NOT equal");
			throw new Exception("Actual and Expected validation messages are NOT equal");
		}
		
		System.out.println(driver.findElement(By.id("BtnLogin")).getTagName());
		
		System.out.println(driver.findElement(By.id("BtnLogin")).getAttribute("class"));
		
		
		
		
		
		
		
	}

}
