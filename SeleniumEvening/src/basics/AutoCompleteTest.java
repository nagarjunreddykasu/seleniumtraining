package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompleteTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://qa.circulus.io/login.aspx");
		driver.manage().window().maximize();
		
		Reusable.sendKeys(driver, By.id("TxtEmail"), "nkasu@frontier.com");
		Reusable.sendKeys(driver, By.id("TxtPassword"), "xeno@1234");
		Reusable.click(driver, By.id("BtnLogin"));
		
		Reusable.click(driver, By.id("cpBody_divqlbillentry"));
		Reusable.click(driver, By.id("cpBody_btnBeginDEWithoutImg"));
		
		Reusable.sendKeys(driver, By.id("cpBody_ddlAutoCompExt_txt_comb"), "Ca");
		
		Reusable.wait(driver, By.xpath("//ul[@id='cpBody_ddlAutoCompExt_ul_comb']/li"));
		
		
		List<WebElement> list=driver.findElements(By.xpath("//ul[@id='cpBody_ddlAutoCompExt_ul_comb']/li"));
		
		for(int i=0;i<list.size();i++){
			
			String expectedOption="National Eye Care";
			String actualOption=list.get(i).getText();
			
			if(expectedOption.equals(actualOption)){
				list.get(i).click();
				break;
			}
			
		}
		
		
	}

}
