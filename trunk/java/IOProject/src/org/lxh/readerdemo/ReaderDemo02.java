package org.lxh.readerdemo;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;

public class ReaderDemo02 {
	public static void main(String[] args) throws Exception {
		File file = new File("d:" + File.separator + "demo.txt"); // Ҫ�������ļ�
		Reader input = null; // �ֽ�������
		input = new FileReader(file);// ͨ���������ʵ��������
		char b[] = new char[(int)file.length()];// ���ٿռ���ն�ȡ������
		for(int i=0;i<b.length;i++){
			b[i] = (char)input.read() ;	// һ�����Ķ�ȡ����
		}
		System.out.println(new String(b)); // ������ݣ�ֱ��ת��
		input.close(); // �ر�
	}

}
