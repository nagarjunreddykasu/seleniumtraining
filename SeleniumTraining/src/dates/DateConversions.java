package dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConversions {
	public static void main(String[] args) {

		Date date=new Date();

		System.out.println(date);

		//To convert date in MM-dd-yyyy format
		SimpleDateFormat mdy=new SimpleDateFormat("MM-dd-yyyy");
		String mmddyy=mdy.format(date);
		System.out.println("Date in MM-dd-yyyy format: "+mmddyy);

		//To convert date in dd-MM-yyyy format
		SimpleDateFormat dmy=new SimpleDateFormat("dd-MM-yyyy");
		String ddmmyy=dmy.format(date);
		System.out.println("Date in dd-MM-yyyy format: "+ddmmyy);

		//To convert date in yyyy-MM-dd format
		SimpleDateFormat ymd=new SimpleDateFormat("yyyy-MM-dd");
		String yymmdd=ymd.format(date);
		System.out.println("Date in yyyy-MM-dd format: "+yymmdd);


		/*03/23/2021
		23/03/2021
		2021/03/23*/
	}

}
