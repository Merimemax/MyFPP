package assignment3p1;

import java.text.DateFormat;
import java.util.Date;

public class Utill {
	public static String dateAsString(Date d) {
		DateFormat f = DateFormat.getDateInstance(DateFormat.SHORT);
		return f.format(d);
	}
}
