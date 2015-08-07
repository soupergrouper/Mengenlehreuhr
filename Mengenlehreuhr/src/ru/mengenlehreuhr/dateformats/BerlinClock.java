package ru.mengenlehreuhr.dateformats;

public interface BerlinClock {
	public String getTopHoursBulbs();

	public String getBottomHoursBulbs();

	public String getTopMinutesBulbs();

	public String getBottomMinutesBulbs();

	public String getSecondsBulb();

	public void setTopHoursBulbs(String topHoursBulbs);

	public void setBottomHoursBulbs(String bottomHoursBulbs);

	public void setTopMinutesBulbs(String topMinutesBulbs);

	public void setBottomMinutesBulbs(String bottomMinutesBulbs);

	public void setSecondsBulb(String secondsBulb);
}
