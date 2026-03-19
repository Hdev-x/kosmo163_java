package com.hdev.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class CalendarMain3 {

	public static void main(String[] args) {
		LocalDateTime t = LocalDateTime.now();
		System.out.println(t);
		LocalDate d = LocalDate.now();
		System.out.println(d);
		LocalTime l = LocalTime.now();
		System.out.println(l);
		
		String time = "2026-05-05T13:25:02";
		LocalDateTime ld = LocalDateTime.parse(time);
		System.out.println(ld.getYear());
		
		time = "2027-07-07 12:05:32";
		DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		ld = LocalDateTime.parse(time, df);
		System.out.println(ld);
				
		
		

	}

}
