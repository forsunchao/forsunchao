package org.lxh.sytemiodemo;

import java.io.OutputStream;

public class SysteOutDemo {
	public static void main(String[] args) throws Exception {
		OutputStream out = System.out; // ��ʱ�߱�������Ļ���������
		out.write("hello world".getBytes());// �������
		out.close();
	}

}
