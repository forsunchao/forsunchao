package org.lxh.localedemo;

import java.util.Locale;
import java.util.ResourceBundle;

public class LocaleDemo01 {
	public static void main(String[] args) {
		Locale loc = Locale.getDefault(); // �õ�Ĭ�ϵ�Locale
		// Ҫ�ҵ�Message�������ļ�����ʱ����ʱʡ���˺�׺����ָ���˲���������
		ResourceBundle rb = ResourceBundle.getBundle("Message", loc);
		String value = rb.getString("info") ;	// ����key�ҵ�����
		System.out.println("����Ϊ��" + value);
	}

}
