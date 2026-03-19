package com.hdev.util;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarMain1 {

	public static void main(String[] args) {
		//현재 날짜와 시간정보가 들어감
		Calendar calendar = Calendar.getInstance();
		Calendar out = Calendar.getInstance();
		
//		calendar.set(Calendar.YEAR, 2030);
//		calendar.set(Calendar.MONTH, 3);
		out.set(Calendar.HOUR, 11);
		Date date = calendar.getTime();
		
		System.out.println(date);
		
		int h = calendar.get(Calendar.HOUR_OF_DAY);
		int s = calendar.get(Calendar.SECOND);
		int y = calendar.get(Calendar.YEAR);
		int m = calendar.get(Calendar.MONTH);
		
		
		
		
		System.out.println(h);
		System.out.println(s);
		System.out.println(y);
		System.out.println(m);
		
		//들어간시간
		long in = calendar.getTimeInMillis();
		long ou = out.getTimeInMillis();
		long result = ou-in;
		System.out.println(result);
		result = result / 1000;
		System.out.println(result);
		result = result / 60;
		System.out.println(result);
		result = result / 60;
		System.out.println(result);
		
		
				
		
		

	}

}
