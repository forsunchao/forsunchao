package org.lxh.filedemo;

import java.io.File;

public class ExistsFileDemo {

	public static void main(String[] args) {
		File file = new File("d:" + File.separator + "demo.txt"); // �ҵ�File���ʵ��
		if (file.exists()) {// �ж��ļ��Ƿ����
			System.out.println("�ļ����ڡ�");
		}else{
			System.out.println("�ļ������ڡ�") ;
		}
	}

}
