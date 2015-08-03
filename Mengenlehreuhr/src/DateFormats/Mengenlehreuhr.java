package DateFormats;

public class Mengenlehreuhr {
	
	protected final int SHORT_ROW_BULBS_COUNT = 4;
	protected final int LONG_ROW_BULBS_COUNT = 12;
	
	private Integer topHoursBulbs;
	private Integer bottomHoursBulbs;
	private Integer topMinutesBulbs;
	private Integer bottomMinutesBulbs;
	private Integer secondsBulb;
	
	public Integer getTopHoursBulbs() {
		return topHoursBulbs;
	}
	public Integer getBottomHoursBulbs() {
		return bottomHoursBulbs;
	}
	public Integer getTopMinutesBulbs() {
		return topMinutesBulbs;
	}
	public Integer getBottomMinutesBulbs() {
		return bottomMinutesBulbs;
	}
	public Integer getSecondsBulb() {
		return secondsBulb;
	}
	public void setTopHoursBulbs(Integer topHoursBulbs) {
		this.topHoursBulbs = topHoursBulbs;
	}
	public void setBottomHoursBulbs(Integer bottomHoursBulbs) {
		this.bottomHoursBulbs = bottomHoursBulbs;
	}
	public void setTopMinutesBulbs(Integer topMinutesBulbs) {
		this.topMinutesBulbs = topMinutesBulbs;
	}
	public void setBottomMinutesBulbs(Integer bottomMinutesBulbs) {
		this.bottomMinutesBulbs = bottomMinutesBulbs;
	}
	public void setSecondsBulb(Integer secondsBulb) {
		this.secondsBulb = secondsBulb;
	}

	
}
