package ru.mengenlehreuhr.testcases;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import ru.mengenlehreuhr.dateformats.BerlinClock;
import ru.mengenlehreuhr.dateformats.Mengenlehreuhr;
import ru.mengenlehreuhr.dateformats.RegularTime;
import ru.mengenlehreuhr.dateformats.Time;
import ru.mengenlehreuhr.parsers.MengenlehreuhrToRegularParser;


public class MengenlehreuhrTestCase {
	private Time t1, t2, t3, t4;
	private BerlinClock m1, m2, m3, m4;
	
@Before
public void setupData()  {
	t1 = new RegularTime (0, 0, 0);  // 00:00:00
	t2 = new RegularTime (41, 23, 16); // 16:23:41
	t3 = new RegularTime(6, 5, 3);  // 03:05:06
	t4 = new RegularTime(59, 59, 23);  // 23:59:59
	
	m1 = MengenlehreuhrToRegularParser.parse(t1, new Mengenlehreuhr());
	m2 = MengenlehreuhrToRegularParser.parse(t2, new Mengenlehreuhr());
	m3 = MengenlehreuhrToRegularParser.parse(t3, new Mengenlehreuhr());
	m4 = MengenlehreuhrToRegularParser.parse(t4, new Mengenlehreuhr());
}

@Test
public void topHoursLengthTest()  {
	Assert.assertEquals (4, m1.getTopHoursBulbs().length());
	Assert.assertEquals (4, m2.getTopHoursBulbs().length());
	Assert.assertEquals (4, m3.getTopHoursBulbs().length());
	Assert.assertEquals (4, m4.getTopHoursBulbs().length());

}

@Test
public void topHoursValueTest()  {
	Assert.assertEquals ("DDDD", m1.getTopHoursBulbs());
	Assert.assertEquals ("YYYD", m2.getTopHoursBulbs());
	Assert.assertEquals ("DDDD", m3.getTopHoursBulbs());
	Assert.assertEquals ("YYYY", m4.getTopHoursBulbs());
}

@Test
public void bottomHoursLengthTest()  {
	Assert.assertEquals (4, m1.getBottomHoursBulbs().length());
	Assert.assertEquals (4, m2.getBottomHoursBulbs().length());
	Assert.assertEquals (4, m3.getBottomHoursBulbs().length());
	Assert.assertEquals (4, m4.getBottomHoursBulbs().length());
}

@Test
public void bottomHoursValueTest()  {
	Assert.assertEquals ("DDDD", m1.getBottomHoursBulbs());
	Assert.assertEquals ("YDDD", m2.getBottomHoursBulbs());
	Assert.assertEquals ("YYYD", m3.getBottomHoursBulbs());
	Assert.assertEquals ("YYYD", m4.getBottomHoursBulbs());
}

@Test
public void topMinutesLengthTest()  {
	Assert.assertEquals (11, m1.getTopMinutesBulbs().length());
	Assert.assertEquals (11, m2.getTopMinutesBulbs().length());
	Assert.assertEquals (11, m3.getTopMinutesBulbs().length());
	Assert.assertEquals (11, m4.getTopMinutesBulbs().length());
}

@Test
public void topMinutesValueTest()  {
	Assert.assertEquals ("DDDDDDDDDDD", m1.getTopMinutesBulbs());
	Assert.assertEquals ("YYRYDDDDDDD", m2.getTopMinutesBulbs());
	Assert.assertEquals ("YDDDDDDDDDD", m3.getTopMinutesBulbs());
	Assert.assertEquals ("YYRYYRYYRYY", m4.getTopMinutesBulbs());
}

@Test
public void bottomMinutesLengthTest()  {
	Assert.assertEquals (4, m1.getBottomMinutesBulbs().length());
	Assert.assertEquals (4, m2.getBottomMinutesBulbs().length());
	Assert.assertEquals (4, m3.getBottomMinutesBulbs().length());
	Assert.assertEquals (4, m4.getBottomMinutesBulbs().length());
}

@Test
public void bottomMinutesValueTest()  {
	Assert.assertEquals ("DDDD", m1.getBottomMinutesBulbs());
	Assert.assertEquals ("YYYD", m2.getBottomMinutesBulbs());
	Assert.assertEquals ("DDDD", m3.getBottomMinutesBulbs());
	Assert.assertEquals ("YYYY", m4.getBottomMinutesBulbs());
}

@Test
public void secondsLengthTest()  {
	Assert.assertEquals (1, m1.getSecondsBulb().length());
	Assert.assertEquals (1, m2.getSecondsBulb().length());
	Assert.assertEquals (1, m3.getSecondsBulb().length());
	Assert.assertEquals (1, m4.getSecondsBulb().length());
}

@Test
public void secondsValueTest()  {
	Assert.assertEquals ("Y", m1.getSecondsBulb());
	Assert.assertEquals ("D", m2.getSecondsBulb());
	Assert.assertEquals ("Y", m3.getSecondsBulb());
	Assert.assertEquals ("D", m4.getSecondsBulb());
}

}
