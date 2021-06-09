package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebTableTest2 {
	public static void main(String[] args) {

		//To Launch the Chrome browser
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();


		driver.get("http://qa.circulus.io/login.aspx");
		driver.findElement(By.id("TxtEmail")).sendKeys("nkasu@frontier.com");
		driver.findElement(By.id("TxtPassword")).sendKeys("xeno@123");
		driver.findElement(By.id("BtnLogin")).click();


		Actions actions=new Actions(driver);
		actions.moveToElement(driver.findElement(By.id("menu_aBills"))).perform();

		driver.findElement(By.linkText("Approve Bills")).click();

		//To get Column count in web table
		int colCount=driver.findElements(By.xpath("//*[@id='cpBody_GVBillReviewApprove']/thead/tr/th")).size();
		System.out.println("Column count: "+colCount);

		//To get Row Count
		int rowCount=driver.findElements(By.xpath("//*[@id='cpBody_GVBillReviewApprove']/tbody/tr")).size();
		System.out.println("Row count: "+rowCount);
		
		
		for(int row=1;row<=rowCount;row++){
			for(int col=1;col<colCount;col++){
				String data=driver.findElement(By.xpath("//*[@id='cpBody_GVBillReviewApprove']/tbody/tr["+row+"]/td["+col+"]")).getText();
				System.out.print(data+"\t");
			}
			System.out.println();
			
		}



	}

}
