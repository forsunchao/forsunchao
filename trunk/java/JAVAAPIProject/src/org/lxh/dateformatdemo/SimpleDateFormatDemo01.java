package org.lxh.dateformatdemo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo01 {
	public static void main(String[] args) throws Exception {
		String str = "2009-03-03 09:21:35.345";
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
		SimpleDateFormat sdf2 = new SimpleDateFormat(
				"yyyy��MM��dd�� hhʱmm��ss��SSS����");
		Date date = sdf1.parse(str);// ��ȡ��ʽ�е�����
		String newStr = sdf2.format(date);// �ı��ʽ
		System.out.println("ת��֮������ڣ�" + newStr);
	}

}
