package org.business.util;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeUtil {

	private final static String dateFormat_yyyymmddhhmiss_underscore = "yyyy-MM-dd HH:mm:ss";
//	private final static SimpleDateFormat sdf = new SimpleDateFormat(dateFormat_yyyymmddhhmiss_underscore);
	private final static DateTimeFormatter dtf = DateTimeFormatter.ofPattern(dateFormat_yyyymmddhhmiss_underscore);
	
	public static String getCurrentTime(){
//		return sdf.format(new Date());
		return LocalDateTime.now().format(dtf);
	}
	
	public static String getCurrentYear(){
		return String.valueOf(LocalDate.now().getYear());
	}
	
	public static String getCurrentMonth(){
		return String.valueOf(LocalDate.now().getMonthValue());
	}
	
	
	
	public static long getSecondDuration(String beginTime, String endTime){
		return Duration.between(Instant.parse(beginTime), Instant.parse(endTime)).getSeconds();
	}
	
	
}
