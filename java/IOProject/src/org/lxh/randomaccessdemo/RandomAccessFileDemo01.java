package org.lxh.randomaccessdemo;

import java.io.File;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo01 {
	public static void main(String[] args) throws Exception {// �����쳣�׳�
		File file = new File("d:" + File.separator + "demo.txt");// ָ��Ҫ�������ļ�
		RandomAccessFile raf = new RandomAccessFile(file, "rw");// �Զ�д����ʽ���в���
		// д���һ������
		String name = "zhangsan";// ��ʾ����
		int age = 30; // ��ʾ����
		raf.writeBytes(name); // ���ֽڵķ�ʽ���ַ���д��
		raf.writeInt(age); // д����������
		// д��ڶ�������
		name = "lisi    ";// ��ʾ����
		age = 31; // ��ʾ����
		raf.writeBytes(name); // ���ֽڵķ�ʽ���ַ���д��
		raf.writeInt(age); // д����������
		// д�����������
		name = "wangwu  ";// ��ʾ����
		age = 32; // ��ʾ����
		raf.writeBytes(name); // ���ֽڵķ�ʽ���ַ���д��
		raf.writeInt(age); // д����������
		raf.close();// �ļ����������һ��Ҫ�ر�
	}

}
