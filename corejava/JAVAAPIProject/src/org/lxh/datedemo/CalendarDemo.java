package org.lxh.datedemo;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarDemo {
	public static void main(String[] args) {
		Calendar calendar = new GregorianCalendar();
		System.out.println("��: " + calendar.get(Calendar.YEAR));
		System.out.println("��: " + (calendar.get(Calendar.MONTH) + 1));
		System.out.println("��: " + calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println("ʱ: " + calendar.get(Calendar.HOUR_OF_DAY));
		System.out.println("��: " + calendar.get(Calendar.MINUTE));
		System.out.println("��: " + calendar.get(Calendar.SECOND));
		System.out.println("����: " + calendar.get(Calendar.MILLISECOND));
	}
}
