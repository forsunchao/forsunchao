package org.lxh.filedemo;

import java.io.File;

public class DeleteFileDemo {

	public static void main(String[] args) {
		File file = new File("d:\\demo.txt"); // �ҵ�File���ʵ��
		file.delete() ;// ɾ���ļ�
	}

}
