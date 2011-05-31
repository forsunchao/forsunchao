package org.lxh.datedemo;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateTime {
	private Calendar calendar = new GregorianCalendar(); // ʵ����Calendar����

	public String getDate() {// 2009-03-02
		StringBuffer buf = new StringBuffer();
		buf.append(calendar.get(Calendar.YEAR)).append("-");
		buf.append(this.addZero((calendar.get(Calendar.MONTH) + 1), 2)).append(
				"-");
		buf.append(this.addZero(calendar.get(Calendar.DAY_OF_MONTH), 2));
		return buf.toString();
	}

	public String getDateTime() {// 2009-03-02 16:19:34.123
		StringBuffer buf = new StringBuffer();
		buf.append(this.getDate()).append(" ");
		buf.append(this.addZero(calendar.get(Calendar.HOUR_OF_DAY), 2)).append(
				":");
		buf.append(this.addZero(calendar.get(Calendar.MINUTE), 2)).append(":");
		buf.append(this.addZero(calendar.get(Calendar.SECOND), 2)).append(".");
		buf.append(this.addZero(calendar.get(Calendar.MILLISECOND), 3));
		return buf.toString();
	}

	public String getDateComplete() {// 2009��03��02��
		StringBuffer buf = new StringBuffer();
		buf.append(calendar.get(Calendar.YEAR)).append("��");
		buf.append(this.addZero((calendar.get(Calendar.MONTH) + 1), 2)).append(
				"��");
		buf.append(this.addZero(calendar.get(Calendar.DAY_OF_MONTH), 2))
				.append("��");
		return buf.toString();
	}

	public String getDateTimeComplete() {// 2009��03��02��16ʱ19��34��123����
		StringBuffer buf = new StringBuffer();
		buf.append(this.getDateComplete());
		buf.append(this.addZero(calendar.get(Calendar.HOUR_OF_DAY), 2)).append(
				"ʱ");
		buf.append(this.addZero(calendar.get(Calendar.MINUTE), 2)).append("��");
		buf.append(this.addZero(calendar.get(Calendar.SECOND), 2)).append("��");
		buf.append(this.addZero(calendar.get(Calendar.MILLISECOND), 3)).append(
				"����");
		return buf.toString();
	}

	private String addZero(int temp, int len) {
		StringBuffer str = new StringBuffer();
		str.append(temp);// ��������
		while (str.length() < len) {
			str.insert(0, 0); // �ڵ�һ��λ�ü�����ĸ0
		}
		return str.toString();
	}

	public static void main(String args[]) {
		System.out.println(new DateTime().getDateTimeComplete());
	}
}
