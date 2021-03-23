package dates;

import java.time.LocalDate;
import java.time.Month;

public class LocalDate3 {
	public static void main(String[] args) {
		
		System.out.println(LocalDate.of(2021,3,20));//2021-03-20
		System.out.println(LocalDate.of(2021, Month.MARCH, 15));//2021-03-15
		System.out.println(LocalDate.ofYearDay(2021, 100));
		System.out.println(LocalDate.parse("2021-03-21"));
		
		
		LocalDate ld1=LocalDate.now();//2021-03-23
		LocalDate ld2=LocalDate.parse("2021-03-23");
		
		//To compare LocalDates
		System.out.println(ld1.compareTo(ld2));
		System.out.println(ld1.equals(ld2));
		System.out.println(ld1.isEqual(ld2));
		
		
		System.out.println(ld1.getDayOfMonth());//23
		System.out.println(ld1.getDayOfWeek());//TUESDAY
		System.out.println(ld1.getDayOfYear());
		System.out.println(ld1.getMonth());//MARCH
		System.out.println(ld1.getMonthValue());//3
	}

}
