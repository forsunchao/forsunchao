package org.lxh.outputstreamdemo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class AppendOutputStreamDemo {
	public static void main(String[] args) throws Exception {
		File file = new File("d:" + File.separator + "demo.txt"); // Ҫ�������ļ�
		OutputStream out = null; // �����ֽ������
		out = new FileOutputStream(file, true); // ͨ������ʵ��������ʾ׷��
		String str = "hello world \r\n"; // Ҫ�������Ϣ����\r\n����ʾ����
		byte b[] = str.getBytes(); // ��String��Ϊbyte����
		out.write(b); // д������
		out.close(); // �ر�
	}

}
