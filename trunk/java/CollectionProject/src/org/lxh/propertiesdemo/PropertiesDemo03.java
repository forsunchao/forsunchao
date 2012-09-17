package org.lxh.propertiesdemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo03 {

	public static void main(String[] args) {
		Properties pro = new Properties();
		try {
			pro.load(new FileInputStream(new File("d:" + File.separator
					+ "area.properties")));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("���Դ��ڣ�" + pro.getProperty("BJ"));
		System.out.println("���Բ����ڣ�" + pro.getProperty("SC"));
		System.out.println("���Բ����ڣ�ָ��Ĭ��ֵ��" + pro.getProperty("SC", "û�д����ԣ�"));
	}
}