package net.njetc.date;

import java.util.Calendar;

public class TestCalendar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.print(TestCalendar.getDataAsYYMMDDMMSS());
	}

	public  static String getDataAsYYMMDDMMSS() {
		Calendar  calendar=Calendar.getInstance();
		//��ȡ��ǰʱ���������Сʱ���ӷ���
		StringBuffer srtBuf=new StringBuffer();
		srtBuf.append(calendar.get(Calendar.YEAR));
		srtBuf.append("-");
		srtBuf.append(calendar.get(Calendar.MONTH)+1);
		srtBuf.append("-");
		srtBuf.append(calendar.get(Calendar.DATE));
		srtBuf.append("  ");
		srtBuf.append(calendar.get(Calendar.HOUR));
		srtBuf.append(":");
		srtBuf.append(calendar.get(Calendar.MINUTE));
		srtBuf.append(":");
		srtBuf.append(calendar.get(Calendar.SECOND));
		return srtBuf.toString();
		
	}
	
	
}
