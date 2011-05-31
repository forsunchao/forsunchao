package test.System;

import java.util.Enumeration;
import java.util.Properties;

public class TestSystemProperty {
	public static void main(String args[]) {
		// 取得系统属性列表
		Properties properties = System.getProperties();
		Enumeration<Object> e = properties.keys();
		while (e.hasMoreElements()) {
			String key = (String)e.nextElement();// 键
			String value = properties.getProperty(key);// 值
			System.out.println(key + "=" + value);
		}
		
		// 取得某一个系统属性
		String osname = System.getProperty("os.name");// 取得os.name
		String osversion = System.getProperty("os.version");// 取得os.version
		String javaname = System.getProperty("java.vm.name");// 取得java.vm.name
		String javaversion = System.getProperty("java.version");// 取得java.version
		System.out.println("操作系统名称=" + osname);
		System.out.println("操作系统版本=" + osversion);
		System.out.println("JVM名称=" + javaname);
		System.out.println("Java版本=" + javaversion);

		System.setProperty("java.version2", "aa");
		System.setProperty("java.version2", "aa");
		String javaversion2 = System.getProperty("java.version2");
		System.out.println("Java版本=" + javaversion2);
	}
}
