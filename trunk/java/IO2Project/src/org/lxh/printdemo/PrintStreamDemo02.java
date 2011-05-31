package org.lxh.printdemo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamDemo02 {

	public static void main(String[] args) throws Exception {
		File file = new File("d:" + File.separator + "demo.txt");
		PrintStream out = new PrintStream(new FileOutputStream(file));
		String name = "���˻�";
		int age = 3;
		float score = 99.9f;
		char sex = 'M';
		out.printf("������%s�����䣺%d���ɼ���%5.2f���Ա�%c��", name, age, score, sex);
		out.close();
	}

}
