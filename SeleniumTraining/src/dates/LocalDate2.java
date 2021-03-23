package dates;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDate2 {
	public static void main(String[] args) {
		
		/*String str="01/30/2021";
		//LocalDate format: 2021-01-30
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("MM/dd/yyyy");
		LocalDate ld=LocalDate.parse(str,formatter);
		System.out.println("String to LocalDate: "+ld);*/
		
		
		System.out.println(LocalDate.parse("01/30/2021",DateTimeFormatter.ofPattern("MM/dd/yyyy")));
		
	}

}
