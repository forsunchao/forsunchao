package org.lxh.dateformatdemo;

import java.text.DateFormat;
import java.util.Date;

public class DateFormatDemo02 {
	public static void main(String[] args) {
		Date date = new Date();
		DateFormat formatDate = DateFormat.getDateInstance(DateFormat.FULL);
		DateFormat formatDatetime = DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.FULL);
		System.out.println(formatDate.format(date)); // ��ʽ������
		System.out.println(formatDatetime.format(date)); // ��ʽ������
	}

}
