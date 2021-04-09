package basics;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://techcanvass.com/Examples/multi-select.html");
		driver.manage().window().maximize();
		
		Select select=new Select(driver.findElement(By.id("multiselect")));
		
		System.out.println(select.isMultiple());
		
		select.selectByVisibleText("Volvo");
		select.selectByValue("honda");
		
		//deselectByVisibleText
		//deselectByValue
		//deselectByIndex
		Thread.sleep(2000);
		//select.deselectByVisibleText("Volvo");
		//select.deselectByValue("honda");
		
		//select.deselectAll();
		
		//To get first selected option
		
		//System.out.println(select.getFirstSelectedOption().getText());
		ArrayList<String> selectedValues=new ArrayList<>();
		List<WebElement> list=select.getAllSelectedOptions();
		for(WebElement element:list){
			System.out.println(element.getText());
			selectedValues.add(element.getText());
		}
		
		System.out.println("Selected Options: "+selectedValues);
		
		
		
		
		
	}

}
