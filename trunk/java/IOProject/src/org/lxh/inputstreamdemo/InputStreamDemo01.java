package org.lxh.inputstreamdemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamDemo01 {
	public static void main(String[] args) throws Exception {
		File file = new File("d:" + File.separator + "demo.txt"); // Ҫ�������ļ�
		InputStream input = null; // �ֽ�������
		input = new FileInputStream(file);// ͨ���������ʵ��������
		byte b[] = new byte[1024];// ���ٿռ���ն�ȡ������
		int len = input.read(b); // �����ݶ��뵽byte������
		System.out.println(new String(b, 0, len)); // �������
		input.close(); // �ر�
	}

}
