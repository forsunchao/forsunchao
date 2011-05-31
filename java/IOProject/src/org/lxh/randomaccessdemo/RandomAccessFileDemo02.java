package org.lxh.randomaccessdemo;

import java.io.File;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo02 {
	public static void main(String[] args) throws Exception {// �����쳣�׳�
		File file = new File("d:" + File.separator + "demo.txt");// ָ��Ҫ�������ļ�
		RandomAccessFile raf = new RandomAccessFile(file, "r");// �Զ�����ʽ���в���
		byte b[] = null;// �����ֽ�����
		String name = null;
		int age = 0;
		b = new byte[8];
		raf.skipBytes(12); // �����һ���˵���Ϣ
		System.out.println("�ڶ����˵���Ϣ��");
		for (int i = 0; i < 8; i++) {
			b[i] = raf.readByte(); // ��ȡ�ֽ�
		}
		age = raf.readInt();// ��ȡ����
		System.out.println("\t|- ������" + new String(b));
		System.out.println("\t|- ���䣺" + age);
		raf.seek(0);// �ص���ʼλ��
		System.out.println("��һ���˵���Ϣ��");
		for (int i = 0; i < 8; i++) {
			b[i] = raf.readByte(); // ��ȡ�ֽ�
		}
		age = raf.readInt();// ��ȡ����
		System.out.println("\t|- ������" + new String(b));
		System.out.println("\t|- ���䣺" + age);
		raf.skipBytes(12); // ����ڶ����˵���Ϣ
		System.out.println("�������˵���Ϣ��");
		for (int i = 0; i < 8; i++) {
			b[i] = raf.readByte(); // ��ȡ�ֽ�
		}
		age = raf.readInt();// ��ȡ����
		System.out.println("\t|- ������" + new String(b));
		System.out.println("\t|- ���䣺" + age);
		raf.close();// �ļ����������һ��Ҫ�ر�
	}
}
