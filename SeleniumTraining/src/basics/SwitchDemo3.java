package basics;

public class SwitchDemo3 {
	public static void main(String[] args) {
		String locatorType="id";
		switch(locatorType){
		case "id":
			System.out.println("driver.findElement(By.id(\"idvalue\"))");
			break;
		case "name":
			System.out.println("driver.findElement(By.name(\"namevalue\")");
			break;
		case "xpath":
			System.out.println("driver.findElement(By.xpath(\"xpathvalue\")");
			break;
		default:
			System.out.println("Invalid locator type");		
		}
	}

}
