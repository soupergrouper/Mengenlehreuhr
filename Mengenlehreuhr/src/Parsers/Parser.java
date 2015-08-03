package Parsers;

import java.util.Calendar;

import DateFormats.Mengenlehreuhr;

public class Parser {
	public static Mengenlehreuhr parse(Calendar time) {

		Mengenlehreuhr m = new Mengenlehreuhr();

		m.setTopHoursBulbs(time.get(Calendar.HOUR_OF_DAY) / 5);
		m.setBottomHoursBulbs(time.get(Calendar.HOUR_OF_DAY) % 5);
		m.setTopMinutesBulbs(time.get(Calendar.MINUTE) / 5);
		m.setBottomMinutesBulbs(time.get(Calendar.MINUTE) % 5);
		m.setSecondsBulb(time.get(Calendar.SECOND) % 2);

		return m;
	}
}
