package org.lxh.adddemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AddDemo02 {

	public static void main(String[] args) {
		BufferedReader buf = null;
		// ���ֽ���������Ϊ�ַ������������ַ����Ļ�����֮��
		buf = new BufferedReader(new InputStreamReader(System.in));
		int i = 0;// ���յ�һ������
		int j = 0;// ���յڶ�������
		String str = null;
		boolean flag = true;// ����һ����־λ
		System.out.print("�������һ�����֣�");
		while (flag) {
			try {
				str = buf.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			if (str.matches("\\d+")) {
				i = Integer.parseInt(str);
				flag = false;// �˳�ѭ��
			} else {
				System.out.print("�����������֣����������룺");
			}
		}
		flag = true ;
		System.out.print("������ڶ������֣�");
		while (flag) {
			try {
				str = buf.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			if (str.matches("\\d+")) {
				j = Integer.parseInt(str);
				flag = false;// �˳�ѭ��
			} else {
				System.out.print("�����������֣����������룺");
			}
		}
		System.out.println("������Ӳ�����" + i + " + " + j + " = " + (i + j));
	}

}
