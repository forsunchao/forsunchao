package org.lxh.dateformatdemo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTime {
	private SimpleDateFormat sdf = null;

	public String getDate() {// 2009-03-02
		this.sdf = new SimpleDateFormat("yyyy-MM-dd");
		String str = this.sdf.format(new Date());
		return str;
	}

	public String getDateTime() {// 2009-03-02 16:19:34.123
		this.sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
		String str = this.sdf.format(new Date());
		return str;
	}

	public String getDateComplete() {// 2009��03��02��
		this.sdf = new SimpleDateFormat("yyyy��MM��dd��");
		String str = this.sdf.format(new Date());
		return str;
	}

	public String getDateTimeComplete() {// 2009��03��02��16ʱ19��34��123����
		this.sdf = new SimpleDateFormat("yyyy��MM��dd�� hhʱmm��ss��SSS����");
		String str = this.sdf.format(new Date());
		return str;
	}

	public String getDateTimeStamp(){
		this.sdf = new SimpleDateFormat("yyyyMMddhhmmssSSS");
		String str = this.sdf.format(new Date());
		return str;
	}

	public static void main(String args[]) {
		DateTime dt = new DateTime() ;
		System.out.println(dt.getDateTimeComplete());
		System.out.println(dt.getDateTime());
		System.out.println(dt.getDateTimeStamp());
	}
}
