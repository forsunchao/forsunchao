package org.lxh.writerdemo;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

public class AppendWriterDemo01 {
	public static void main(String[] args) throws Exception {
		File file = new File("d:" + File.separator + "demo.txt"); // Ҫ�������ļ�
		Writer out = null; // �����ַ������
		out = new FileWriter(file,true); // ͨ������ʵ��������ʾ����׷��
		String str = "hello world\r\n"; // Ҫ�������Ϣ
		out.write(str); // д������
		out.close(); // �ر�
	}

}
