package Printers;

import DateFormats.Mengenlehreuhr;

public class MengenlehrehrTextPrinter implements Printer {

	@Override
	public void print(Mengenlehreuhr m) {
		printSecond(m.getSecondsBulb());
		printShortRow(m.getTopHoursBulbs());
		printShortRow(m.getBottomHoursBulbs());
		printLongRow(m.getTopMinutesBulbs());
		printShortRow(m.getBottomMinutesBulbs());

	}

	public void printSecond(int second) {
		if (second == 0)
			System.out.println("Y");
		else
			System.out.println("D");
	}

	public void printShortRow(int bulbCount) {
		for (int i = 0; i < bulbCount; i++) {
			System.out.print("Y");
		}
		for (int i = bulbCount; i < 4; i++) {
			System.out.print("D");
		}
		System.out.println("");
	}

	public void printLongRow (int bulbCount)  {
		for (int i = 0; i < bulbCount; i++)  {
			if ((i + 1) % 3 == 0)
				System.out.print ("R");
				else
					System.out.print ("Y");
		}
		for (int i = bulbCount; i < 12; i++)  {
			System.out.print("D");
		}
		System.out.println ("");
	}

}
