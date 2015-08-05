package Parsers;

import java.util.Calendar;

import DateFormats.Mengenlehreuhr;
import DateFormats.Time;

public class MengenlehreuhrToRegularParser {
	public static Mengenlehreuhr parse(Time time) {

		Mengenlehreuhr m = new Mengenlehreuhr();

//		m.setTopHoursBulbs(time.get(Calendar.HOUR_OF_DAY) / 5);
//		m.setBottomHoursBulbs(time.get(Calendar.HOUR_OF_DAY) % 5);
//		m.setTopMinutesBulbs(time.get(Calendar.MINUTE) / 5);
//		m.setBottomMinutesBulbs(time.get(Calendar.MINUTE) % 5);
//		m.setSecondsBulb(time.get(Calendar.SECOND) % 2);
		int bulbsCount = 0;
		
		bulbsCount = (time.getHours() - time.getHours() % 5) / 5;  //Calculating top hours
		m.setTopHoursBulbs(fillShortRow(bulbsCount));
		bulbsCount = time.getHours() % 5;  //Calculating bottom hours
		m.setBottomHoursBulbs(fillShortRow(bulbsCount));
		bulbsCount = (time.getMinutes() - time.getMinutes() % 5) / 5; //Calculating top minutes
		m.setTopMinutesBulbs(fillLongRow(bulbsCount));
		bulbsCount = time.getMinutes() % 5;
		m.setBottomMinutesBulbs(fillShortRow(bulbsCount));
		bulbsCount = time.getSeconds() % 2;
		m.setSecondsBulb(fillSeconds(bulbsCount));

		return m;
	}
	
	private static String fillLongRow (int bulbsCount)  {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < bulbsCount; i++)  {
			if ((i + 1) % 3 == 0)
				sb.append("R");  // R for Red
			else
				sb.append("Y");  // Y for Yellow
		}
		for (int i = bulbsCount; i < Mengenlehreuhr.LONG_ROW_BULBS_COUNT; i++)  
			sb.append("D");  // D for Dark
		
		return sb.toString();
	}
	
	private static String fillShortRow (int bulbsCount)  {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < bulbsCount; i++)  {
				sb.append("Y");  // Y for Yellow
		}
		for (int i = bulbsCount; i < Mengenlehreuhr.SHORT_ROW_BULBS_COUNT; i++)  
			sb.append("D");  // D for Dark
		
		return sb.toString();
	}
	
	private static String fillSeconds (int bulbsCount)  {
		if (bulbsCount == 0)
			return "Y";
		else
			return "D";
	}
	
	
}
