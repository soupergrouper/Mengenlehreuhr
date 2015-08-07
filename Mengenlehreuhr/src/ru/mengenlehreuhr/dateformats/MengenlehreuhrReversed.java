package ru.mengenlehreuhr.dateformats;

public class MengenlehreuhrReversed extends Mengenlehreuhr implements BerlinClock {
	
	private String reflectInMirror (String str)  {
		StringBuilder sb = new StringBuilder(str);
		return sb.reverse().toString();
	}
	
	@Override
	public void setTopHoursBulbs(String topHoursBulbs) {
		this.topHoursBulbs = reflectInMirror(topHoursBulbs);
	}
	@Override
	public void setBottomHoursBulbs(String bottomHoursBulbs) {
		this.bottomHoursBulbs = reflectInMirror(bottomHoursBulbs);
	}
	@Override
	public void setTopMinutesBulbs(String topMinutesBulbs) {
		this.topMinutesBulbs = reflectInMirror(topMinutesBulbs);
	}
	@Override
	public void setBottomMinutesBulbs(String bottomMinutesBulbs) {
		this.bottomMinutesBulbs = reflectInMirror(bottomMinutesBulbs);
	}
	
	public String getTopHoursBulbs() {
		return topHoursBulbs;
	}
	public String getBottomHoursBulbs() {
		return bottomHoursBulbs;
	}
	public String getTopMinutesBulbs() {
		return topMinutesBulbs;
	}
	public String getBottomMinutesBulbs() {
		return bottomMinutesBulbs;
	}
	public String getSecondsBulb() {
		return secondsBulb;
	}

}
