package Printers;

import DateFormats.Mengenlehreuhr;

public class MengenlehrehrTextPrinter implements Printer {

	@Override
	public void print(Mengenlehreuhr m) {
		System.out.println(m.getSecondsBulb());
		System.out.println(m.getTopHoursBulbs());
		System.out.println(m.getBottomHoursBulbs());
		System.out.println(m.getTopMinutesBulbs());
		System.out.println(m.getBottomMinutesBulbs());
	}

}
