package org.lxh.filedemo;

import java.io.File;

public class IsDemo {
	public static void main(String[] args) {
		File file1 = new File("d:" + File.separator + "demo.txt");
		File file2 = new File("d:" + File.separator + "docs");
		System.out.println(file1.isFile());// �ж��Ƿ����ļ�
		System.out.println(file2.isDirectory());// �ж��Ƿ���Ŀ¼
	}

}
