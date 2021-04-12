package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePickerTest {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		driver.findElement(By.linkText("Bengaluru (BLR)")).click();
		
		driver.findElement(By.linkText("Hyderabad (HYD)")).click();
		
		////a[contains(text(),'Bengaluru (BLR)')]
		//a[@value='BLR']
		
		//ui-state-default
		//ui-state-default ui-state-highlight ui-state-active
		
		//TO select current date
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		
		driver.findElement(By.id("divpaxinfo")).click();
		
		WebElement adult=driver.findElement(By.id("ctl00_mainContent_ddl_Adult"));
		Select ddlAdult=new Select(adult);
		ddlAdult.selectByVisibleText("5");
		
		Select child=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child")));
		child.selectByVisibleText("2");
		
		Select infant=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Infant")));
		infant.selectByVisibleText("1");
		
		
	}

}
