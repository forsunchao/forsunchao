package org.lxh.filedemo;

import java.io.File;

public class ListDemo {

	public static void main(String[] args) {
		File file = new File("d:" + File.separator + "docs"); // �ҵ�File���ʵ��
		String path[] = file.list(); // �г�ȫ��������
		for (int i = 0; i < path.length; i++) {
			System.out.println(path[i]) ;
		}
	}

}
