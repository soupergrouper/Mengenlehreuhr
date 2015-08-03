package DateFormats;
import java.util.Calendar;
import java.util.Date;

public class RegularTime {

	private Calendar calendar;
	
	public RegularTime()  {
		calendar = Calendar.getInstance();
		
	}
	
	public Date getDate()  {
		return calendar.getTime();
	}
	
	public int getHours()  {
		return calendar.get(Calendar.HOUR_OF_DAY);
	}
}
