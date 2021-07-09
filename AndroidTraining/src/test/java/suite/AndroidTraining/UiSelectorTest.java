package suite.AndroidTraining;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class UiSelectorTest {
	
	@Test
	public void UiSelector1() throws MalformedURLException, InterruptedException{
		AndroidDriver<AndroidElement> driver=Reusable.launchApp();
		
		
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"App\")")).click();
		Thread.sleep(2000);
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().textStartsWith(\"Alert\")")).click();
		/*driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().textContains(\"Alert\")")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().textMatches(\".*Dialogs\")")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Alert Dialogs\")")).click();
		
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().description(\"Alert Dialogs\")")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().descriptionStartsWith(\"Alert\")")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().descriptionContains(\"Alert\")")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().descriptionMatches(\".*Dialogs\")")).click();*/
		
		Thread.sleep(1000);
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().textMatches(\".*a message\")")).click();
		Thread.sleep(2000);
		
		String actualMessage=driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().textStartsWith(\"Lorem ipsum\")")).getText();
		System.out.println(actualMessage);
		Thread.sleep(2000);
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"OK\")")).click();
		
	}

}

/*

new UiScrollable(new UiSelector().resourceId("android:id/list")).setAsHorizontalList().scrollIntoView(new UiSelector().text("Popup Menu")).click();


setAsVertialList()
setAsHorizontalList()


 */
