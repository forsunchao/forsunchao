package org.lxh.filedemo;

import java.io.File;
import java.io.IOException;

public class MkDirDemo {

	public static void main(String[] args) {
		File file = new File("d:" + File.separator + "demo" + File.separator
				+ "test.txt"); // �ҵ�File���ʵ��
		file.getParentFile().mkdir();// ����d:\demo�ļ���
		try {
			file.createNewFile(); // �����ļ�
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
