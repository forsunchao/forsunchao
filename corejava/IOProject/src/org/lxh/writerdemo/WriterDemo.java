package org.lxh.writerdemo;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

public class WriterDemo {
	public static void main(String[] args) throws Exception {
		File file = new File("d:" + File.separator + "demo.txt"); // Ҫ�������ļ�
		Writer out = null; // �����ַ������
		out = new FileWriter(file); // ͨ������ʵ����
		String str = "hello world"; // Ҫ�������Ϣ
		out.write(str); // д������
		out.flush(); // ˢ��
	}

}
