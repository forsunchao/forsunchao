package org.lxh.propertiesdemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo05 {

	public static void main(String[] args) {
		Properties pro = new Properties();
		try {
			pro.loadFromXML(new FileInputStream(new File("d:" + File.separator
					+ "area.xml")));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("属性存在：" + pro.getProperty("BJ"));
		System.out.println("属性不存在：" + pro.getProperty("SC"));
		System.out.println("属性不存在，指定默认值：" + pro.getProperty("SC", "没有此属性！"));
	}
}
