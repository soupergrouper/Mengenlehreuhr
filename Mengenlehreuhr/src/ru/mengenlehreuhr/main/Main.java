package ru.mengenlehreuhr.main;

import ru.mengenlehreuhr.dateformats.BerlinClock;
import ru.mengenlehreuhr.dateformats.Mengenlehreuhr;
import ru.mengenlehreuhr.dateformats.MengenlehreuhrReversed;
import ru.mengenlehreuhr.dateformats.RegularTime;
import ru.mengenlehreuhr.dateformats.Time;
import ru.mengenlehreuhr.parsers.MengenlehreuhrToRegularParser;
import ru.mengenlehreuhr.printers.MengenlehrehrTextPrinter;
import ru.mengenlehreuhr.printers.Printer;

public class Main {

	public static void main(String[] args) {
		Time time = new RegularTime(); //Current time
		BerlinClock berlinClock = MengenlehreuhrToRegularParser.parse(time, new Mengenlehreuhr());
		BerlinClock reversedBerlinClock = MengenlehreuhrToRegularParser.parse(time, new MengenlehreuhrReversed());
		Printer printer = new MengenlehrehrTextPrinter();
		System.out.println ("BerlinClock:");
		printer.print(berlinClock);
		System.out.println ("\nBerlinClock in mirror reflection:");
		printer.print(reversedBerlinClock);
	}

}
