package system;

import java.util.Calendar;
import java.util.TimeZone;

public class CalendarExample {

	public static void main(String[] args) {
		TimeZone timeZone = TimeZone.getTimeZone("America/Los_Angeles");
		
		Calendar now = Calendar.getInstance(timeZone);
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH)+1; // 월은 0부터 출력
		int day = now.get(Calendar.DAY_OF_MONTH);
		int week = now.get(Calendar.DAY_OF_WEEK); 
		
		String strWeek = "";
		switch(week) {
		case Calendar.MONDAY: strWeek = "월요일"; break;
		case Calendar.TUESDAY: strWeek = "화요일"; break;
		case Calendar.WEDNESDAY: strWeek = "수요일"; break;
		case Calendar.THURSDAY: strWeek = "목요일"; break;
		case Calendar.FRIDAY: strWeek = "금요일"; break;
		case Calendar.SATURDAY: strWeek = "토요일"; break;
		case Calendar.SUNDAY: strWeek = "일요일"; break;
		
		}
		
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
		System.out.println(strWeek);
	}
}
