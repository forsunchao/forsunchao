package org.lxh.bytearraydemo;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

public class ByteArraDemo {

	public static void main(String[] args) {
		String str = "helloworld"; // �����ַ�����ȫ����Сд��ĸ���
		ByteArrayOutputStream bos = null; // �ڴ������
		ByteArrayInputStream bis = null; // �ڴ�������
		bis = new ByteArrayInputStream(str.getBytes()); // �����ݱ������ڴ�֮��
		bos = new ByteArrayOutputStream(); // �ڴ������
		int temp = 0;
		while ((temp = bis.read()) != -1) {// ���ζ�ȡ
			char c = (char) temp; // �����ַ�
			bos.write(Character.toUpperCase(c)); // ���
		}
		String newStr = bos.toString();// ȡ���ڴ����������
		System.out.println(newStr);
	}

}
