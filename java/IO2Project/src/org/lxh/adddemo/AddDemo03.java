package org.lxh.adddemo;


public class AddDemo03 {

	public static void main(String[] args) {
		InputData input = new InputData();
		int i = input.getInt("�������һ�����֣�", "��������ݱ��������֣�");// ���յ�һ������
		int j = input.getInt("�������һ�����֣�", "��������ݱ��������֣�");// ���յڶ�������
		System.out.println("������Ӳ�����" + i + " + " + j + " = " + (i + j));
	}

}
