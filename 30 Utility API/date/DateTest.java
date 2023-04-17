package date;

import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
		
		// Deprecated
		System.out.println(d.getMonth() + 1);

	}

}
