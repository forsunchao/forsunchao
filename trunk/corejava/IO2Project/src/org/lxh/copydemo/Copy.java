package org.lxh.copydemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Copy {

	public static void main(String[] args) throws Exception {// �����쳣�׳�
		if (args.length != 2) { // ������������
			System.out.println("�������﷨����ȷ��Ӧ������Ҫ�������ļ�·����");
			System.out.println("����java Copy Դ�ļ�·�� Ŀ���ļ�·��");
			System.exit(1); // ϵͳ�˳�
		}
		if (args[0].equals(args[1])) {
			System.out.println("�޷����������ļ���");
			System.exit(1); // ϵͳ�˳�
		}
		File file1 = new File(args[0]); // �ҵ���һ���ļ���File����
		if (file1.exists()) {
			File file2 = new File(args[1]); // �ҵ�Ŀ���ļ�·��
			InputStream input = new FileInputStream(file1); // ������
			OutputStream output = new FileOutputStream(file2);// �����
			int temp = 0; // ����һ��������ʾ���յ�����
			while ((temp = input.read()) != -1) { // ��ʾ�������ݿ��Լ�����
				output.write(temp);// д������
			}
			System.out.println("�ļ����Ƴɹ���");
			input.close(); // �ر�
			output.close();// �ر�
		} else {
			System.out.println("Դ�ļ������ڡ�");
		}
	}

}
