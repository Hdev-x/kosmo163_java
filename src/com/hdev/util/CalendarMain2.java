package com.hdev.util;

import java.util.Calendar;
import java.util.Date;

public class CalendarMain2 {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.getTime());
		calendar.add(Calendar.MINUTE, 30);
		System.out.println(calendar.getTime());
		calendar.roll(Calendar.MINUTE, 60);
		System.out.println(calendar.getTime());
		
		
		

	}

}
