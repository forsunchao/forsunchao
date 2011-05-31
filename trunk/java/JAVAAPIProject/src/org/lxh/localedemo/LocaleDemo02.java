package org.lxh.localedemo;

import java.util.Locale;
import java.util.ResourceBundle;

public class LocaleDemo02 {
	public static void main(String[] args) {
		Locale chLoc = new Locale("zh", "CN"); // ָ�����Ļ���
		Locale enLoc = new Locale("en", "US"); // ָ��Ӣ�Ļ���
		// Ҫ�ҵ�Message�������ļ�����ʱ����ʱʡ���˺�׺����ָ���˲���������
		ResourceBundle chRb = ResourceBundle.getBundle("Message", chLoc);
		ResourceBundle enRb = ResourceBundle.getBundle("Message", enLoc);
		String zhValue = chRb.getString("info"); // ����key�ҵ�����
		String enValue = enRb.getString("info"); // ����key�ҵ�����
		System.out.println("��������Ϊ��" + zhValue);
		System.out.println("Ӣ������Ϊ��" + enValue);
	}

}
