package misc.datetime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class JavaDateTime {
	public static void main(String[] args) {
		
		LocalDateTime currentTime = LocalDateTime.now();
		System.out.println(currentTime);
		
		int monthValue = currentTime.getMonthValue();
		
		System.out.println(monthValue);
		
		LocalDate localDate = currentTime.toLocalDate();
		System.out.println(localDate);
		
		/*String str = "02-11-19";
		LocalTime parse = LocalTime.parse(str);
		System.out.println(parse);*/
		
		Date date = new Date();
		Instant instant = date.toInstant();
		ZoneId currentZone = ZoneId.systemDefault();
		System.out.println(currentZone);
		LocalDateTime zdt = LocalDateTime.ofInstant(instant, currentZone);
		System.out.println(zdt);
		System.out.println("-----------------------");
		ZonedDateTime zdt1 = ZonedDateTime.ofInstant(instant, currentZone);
		System.out.println(zdt1);
		
		ZonedDateTime zdt2 = ZonedDateTime.now();
		System.out.println(zdt2);
	}

}
