package org.lxh.outputstreamdemo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutputStreamDemo {
	public static void main(String[] args) throws Exception {
		File file = new File("d:" + File.separator + "demo.txt"); // Ҫ�������ļ�
		OutputStream out = null; // �����ֽ������
		out = new FileOutputStream(file); // ͨ������ʵ����
		String str = "hello world"; // Ҫ�������Ϣ
		byte b[] = str.getBytes(); // ��String��Ϊbyte����
		out.write(b); // д������
	}

}
