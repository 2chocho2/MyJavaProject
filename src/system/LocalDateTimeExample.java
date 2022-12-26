package system;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeExample {

	public static void main(String[] args) {
		
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		System.out.println("현재 시간: " + now.format(dtf));
		
		LocalDateTime nowPlusOneYear = now.plusYears(1);
		System.out.println("1년 후: " + nowPlusOneYear.format(dtf));
		
		LocalDateTime nowBeforeTwoMonth = now.minusMonths(2);
		System.out.println("2달 전: " + nowBeforeTwoMonth.format(dtf));
		
		LocalDateTime nowPlusSevenDays = now.plusDays(7);
		System.out.println("일주일 후: " + nowPlusSevenDays.format(dtf));
		
		LocalDateTime startDateTime = LocalDateTime.of(2022,12,7,9,30,0);
		System.out.println("시작일: " + startDateTime.format(dtf) );
		
		LocalDateTime endDateTime = LocalDateTime.of(2023, 6,5,18,30,0);
		System.out.println("종료일: " + endDateTime.format(dtf));
		
		long remainYear = startDateTime.until(endDateTime, ChronoUnit.YEARS);
		long remainMonth = startDateTime.until(endDateTime, ChronoUnit.MONTHS);
		long totalDay = startDateTime.until(endDateTime, ChronoUnit.DAYS);
		long remainDay = now.until(endDateTime, ChronoUnit.DAYS);
		
		System.out.println("전체 년 수: " +remainYear);
		System.out.println("전체 개월 수: " + remainMonth);
	}
}
