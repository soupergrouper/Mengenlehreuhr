package ru.mengenlehreuhr.printers;

import ru.mengenlehreuhr.dateformats.BerlinClock;
import ru.mengenlehreuhr.dateformats.Mengenlehreuhr;

public class MengenlehrehrTextPrinter implements Printer {

	@Override
	public void print(BerlinClock m) {
		System.out.println(m.getSecondsBulb());
		System.out.println(m.getTopHoursBulbs());
		System.out.println(m.getBottomHoursBulbs());
		System.out.println(m.getTopMinutesBulbs());
		System.out.println(m.getBottomMinutesBulbs());
	}

}
