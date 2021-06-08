package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsTest4 {
	public static void main(String[] args) {
		//To Launch the Chrome browser
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();


		driver.get("http://qa.circulus.io/login.aspx");
		driver.findElement(By.id("TxtEmail")).sendKeys("nkasu@frontier.com");
		driver.findElement(By.id("TxtPassword")).sendKeys("xeno@123");
		driver.findElement(By.id("BtnLogin")).click();
		driver.findElement(By.id("cpBody_divqlbillentry")).click();
		
		Actions actions=new Actions(driver);
		
		//To perform right click actions
		//actions.contextClick(driver.findElement(By.id("cpBody_btnBeginDEWithoutImg"))).perform();
		
		
		//To perform double click action
		//actions.doubleClick(driver.findElement(By.id("cpBody_btnBeginDEWithoutImg"))).perform();
		
		//To get tool tip message
		WebElement toolTipIcon=driver.findElement(By.xpath("//*[@id='cpBody_divXTBDE']/label[2]/a/img"));
		actions.moveToElement(toolTipIcon).perform();
		
		String tooltipMessage=toolTipIcon.getAttribute("title");
		System.out.println("Tool tip message: "+tooltipMessage);
	
	}

}
