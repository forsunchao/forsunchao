package org.lxh.inputstreamdemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamDemo02 {
	public static void main(String[] args) throws Exception {
		File file = new File("d:" + File.separator + "demo.txt"); // Ҫ�������ļ�
		InputStream input = null; // �ֽ�������
		input = new FileInputStream(file);// ͨ���������ʵ��������
		byte b[] = new byte[(int)file.length()];// ���ٿռ���ն�ȡ������
		for(int i=0;i<b.length;i++){
			b[i] = (byte)input.read() ;	// һ�����Ķ�ȡ����
		}
		System.out.println(new String(b)); // ������ݣ�ֱ��ת��
		input.close(); // �ر�
	}

}
