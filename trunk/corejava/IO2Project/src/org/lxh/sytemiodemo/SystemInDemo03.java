package org.lxh.sytemiodemo;

import java.io.InputStream;

public class SystemInDemo03 {

	public static void main(String[] args) throws Exception {
		InputStream input = System.in; // ׼��������������
		System.out.print("���������ݣ�");
		int temp = 0; // ��������
		StringBuffer buf = new StringBuffer();
		while ((temp = input.read()) != -1) {
			char c = (char) temp; // ת��
			if (c == '\n') {// �ж��Ƿ��ǻس�
				break;// �˳�ѭ��
			}
			buf.append(c);
		}
		System.out.println("����������ǣ�" + buf);
	}
}
