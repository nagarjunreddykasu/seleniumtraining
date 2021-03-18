package interfaces;

public class ChromeBrowser implements Interface1{

	public void click() {
		System.out.println("click method in ChromeBrowser class");
	}

	public void sendKeys() {
		System.out.println("sendKeys method in ChromeBrowser class");
	}
	public void getText() {
		System.out.println("getText method in ChromeBrowser class");
	}
	public void waitForElement(){
		System.out.println("wait method from ChromeBrowser class");
	}
	
	public static void main(String[] args) {
		ChromeBrowser obj=new ChromeBrowser();
		obj.click();
		obj.sendKeys();
		obj.getText();
		obj.waitForElement();
		obj.getWebElement();
		
		System.out.println(Interface1.a);
		Interface1.getElements();
		
		Interface1 in=new ChromeBrowser();
		in.click();
		in.sendKeys();
		in.getText();
		
		
		
		
		
	}
	
	

}
