package org.lxh.regextdemo;

public class RegexDemo02 {

	public static void main(String[] args) {
		String str = "121s34123414123";
		if (str.matches("\\d+")) {// ʹ������
			System.out.println("�ַ�������������ɣ�");
		} else {
			System.out.println("�ַ���������������ɣ�");
		}
	}
}
