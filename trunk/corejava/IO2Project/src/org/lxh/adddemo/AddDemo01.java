package org.lxh.adddemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AddDemo01 {

	public static void main(String[] args) {
		BufferedReader buf = null;
		// ���ֽ���������Ϊ�ַ������������ַ����Ļ�����֮��
		buf = new BufferedReader(new InputStreamReader(System.in));
		int i = 0;// ���յ�һ������
		int j = 0;// ���յڶ�������
		String str = null;
		System.out.print("�������һ�����֣�");
		try {
			str = buf.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		i = Integer.parseInt(str);
		System.out.print("������ڶ������֣�");
		try {
			str = buf.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		j = Integer.parseInt(str);
		System.out.println("������Ӳ�����" + i + " + " + j + " = " + (i + j));
	}

}
