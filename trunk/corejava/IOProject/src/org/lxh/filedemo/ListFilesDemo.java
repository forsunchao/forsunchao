package org.lxh.filedemo;

import java.io.File;

public class ListFilesDemo {

	public static void main(String[] args) {
		File file = new File("d:" + File.separator + "docs"); // �ҵ�File���ʵ��
		File path[] = file.listFiles(); // �г�ȫ�������ļ����ļ���
		for (int i = 0; i < path.length; i++) {
			System.out.print(path[i].getParent() + " --> ");
			System.out.println(path[i].getPath());
		}
	}

}
