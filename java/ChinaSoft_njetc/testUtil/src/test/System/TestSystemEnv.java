package test.System;

import java.util.Iterator;
import java.util.Map;

public class TestSystemEnv {
	public static void main(String args[]) {
		
		// 取得环境变量列表
		Map<String, String> map = System.getenv();
		Iterator<String> it = map.keySet().iterator();
		while (it.hasNext()) {
			String key = it.next();// 键
			String value = map.get(key);// 值
			System.out.println(key + "=" + value);
		}
		
		// 取得某一个环境变量
		String javahome = System.getenv("JAVA_HOME");// 取得JAVA_HOME
		String path = System.getenv("PATH");// 取得PATH
		String classpath = System.getenv("CLASSPATH");// 取得CLASSPATH
		System.out.println("javahome=" + javahome);
		System.out.println("path=" + path);
		System.out.println("classpath=" + classpath);
	}
}
