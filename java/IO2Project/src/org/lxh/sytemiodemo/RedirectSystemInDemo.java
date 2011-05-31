package org.lxh.sytemiodemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class RedirectSystemInDemo {
	public static void main(String[] args) throws Exception {
		File file = new File("d:" + File.separator + "demo.txt");
		System.setIn(new FileInputStream(file));
		InputStream input = System.in;
		byte b[] = new byte[20]; // 开辟空间接收内容
		int len = input.read(b); // 接收内容
		System.out.println("内容是：" + new String(b, 0, len));
	}

}
