package Main;

import DateFormats.Mengenlehreuhr;
import DateFormats.RegularTime;
import DateFormats.Time;
import Parsers.MengenlehreuhrToRegularParser;
import Printers.MengenlehrehrTextPrinter;
import Printers.Printer;

public class Main {

	public static void main(String[] args) {
		Time time = new RegularTime(); //Current time
		Mengenlehreuhr berlinClock = MengenlehreuhrToRegularParser.parse(time);
		Printer printer = new MengenlehrehrTextPrinter();
		printer.print(berlinClock);
	}

}
