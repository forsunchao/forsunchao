package net.njetc.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class TestDateFormat {

	/**
	 * ��ʽ������
	 */
	public static void main(String[] args) {
		//��Ĭ�ϵ�ģʽ��Ĭ�����Ի��������ڸ�ʽ���Ź��� SimpleDateFormat
		DateFormat  df= new SimpleDateFormat("yyyy-MM-HH mm:ss:SS a");
		System.out.println(df.format(new Date()));
        //�ø�����ģʽ�͸������Ի�����Ĭ�����ڸ�ʽ���Ź��� SimpleDateFormat
		df= new SimpleDateFormat("yyyy-MM-KK mm:ss:SS a",Locale.US);
		System.out.println(df.format(new Date()));

	}

}
