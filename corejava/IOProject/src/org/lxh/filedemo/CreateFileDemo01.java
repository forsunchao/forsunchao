package org.lxh.filedemo;

import java.io.File;
import java.io.IOException;

public class CreateFileDemo01 {

	public static void main(String[] args) {
		File file = new File("d:\\demo.txt"); // �ҵ�File���ʵ��
		try {
			file.createNewFile(); // �����ļ�
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
