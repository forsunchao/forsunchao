package org.lxh.systemdemo;

public class SystemDemo01 {
	public static void main(String[] args) {
		long begin = System.currentTimeMillis(); // ȡ�õ�ǰʱ��
		String str = "";
		for (int i = 0; i < 10000; i++) {
			str += i; // ���������������
		}
		long end = System.currentTimeMillis(); // ȡ�õ�ǰʱ��
		System.out.println(end - begin);// ȡ�ü����ʱ��
	}

}
