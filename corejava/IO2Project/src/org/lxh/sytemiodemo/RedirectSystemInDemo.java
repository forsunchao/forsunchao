package org.lxh.sytemiodemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class RedirectSystemInDemo {
	public static void main(String[] args) throws Exception {
		File file = new File("d:" + File.separator + "demo.txt");
		System.setIn(new FileInputStream(file));
		InputStream input = System.in;
		byte b[] = new byte[20]; // ���ٿռ��������
		int len = input.read(b); // ��������
		System.out.println("�����ǣ�" + new String(b, 0, len));
	}

}
