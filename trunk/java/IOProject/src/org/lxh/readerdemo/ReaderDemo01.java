package org.lxh.readerdemo;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;

public class ReaderDemo01 {
	public static void main(String[] args) throws Exception {
		File file = new File("d:" + File.separator + "demo.txt"); // Ҫ�������ļ�
		Reader input = null; // �ַ�������
		input = new FileReader(file);// ͨ���������ʵ��������
		char b[] = new char[1024];// ���ٿռ���ն�ȡ������
		int len = input.read(b); // �����ݶ��뵽byte������
		System.out.println(new String(b, 0, len)); // �������
		input.close(); // �ر�
	}

}
