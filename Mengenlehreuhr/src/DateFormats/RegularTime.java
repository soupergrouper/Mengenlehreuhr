package DateFormats;

import java.util.Calendar;
import java.util.Date;

public class RegularTime implements Time {

	private int seconds;
	private int minutes;
	private int hours;
	
	public RegularTime ()  {
		Calendar calendar = Calendar.getInstance();
		this.seconds = calendar.get(Calendar.SECOND);
		this.minutes = calendar.get(Calendar.MINUTE);
		this.hours = calendar.get(Calendar.HOUR_OF_DAY);
	}
	
	public RegularTime (int seconds, int minutes, int hours)  {
		this.seconds = (seconds >= 0 && seconds <= 60) ? seconds : 0;
		this.minutes = (minutes >= 0 && minutes <= 60) ? minutes : 0;
		this.hours = (hours >= 0 && hours <= 24) ? hours : 0;
	}

	public int getSeconds() {
		return seconds;
	}

	public int getMinutes() {
		return minutes;
	}

	public int getHours() {
		return hours;
	}

	public void setSeconds(int seconds) {
		this.seconds = (seconds >= 0 && seconds <= 60) ? seconds : 0;
	}

	public void setMinutes(int minutes) {
		this.minutes = (minutes >= 0 && minutes <= 60) ? minutes : 0;
	}

	public void setHours(int hours) {
		this.hours = (hours >= 0 && hours <= 24) ? hours : 0;
	}

}
