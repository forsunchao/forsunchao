package org.lxh.filedemo;

import java.io.File;
import java.io.IOException;

public class CreateDeleteFileDemo {

	public static void main(String[] args) {
		File file = new File("d:" + File.separator + "demo.txt"); // �ҵ�File���ʵ��
		if (file.exists()) {// ����ļ�����
			file.delete();
		} else { // �ļ�������ɾ��
			try {
				file.createNewFile(); // �����ļ�
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
