package date;

import java.util.Calendar;
import java.util.Date;

public class CalenderTest {

	public static void main(String[] args) {
		// Singleton
		Calendar c = Calendar.getInstance();
		
		// System.out.println(c);
		
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH);
		int day = c.get(Calendar.DAY_OF_MONTH);
		int hour = c.get(Calendar.HOUR_OF_DAY);
		int minute = c.get(Calendar.MINUTE);
		int seconds = c.get(Calendar.SECOND);
		
		System.out.println(year);
		System.out.println(month + 1);
		System.out.println(day);
		System.out.println(hour);
		System.out.println(minute);
		System.out.println(seconds);
		System.out.println();
		
		c.set(1999, 00, 21);
	
		year = c.get(Calendar.YEAR);
		month = c.get(Calendar.MONTH);
		day = c.get(Calendar.DAY_OF_MONTH);
		
		System.out.println(year);
		System.out.println(month + 1);
		System.out.println(day);
		
		c.setTime(new Date());
	}

}
