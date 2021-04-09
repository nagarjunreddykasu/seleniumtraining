package basics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownsTest {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://qa.circulus.io/login.aspx");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Sign Up")).click();
		
		
		WebElement ddlAboutUs=driver.findElement(By.id("ddlAboutUs"));
		Select select=new Select(ddlAboutUs);
		select.selectByVisibleText("Social Media");  //recommended 1st
		//select.selectByValue("3"); //2nd
		//select.selectByIndex(2);
		
		//To get the selected value from drop down list
		
		System.out.println(select.getFirstSelectedOption().getText());
		
		//To get all options from drop down list
		List<WebElement> options=select.getOptions();
		System.out.println(options.size());
		
		ArrayList<String> actualOptions=new ArrayList<>();
		
		System.out.println("*** Using for loop ***");
		for(int i=0;i<options.size();i++){
			System.out.println(options.get(i).getText());
			actualOptions.add(options.get(i).getText());
		}
		
		System.out.println("*** Using for each ***");
		for(WebElement element:options){
			System.out.println(element.getText());
		}
		
		System.out.println("*** Using list iterator cursor ***");
		ListIterator<WebElement> litr=options.listIterator();
		while(litr.hasNext()){
			System.out.println(litr.next().getText());
		}
		
		System.out.println("*** Using Iterator cursor ***");
		Iterator<WebElement> itr=options.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next().getText());
		}
		
		System.out.println("Actual Options: "+actualOptions);
		
		
		
		//selectByVisibleTest
		//selectByValue
		//selectByIndex
		
		
		
	}

}
