package abstraction;

public class BankTest {
	
	public static void main(String[] args) {
		
		Bank sbi=new SBI();
		sbi.getRateOfInterest();
		
		Bank icici=new ICICI();
		icici.getRateOfInterest();
		
	}

}
