package dates;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateTest {
	public static void main(String[] args) {
		
		LocalDate local=LocalDate.now();
		System.out.println(local);
		
		//To convert LocalDate to String
		String s=local.toString();
		System.out.println("String date: "+s);
		
		//To convert String to LocalDate
		LocalDate ld=LocalDate.parse(s);
		System.out.println("String to LocalDate: "+ld);
		
		
		//To convert LocalDate to required format
		//MM-dd-yyyy
		System.out.println("LocalDate to MM-dd-yyyy format: "+DateTimeFormatter.ofPattern("MM-dd-yyyy").format(local));
		//dd-MM-yyyy
		System.out.println("LocalDate to dd-MM-yyyy format: "+DateTimeFormatter.ofPattern("dd-MM-yyyy").format(local));
		
	}

}
