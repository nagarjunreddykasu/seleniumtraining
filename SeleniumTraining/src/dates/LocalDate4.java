package dates;

import java.time.LocalDate;

public class LocalDate4 {
	public static void main(String[] args) {
		LocalDate ld1=LocalDate.now();//2021-03-23
		LocalDate ld2=LocalDate.parse("2021-03-25");
		
		System.out.println(ld1.isBefore(ld2));//true
		System.out.println(ld1.isAfter(ld2));//false
		
		System.out.println(ld1.isLeapYear());
		System.out.println(ld1.lengthOfMonth());//31
		System.out.println(ld1.lengthOfYear());//365
		
		
		System.out.println(ld1.minusDays(3));//2021-03-20
		System.out.println(ld1.minusWeeks(1));//
		System.out.println(ld1.minusMonths(2));
		System.out.println(ld1.minusYears(2));//
		
		System.out.println("*** Plus methods ***");
		System.out.println(ld1.plusDays(3));
		System.out.println(ld1.plusWeeks(1));//
		System.out.println(ld1.plusMonths(2));
		System.out.println(ld1.plusYears(2));//
		
		
		
	}

}
