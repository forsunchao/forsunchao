package org.lxh.dateformatdemo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo02 {
	public static void main(String[] args) throws Exception {
		String str = args[0].trim();// ���ղ���
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
		Date date = sdf.parse(str);// ��ȡ��ʽ�е�����
		System.out.println(date);
	}

}
