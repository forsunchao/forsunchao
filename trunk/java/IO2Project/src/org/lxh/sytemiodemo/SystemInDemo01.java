package org.lxh.sytemiodemo;

import java.io.InputStream;

public class SystemInDemo01 {

	public static void main(String[] args) throws Exception {
		InputStream input = System.in; // ׼��������������
		byte b[] = new byte[20]; // ���ٿռ��������
		System.out.print("���������ݣ�");
		int len = input.read(b); // ��������
		System.out.println("����������ǣ�" + new String(b, 0, len));
	}
}
