package com.javalec.base;

import java.util.Calendar;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar alendar = Calendar.getInstance();
		
		int year = alendar.get(Calendar.YEAR);
		int month = alendar.get(Calendar.MONTH) + 1;
		int day = alendar.get(Calendar.DAY_OF_MONTH);
		
		int hour = alendar.get(Calendar.HOUR_OF_DAY);
		int minute = alendar.get(Calendar.MINUTE);
		int second = alendar.get(Calendar.SECOND);
		
		
		
		System.out.println(year +":"+ month +":"+ day);		
		System.out.println(hour + ":" + minute + ":" + second);
	}

}
